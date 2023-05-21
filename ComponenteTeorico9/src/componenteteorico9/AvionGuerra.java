/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico9;

/**
 *
 * @author Daniel
 */
public class AvionGuerra extends Avion {
    public int cantidadMunicion;
    
    public AvionGuerra(String modelo) {
        super(modelo);
        this.despegar();
    }
}
