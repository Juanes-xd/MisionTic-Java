/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto2;

/**
 *
 * @author Asus-PC
 */
public class DensidadPoblacional extends ObjetoGeografico{
    private int numeroHabitantes;
    private int afeccion;

    public DensidadPoblacional(int numeroHabitantes, int afeccion, String municipio) {
        super(municipio);
        this.numeroHabitantes = numeroHabitantes;
        this.afeccion = afeccion;
    }

    public DensidadPoblacional(int numeroHabitantes, int afeccion) {
        this.numeroHabitantes = numeroHabitantes;
        this.afeccion = afeccion;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public int getAfeccion() {
        return afeccion;
    }

    public void setAfeccion(int afeccion) {
        this.afeccion = afeccion;
    }
    
    
    
    public void afeccion(int numeroHabitantes){
        if(numeroHabitantes < 10000){
            afeccion = 0;
        }
        else if(numeroHabitantes >= 10000 && numeroHabitantes <= 50000){
            afeccion = 1;
        }
        else{
            afeccion=2;
        }
    }
}
