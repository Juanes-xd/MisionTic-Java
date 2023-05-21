/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico9;

/**
 *
 * @author Daniel
 */
public class Tripulante {
    String nombre;
    String apellido;
    double reto1;
    double reto2;
    double reto3;
    boolean cicloAprobado;
    
    // Criterio valida Java que los constructores son diferentes
    // - Número de parámetros
    // - Tipo de dato de los parámetros
    
    public Tripulante() {
        this.nombre = "";
    }
    
    public Tripulante(String nombre) {
        this.nombre = nombre;
    }
    
    public Tripulante(double reto1) {
        
    }
    
    public Tripulante(String nombre, double reto1, double reto2, double reto3) {
        this.nombre = nombre;
        this.reto1 = reto1;
        this.reto2 = reto2;
        this.reto3 = reto3;
        double promedio = (this.reto1 + this.reto2 + this.reto3) / 3;
        if (promedio >= 3) {
            this.cicloAprobado = true;
        }
    }
    
    public double calcularPromedio(double nota1) {
        return nota1 / 3;
    }
    
    public double calcularPromedio(double nota1, double nota2) {
        return (nota1 + nota2) / 3;
    }
    
    public double calcularPromedio(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
    
    public double calcularPromedio() {
        return (this.reto1 + this.reto2 + this.reto3) / 3;
    }
}
