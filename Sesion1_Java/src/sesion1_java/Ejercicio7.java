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
public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 7");
            
        Scanner scanner = new Scanner(System.in);
            
        boolean clientesXAtender = true;
        int cantidadClientes = 1, totalVendido = 0;

        // Estructura cíclica while
        // Ejecuta las sentencias dentro del bloque siempre que se cumpla la condición definida
        // Estructura: while (condicion)
        // while (clientesXAtender) es lo mismo que while (clientesXAtender == true)
        // Con variables booleanas se sobreentiende que la condición valida si el valor es verdadero
        // Si se quiere validar que la expresión sea falsa sería:
        // while (!clientesXAtender) que es lo mismo que (clientesXAtender == false) o (!clientesXAtender == true)
        // Ciclo para ejecutar mientras haya clientes por atender, cantidad no especificada
        while (clientesXAtender) {
            
            System.out.println("Cliente " + cantidadClientes);


            System.out.println("Ingrese la cantidad de tipos de productos comprados: ");
            int cantidadTipoProductos = scanner.nextInt();

            int cantidadProducto;
            int valorProducto;
            int totalFactura = 0;
            
            // Ciclo para obtener la cantidad y valor de los productos a comprar del cliente actual
            for (int i = 1; i <= cantidadTipoProductos; i++) {
                System.out.println("Ingrese la cantidad del producto " + i + ": ");
                cantidadProducto = scanner.nextInt();

                System.out.println("Ingrese el valor del producto " + i + ": ");
                valorProducto = scanner.nextInt();

                totalFactura += (cantidadProducto * valorProducto);
            }

            System.out.println("Total factura: " + totalFactura);

            System.out.println("¿Hay clientes por atender? (si o no) ");
            String nuevoCliente = scanner.next();
            
            // nuevoCliente es un objeto de tipo String
            // la clase String cuenta con una serie de métodos
            // equals: compara si la cadena es igual al valor ingresado como parámetro.
            // devuelve true si las cadenas son iguales, de lo contrario devuelve false
            // nuevoCliente.equals("no") es lo mismo que nuevoCliente == "no"
            // toLowerCase() => convertir una cadena de caracteres a minuscula
            // Ejemplo "DANIEL".toLowerCase() ==> "daniel"
            // toUpperCase() => convertir una cadena de caracteres a mayuscula
            // Ejemplo "daniel".toUpperCase() ==> "DANIEL"
            // no, No, nO, NO
            if (nuevoCliente.toLowerCase().equals("no")) {
                clientesXAtender = false;
            }
            
            // Aumentar en 1 la cantidad de clientes si la respuesta es si
            cantidadClientes++;
            
            // Incrementar el total vendido
            totalVendido = totalVendido + totalFactura;
        }

        System.out.println("Total vendido: " + totalVendido);   
    }
}
