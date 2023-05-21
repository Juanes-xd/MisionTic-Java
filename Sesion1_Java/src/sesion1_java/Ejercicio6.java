/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion1_java;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6");
        
        int numeroTipoProductos, cantidadProducto, valorProducto, totalPagar = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicite el total de productos a comprar
        System.out.println("Ingrese la cantidad de productos a comprar: ");
        numeroTipoProductos = scanner.nextInt();
        
        // Solicitar cantidad y precio de cada producto;
        
        // Estructura cíclica Para (for)
        // int i = 1; Define una variable que se usa como contador y se inicializa con el valor inicial.
        // i <= numeroProductos; indica el valor límite hasta el cual podrá llegar el ciclo.
        // i++; Indica en cuanto incrementará i en cada iteración del ciclo; i++ (de 1 en 1); i = i + 2
        for (int i = 1; i <= numeroTipoProductos; i++) {
            System.out.println("");
            // Solicitar cantidad y valor de cada producto
            System.out.println("Indique la cantidad para el producto " + i);
            cantidadProducto = scanner.nextInt();
            System.out.println("Ingrese el valor del producto " + i);
            valorProducto = scanner.nextInt();
            
            // Ir acumulando en la variable totalPagar el total de la compra
            totalPagar += (cantidadProducto*valorProducto);
        }
        
        // Indicar el total a pagar
        System.out.println("El total a pagar es: $" + totalPagar);
    }
            
}
