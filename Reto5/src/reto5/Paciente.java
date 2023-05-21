/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Asus-PC
 */
public class Paciente extends Persona{
    private String enfermedad;

    public Paciente(String enfermedad, String nombreCompleto, String numeroCedula, String edad, String ciudad, String eps) {
        super(nombreCompleto, numeroCedula, edad, ciudad, eps);
        this.enfermedad = enfermedad;
    }
    public  Paciente(){
        
    }

    public Paciente(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
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
