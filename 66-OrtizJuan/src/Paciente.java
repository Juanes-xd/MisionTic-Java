/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus-PC
 */
public class Paciente extends Persona {
     private String enfermedad;

    public Paciente(String nombre, String cedula, String edad, String ciudad, String eps ,String enfermedad) {
        super(nombre, cedula, edad, ciudad);
        this.enfermedad = enfermedad;
    }
    
    public Paciente(){
        
    }    

    

   
    
    public String getenfermedad() {
        return enfermedad;
    }

    public void setenfermedad(String enfermedad) {
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
