/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico11;

/**
 *
 * @author Daniel
 */
public class Taxi implements Vehiculo, VehiculoConRuedas {

    private int velocidad = 0;
    
    public Taxi(int velocidadInicial) {
        this.velocidad = velocidadInicial;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    @Override
    public int acelerar(int kms) {
        this.velocidad += kms;
        if(this.velocidad > Vehiculo.VELOCIDAD_MAXIMA) {
            this.velocidad = Vehiculo.VELOCIDAD_MAXIMA;
        }
        System.out.println("Nueva velocidad: " + this.velocidad + " kms/h");
        return this.velocidad;
    }

    @Override
    public int frenar(int kms) {
        this.velocidad -= kms;
        System.out.println("Nueva velocidad: " + this.velocidad + " kms/h");
        return this.velocidad;
    }

    @Override
    public boolean tieneLlantaRepuesto() {
        return true;
    }
}
