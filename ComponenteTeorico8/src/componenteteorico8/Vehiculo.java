/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico8;

/**
 *
 * @author Daniel
 */
public class Vehiculo {
    
    // Atributos
    // Los atributos de tipo public serán accesibles en todas las subclases
    public String matricula;
    // Los atributos de tipo private solo serán accesibles en la super clase
    private int modelo;
    // Los atributos de tipo protected serán accesibles en la super clase y subclases. Por fuera de estos 2, los atributos serán de tipo private
    protected int potencia;
    
    // Constructor(es)
    public Vehiculo(String matricula, int modelo, int potencia) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.potencia = potencia;
    }
    
    public Vehiculo() {
        this.matricula = "ABC 123";
    }

    // Métodos
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
