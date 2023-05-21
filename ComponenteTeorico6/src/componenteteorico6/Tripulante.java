/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico6;

/**
 *
 * @author Daniel
 */
public class Tripulante {
    private static String institucion = "Universidad del Norte";
    private String nombre;
    private String apellido;
    private int edad;
    public final String ciclo = "Ciclo 2";
    
    public Tripulante(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void metodo1() {
        String nombre = "Daniel";
        System.out.println(nombre);
        System.out.println(this.nombre);
    }
    
    
}
