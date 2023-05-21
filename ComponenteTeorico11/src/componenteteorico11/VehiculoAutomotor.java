/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico11;

/**
 *
 * @author Daniel
 */
public abstract class VehiculoAutomotor {
    
    public boolean tieneMotor = true;
    private String VIN = "";
    protected int kms = 0;
    public static int odometro = 0;
    public int velocidad = 0;
    
    public abstract int acelerar(int kms);
    
    private void frenar() {
        System.out.println("Vehiculo frenó");
    }
}
