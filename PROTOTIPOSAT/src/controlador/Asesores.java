/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author TOM
 */
public class Asesores {
 String nombre;
  String apellidoP;
  String apellidoM;
  String cubiculo;
  String email;
  String horarioAsesorias;

    public Asesores(String nombre, String apellidoP, String apellidoM, String cubiculo, String email, String horarioAsesorias) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.cubiculo = cubiculo;
        this.email = email;
        this.horarioAsesorias = horarioAsesorias;
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
     * @return the cubiculo
     */
    public String getCubiculo() {
        return cubiculo;
    }

    /**
     * @param cubiculo the cubiculo to set
     */
    public void setCubiculo(String cubiculo) {
        this.cubiculo = cubiculo;
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
     * @return the horarioAsesorias
     */
    public String getHorarioAsesorias() {
        return horarioAsesorias;
    }

    /**
     * @param horarioAsesorias the horarioAsesorias to set
     */
    public void setHorarioAsesorias(String horarioAsesorias) {
        this.horarioAsesorias = horarioAsesorias;
    }
 
 
 
 
 

    
}
