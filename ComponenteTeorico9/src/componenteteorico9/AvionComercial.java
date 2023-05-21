/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico9;

/**
 *
 * @author Daniel
 */
public class AvionComercial extends Avion {
    
    public int año;
    
    public AvionComercial(String modelo, int año) {
        super(modelo);
        this.año = año;
        this.despegar();
    }
    
    @Override
    public void despegar() {
        System.out.println("El avion " + modelo + " año " + año + " ha despegado exitosamente");
    }
}
