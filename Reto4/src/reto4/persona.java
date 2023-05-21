/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Asus-PC
 */
public class persona {
    private String nombreCompleto;
    private String numeroCedula;
    private String edad;
    private String ciudad;
    
    
    public persona(String nombreCompleto, String numeroCedula, String edad, String ciudad) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    
    public persona(){
        
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
    
    
}

