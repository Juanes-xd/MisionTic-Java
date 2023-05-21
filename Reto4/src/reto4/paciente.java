/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;

/**
 *
 * @author Asus-PC
 */
public class paciente extends persona {
     private String enfermedad;

    public paciente(String nombre, String cedula, String edad, String ciudad, String eps ,String enfermedad) {
        super(nombre, cedula, edad, ciudad);
        this.enfermedad = enfermedad;
    }
    
    public paciente(){
        
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

