/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico4;

/**
 *
 * @author Daniel
 */
public class Estudiante {

    // Atributos
    public String nombre;
    private float nota1; // 0 - 5
    private float nota2; // 0 - 5
    private float nota3; // 0 - 5
    private float notaDefinitiva;
    
    // Getters
    // Convención para nombrar get<<Atributo a obtener>>
    
    float getNota1() {
        return this.nota1;
    }
    
    float getNota2() {
        return this.nota2;
    }
    
    float getNota3() {
        return this.nota3;
    }
    
    float getNotaDefinitiva() {
        return this.notaDefinitiva;
    }
    
    // Setters
    // Convención: set<<Nombre del Atributo>>
    
    public void setNota1(float valor) {
        if(valor >=0 && valor <=5) {    
            this.nota1 = valor;
            this.notaDefinitiva = calcularDefinitiva();
        } else {
            System.out.println("Valor para nota 1 incorrecto. Valor no actualizado.");
        }
    }
    
    public void setNota2(float valor) {
        if(valor >=0 && valor <=5) {    
            this.nota2 = valor;
            this.notaDefinitiva = calcularDefinitiva();
        } else {
            System.out.println("Valor para nota 2 incorrecto. Valor no actualizado.");
        }
    }
    
    // estudiante.nota3 = 6;  modificó el valor de inmediato
    // estudiante.setNota3(6); no modificó el valor pq no era válido.
    public void setNota3(float valor) {
        if(valor >=0 && valor <=5) {    
            this.nota3 = valor;
            this.notaDefinitiva = calcularDefinitiva();
        } else {
            System.out.println("Valor para nota 3 incorrecto. Valor no actualizado.");
        }
    }
    
    // Constructores
    public Estudiante(String nombre, float nota1, float nota2, float nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaDefinitiva = calcularDefinitiva();
    }
    
    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.nota1 = 5;
        this.nota2 = 0;
        this.nota3 = 0;
        this.notaDefinitiva = 0; // Promedio n1,n2,n3
    }
    
    // Métodos
    private float calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3;
    }
}
