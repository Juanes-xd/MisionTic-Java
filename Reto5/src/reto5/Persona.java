/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Asus-PC
 */
public class Persona {
     private String nombreCompleto;
    private String numeroCedula;
    private String edad;
    private String ciudad;
    private String eps;
    
    public Persona(String nombreCompleto, String numeroCedula, String edad, String ciudad, String eps) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
        this.ciudad = ciudad;
        this.eps = eps;
    }
    
    public Persona(){
        
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getEps() {
        return eps;
    }
    
    public void setEps(String eps) {
        this.eps = eps;
    }
}
