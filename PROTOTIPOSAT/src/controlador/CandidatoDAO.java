/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.DBConexion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.serial.SerialBlob;

/**
 *
 * @author MABY
 */
public class CandidatoDAO {

    DBConexion conn;
    private static PreparedStatement pState = null;

    Connection conexion;
    Statement st;

    public CandidatoDAO() {
        conn = new DBConexion();
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String bDatos = "jdbc:oracle:thin:@localhost:1521:XE";
            conexion = DriverManager.getConnection(bDatos, "system", "oracle");
            st = conexion.createStatement();
            System.out.println("En linea");
        } catch (Exception ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean guardarImagen(Candidato candidato){
        String insert = "INSERT  INTO CANDIDATOS(NUM_BOLETA,NOMBRE,APELL_PATERNO,APELL_MAT,EMAIL ,CELULAR,CARRERA,GENERACION,DIRECTOR_TESIS,TEMA_TESIS, TRABAJA ,LUGAR_TRABAJO,HORARIO_TRABAJO,IMAGEN) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            conexion.setAutoCommit(false);
            File file = new File(candidato.getImagen());
            fis = new FileInputStream(file);
            ps = conexion.prepareStatement(insert);
            
            ps.setString(1, candidato.getBoleta());
            ps.setString(2, candidato.getNombre());
            ps.setString(3, candidato.getApellidoP());
            ps.setString(4, candidato.getApellidoM());
            ps.setString(5, candidato.getEmail());
            ps.setString(6,candidato.getCelular());
            ps.setString(7,candidato.getCarrera());
            ps.setString(8,candidato.getGeneracion());
            ps.setString(9,candidato.getDirectorTesis());
            ps.setString(10,candidato.getTemaTesis());
            ps.setString(11,candidato.getTrabaja());
            ps.setString(12,candidato.getDireccionT());
            ps.setString(13,candidato.getHorarioT());                     
            ps.setBinaryStream(14,fis,(int)file.length());
            
            ps.executeUpdate();
            conexion.commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }finally{
            try {
                ps.close();
                fis.close();
            } catch (Exception ex) {
                Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }

    public ResultSet VerPelicula() {
        try {
            Connection accesoBD = conn.getConexion();
            String sql = "SELECT NUM_BOLETA,NOMBRE,APELL_PATERNO,APELL_MAT,DIRECTOR_TESIS,TEMA_TESIS FROM TP_PELICULAS";
            Statement consulta = accesoBD.createStatement();
            return consulta.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
//    
//    public ResultSet ClickPelicula(String codigo) {
//        try {
//            Connection accesoBD = conn.getConexion();
//            String sql = "SELECT * FROM TP_PELICULAS WHERE CODIGO=" + "'" + codigo + "'";
//            Statement consulta = accesoBD.createStatement();
//            return consulta.executeQuery(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return null;
//        }
//    }
//
////     public boolean ExisteUsuario(String usuario) {
////        try {
////            Connection accesoBD = conn.getConexion();
////            String sql = "SELECT ID_TIPO_USU FROM PF_LOGIN "
////                    + "WHERE ID_USUARIO = '" + usuario + "' ";
////            Statement consulta = accesoBD.createStatement();
////            ResultSet resultado = consulta.executeQuery(sql);
////            if (resultado.next()) {
////                return true;
////            } else {
////                return false;
////            }
////        } catch (SQLException ex) {
////            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
////            return false;
////        }
////    }
////     public int numeroUsuarios() {
////        try {
////            Connection accesoBD = conn.getConexion();
////            String sql = "SELECT COUNT(*) AS NUMUSU FROM PF_USUARIO";
////            Statement consulta = accesoBD.createStatement();
////            ResultSet resultado = consulta.executeQuery(sql);
////            if (resultado.next()) {
////                return resultado.getInt("NUMUSU");
////            } else {
////                return 0;
////            }
////        } catch (SQLException ex) {
////            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
////            return 0;
////        }
////    }
//    public String BorrarPelicula(String codigo) {
//        try {
//            Connection accesoBD = conn.getConexion();
//            String sql2 = "DELETE FROM TP_PELICULAS WHERE CODIGO = '" + codigo + "'";
//            Statement consulta = accesoBD.createStatement();
//            consulta.executeQuery(sql2);
////            consulta.executeQuery(sql);
//            return "Pelicula borrado correctamente";
//        } catch (SQLException ex) {
//            Logger.getLogger(CandidatoDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return "ERROR : ocurrio un erro al borrar Pelicula";
//        }
//    }

//       public String ModificarUsuario(Usuario miUsuario) {
//
//        try {
//            Connection accesoBD = conn.getConexion();
//            String sql = "UPDATE PF_USUARIO SET "
//                    + "ID_RUB_DEL = '" + miUsuario.getIdRubro() + "', "
//                    + "NOMBRE = '" + miUsuario.getpNombres() + "', "
//                    + "SNOMBRE = '" + miUsuario.getsNombres() + "', "
//                    + "PATERNO = '" + miUsuario.getpApellido() + "', "
//                    + "MATERNO = '" + miUsuario.getmApellido() + "', "
//                    + "CORREO = '" + miUsuario.getCorreo() + "', "
//                    + "ESCOLARIDAD = '" + miUsuario.getEscolaridad() + "', "
//                    + "FEC_NACIMIENTO = TO_DATE('" + miUsuario.getFechaNacimiento() + "', 'yyyy/mm/dd'), "
//                    + "CALLE = '" + miUsuario.getCalle() + "', "
//                    + "NUM_INT = " + miUsuario.getNumInt() + ", "
//                    + "COLONIA = '" + miUsuario.getColonia() + "', "
//                    + "CP = " + miUsuario.getCp() + " "
//                    + " WHERE ID_USUARIO = '" + miUsuario.getIdUsuario() + "' ";
//
////            String sql2 = "UPDATE PF_LOGIN SET "
////                    + "ID_USUARIO = '" + miUsuario.getIdUsuario() + "', "
////                    + "ID_TIPO_USU = " + miUsuario.getPerfil() + ","
////                    + "CLAVE = '" + miUsuario.getContraseña() + "' "
////                    + "WHERE ID_USUARIO = '" + miUsuario.getIdUsuario() + "' ";
//            
//            Statement consulta = accesoBD.createStatement();
//            consulta.executeUpdate(sql);
////            consulta.executeUpdate(sql2);
//            return "Ususarios modificado correctamente";
//        } catch (SQLException ex) {
//            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
//            return "Ocurrio un error para modificar un usuario";
//        }
//    }
}
