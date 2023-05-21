/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesionteorica3;

/**
 *
 * @author Daniel
 */
// Nombre de la clase => Pascal Case => CuentaBancaria
public class CuentaBancaria {
    
    // Atributos
    String tipo; // Ahorros o Corriente
    int numero;
    String nombre;
    double saldo;
    
    // Constructor
    // Es el método que se ejecuta tan pronto como instanciamos una instancia de la clase
    // Dentro del constructor se podrán definir los parámetros iniciales del objeto (Opcional)
    // Dentro del constructor se podrá ejecutar cualquier lógica inicial del objeto
    // Sintaxis: public <<Nombre de la clase>> ( parámetros de la clase) { Lógica }
    public CuentaBancaria(String tipo, int numero, String nombre, double saldo) {
        // palabra reservada "this" => hace referencia a la instancia de la clase
        this.tipo = tipo;
        this.numero = numero;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public CuentaBancaria() {
        this.tipo = "Ahorros";
        this.numero = 123;
        this.nombre = "";
        this.saldo = 0;
    }
    
    public CuentaBancaria(int numero) {
        this.tipo = "Ahorros";
        this.numero = numero;
        this.nombre = "";
        this.saldo = 0;
    }
    
    
    // Métodos
    
    // Función: Procedimiento que realiza una serie de acciones
    // Parámetros: Datos de entrada que la función podrá utilizar dentro de la lógica de la función
    // Tipo: Tipo de dato que devuelve la función - Ejemplos:
    // double => la función retornará un valor de tipo Double
    // String => la función retornará un valor de tipo String
    // boolean => la función retornará un valor de tipo boolean
    // ...
    // void => la función realizará alguna acción PERO no retornará nada
    // Cuando usamos un tipo diferente de "void" es OBLIGATORIO retornar un valor del tipo definido
    // Retorno se realiza con la sentencia "return"
    
    /**
     * Añade dinero al saldo de la cuenta
     * @param dinero 
     */
    void depositar(double dinero) {
        saldo += dinero;
    }
    
    /**
     * Retira dinero de la cuenta siempre y cuando el saldo sea suficiente
     * @param cantidadRetiro cantidad a retirar
     * @return true si el valor a retirar es menor o igual al saldo, de lo contrario será false
     */
    boolean retirar(double cantidadRetiro) {
        // Si saldo es suficiente
        if (cantidadRetiro <= saldo) {
            saldo -= cantidadRetiro;
            // Apenas se ejecute la sentencia "return" la función termina de ejecutarse.
            return true;
        }
        return false;
    }
    
    /**
     * Consulta el saldo actual de la cuenta
     * @return saldo
     */
    double consultarSaldo() {
        return saldo;
    }
}
