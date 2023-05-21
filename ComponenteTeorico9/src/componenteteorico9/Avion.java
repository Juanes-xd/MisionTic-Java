/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico9;

/**
 *
 * @author Daniel
 */
public class Avion {
    public String modelo;
    
    public Avion(String modelo) {
        this.modelo = modelo;
    }
    
    public void despegar() {
        System.out.println("El avion " + modelo + " ha despegado exitosamente");
    }
}
