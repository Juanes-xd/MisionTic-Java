/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto5;

/**
 *
 * @author Asus-PC
 */
public class Medico extends Persona{
    private String id;
    private String[] pacientes; 
    public Medico(String id,String nombreCompleto, String numeroCedula, String edad, String ciudad, String eps) {
        super(nombreCompleto, numeroCedula, edad, ciudad, eps);
    }

    public Medico() {
    }
    
    public void pacientes(String[] pacientes){
        for(int i=0; i<pacientes.length;i++){
           System.out.println( pacientes[i]);
        }
    }
}
