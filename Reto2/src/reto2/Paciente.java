/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author Asus-PC
 */
public class Paciente {
    
    private String nombreCompleto;
    private String numeroCedula;
    private String edad;
    private String ciudad;
    private String enfermedadDiagnosticada;

    public Paciente(String nombreCompleto, String numeroCedula, String edad, String ciudad, String enfermedadDiagnosticada) {
        this.nombreCompleto = nombreCompleto;
        this.numeroCedula = numeroCedula;
        this.edad = edad;
        this.ciudad = ciudad;
        this.enfermedadDiagnosticada = enfermedadDiagnosticada;
    }

    public Paciente(){
        
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

    public String getEnfermedadDiagnosticada() {
        return enfermedadDiagnosticada;
    }

    public void setEnfermedadDiagnosticada(String enfermedadDiagnosticada) {
        this.enfermedadDiagnosticada = enfermedadDiagnosticada;
    }
    
    public String clasificarEdad(int edad){
        if(edad >= 21 && edad <=30){
            return "Joven adulto";
        }
        else if(edad > 30 && edad <=60){
            return "Adulto";
        }
        else if(edad > 60){
            return "Tercera edad";
        }
        return "Menor";
    }
}
