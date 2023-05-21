/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico11;

/**
 *
 * @author Daniel
 */
public class CarroCarreras implements Vehiculo {
    
    public int velocidad = 0;
    
    @Override
    public int acelerar(int velocidadAumento) {
        return this.velocidad + velocidadAumento;
    }

    @Override
    public int frenar(int kms) {
        this.velocidad -= kms;
        return this.velocidad;
    }

    @Override
    public boolean tieneLlantaRepuesto() {
        return true;
    }
    
}
