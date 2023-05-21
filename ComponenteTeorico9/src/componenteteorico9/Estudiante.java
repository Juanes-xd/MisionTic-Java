/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico9;

/**
 *
 * @author Daniel
 */
public class Estudiante extends Tripulante {
    public String ciudad;
    public int edad;
    
    public Estudiante(String nombre, String ciudad, int edad) {
        // super();
        super(nombre);
        this.ciudad = ciudad;
        this.edad = edad;
    }
    
    public Estudiante(String nombre, double reto1, double reto2, double reto3, String ciudad, int edad) {
        // super(reto1);
        super(nombre, reto1, reto2, reto3);
        this.ciudad = ciudad;
        this.edad = edad;
    }
}
