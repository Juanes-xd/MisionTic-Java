/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico8;

/**
 *
 * @author Daniel
 */

// La herencia se indica con la palabra "extends"
// public class Subclase extends SuperClase { }
public class Taxi extends Vehiculo {
    
    // Atributos
    private String licencia;
    
    // Constructor
    public Taxi(String licencia, String matricula, int modelo, int potencia) {
        super(matricula, modelo, potencia);
        // super();
        this.licencia = licencia;
        this.matricula = "ABC001";
        this.potencia = 2000;
    }

    // Metodo
    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
}
