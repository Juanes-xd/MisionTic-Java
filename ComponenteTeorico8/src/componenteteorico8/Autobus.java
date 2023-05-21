/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico8;

/**
 *
 * @author Daniel
 */
public class Autobus extends Vehiculo {
    
    // Atributo
    private int numeroCupos;
    
    //Constructor
    public Autobus(int numeroCupos, String matricula, int modelo, int potencia) {
        super(matricula, modelo, potencia);
        this.numeroCupos = numeroCupos;
    }
    
    // Métodos
    public int getNumeroCupos() {
        return numeroCupos;
    }

    public void setNumeroCupos(int numeroCupos) {
        this.numeroCupos = numeroCupos;
    }
}
