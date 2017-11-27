/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;

/**
 *
 * @author TOM
 */
public class Candidato {
    
    String imagen;
  String nombre;
  String apellidoP;
  String apellidoM;
 String boleta;
  String email;
  String celular;
  String carrera;
  String generacion;
  String temaTesis;
  String directorTesis;
  String Trabaja;
  String DireccionT;
  String horarioT;

    public Candidato(String nombre, String apellidoP, String apellidoM, String boleta, String email, String celular, String carrera, String generacion, String temaTesis, String directorTesis) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.boleta = boleta;
        this.email = email;
        this.celular = celular;
        this.carrera = carrera;
        this.generacion = generacion;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
    }
    
public Candidato(String imagen,String nombre, String apellidoP, String apellidoM, String boleta, String email, String celular, String carrera, String generacion, String temaTesis, String directorTesis,String Trabaja, String DireccionT, String horarioT) {
        
        this.imagen=imagen;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.boleta = boleta;
        this.email = email;
        this.celular = celular;
        this.carrera = carrera;
        this.generacion = generacion;
        this.temaTesis = temaTesis;
        this.directorTesis = directorTesis;
        this.Trabaja = Trabaja;
        this.DireccionT = DireccionT;
        this.horarioT = horarioT;
    }

    public Candidato(String nombre, String apellidoP, String apellidoM, String boleta, String email, String celular) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.boleta = boleta;
        this.email = email;
        this.celular = celular;
    }

  
    
    

    

    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidoP
     */
    public String getApellidoP() {
        return apellidoP;
    }

    /**
     * @param apellidoP the apellidoP to set
     */
    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    /**
     * @return the apellidoM
     */
    public String getApellidoM() {
        return apellidoM;
    }

    /**
     * @param apellidoM the apellidoM to set
     */
    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    /**
     * @return the boleta
     */
    public String getBoleta() {
        return boleta;
    }

    /**
     * @param boleta the boleta to set
     */
    public void setBoleta(String boleta) {
        this.boleta = boleta;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the celular
     */
    public String getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(String celular) {
        this.celular = celular;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the generacion
     */
    public String getGeneracion() {
        return generacion;
    }

    /**
     * @param generacion the generacion to set
     */
    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    /**
     * @return the temaTesis
     */
    public String getTemaTesis() {
        return temaTesis;
    }

    /**
     * @param temaTesis the temaTesis to set
     */
    public void setTemaTesis(String temaTesis) {
        this.temaTesis = temaTesis;
    }

    /**
     * @return the directorTesis
     */
    public String getDirectorTesis() {
        return directorTesis;
    }

    /**
     * @param directorTesis the directorTesis to set
     */
    public void setDirectorTesis(String directorTesis) {
        this.directorTesis = directorTesis;
    }

    /**
     * @return the Trabaja
     */
    public String getTrabaja() {
        return Trabaja;
    }

    /**
     * @param Trabaja the Trabaja to set
     */
    public void setTrabaja(String Trabaja) {
        this.Trabaja = Trabaja;
    }

    /**
     * @return the DireccionT
     */
    public String getDireccionT() {
        return DireccionT;
    }

    /**
     * @param DireccionT the DireccionT to set
     */
    public void setDireccionT(String DireccionT) {
        this.DireccionT = DireccionT;
    }

    /**
     * @return the horarioT
     */
    public String getHorarioT() {
        return horarioT;
    }

    /**
     * @param horarioT the horarioT to set
     */
    public void setHorarioT(String horarioT) {
        this.horarioT = horarioT;
    }

    /**
     * @return the imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * @param imagen the imagen to set
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

  

    String setImagen(FileInputStream fis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
