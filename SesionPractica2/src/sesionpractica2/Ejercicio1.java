/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesionpractica2;

import java.util.Scanner;


/**
 *
 * @author Daniel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // IMPORTANTE: Antes de ver el código
        // Por favor leer el enunciado
        
        Scanner scanner = new Scanner(System.in);
        
        
        // Declarar vector y matrices
        String[] listaCodigos;
        int[][] tablaCantidadBodega = new int[100][100];
        int[][] tablaCantidadMinima = new int[100][100];
        
        
        String linea;
        
        // Leer códigos de productos
        System.out.println("Ingrese los codigos de productos: ");
        linea = scanner.nextLine();
        
        // Almacenar códigos en listaCodigos
        // String.split => separa una cadena por el caracter especificado como parámetro
        // Regresa un arreglo
        // Ejemplo: "Hola mundo esto es una oración".split(" ") = ["Hola", "mundo", "esto", "es", "una", "oracion"]
        // Ejemplo: "Hola mundo esto es una oración".split(";") = ["Hola mundo esto es una oración"]
        listaCodigos = linea.split(" ");
        int cantidadProductos = listaCodigos.length;
        
        // Leer cantidades en bodega y guardar en matriz
        System.out.println("Ingrese las cantidades en bodega, separando filas por ; y columnas por espacio");
        linea = scanner.nextLine();
        // Obtener filas
        String[] filas = linea.split(";");
        int cantidadSedes = filas.length;
        for (int i = 0; i < cantidadSedes; i++) {
            // Obtener columnas
            String[] columnas = filas[i].split(" ");
            // Llenar matriz cantidades bodega
            for (int j = 0; j < cantidadProductos; j++) {
                // Se convierte valor a entero y luego se guarda en la matriz
                tablaCantidadBodega[i][j] = Integer.parseInt(columnas[j]);
            }
        }
        
        // Leer cantidades minimas y guardar en matriz
        System.out.println("Ingrese las cantidades minimas, separando filas por ; y columnas por espacio");
        linea = scanner.nextLine();
        // Obtener filas
        filas = linea.split(";");
        for (int i = 0; i < cantidadSedes; i++) {
            // Obtener columnas
            String[] columnas = filas[i].split(" ");
            // Llenar matriz cantidades bodega
            for (int j = 0; j < cantidadProductos; j++) {
                // Se convierte valor a entero y luego se guarda en la matriz
                tablaCantidadMinima[i][j] = Integer.parseInt(columnas[j]);
            }
        }
        
        
        // Revisar si se debe solicitar producto a proveedor
        System.out.println("");
        for (int i = 0; i < cantidadSedes; i++) {
            for (int j = 0; j < cantidadProductos; j++) {
                if(tablaCantidadBodega[i][j] < tablaCantidadMinima[i][j]) {
                    System.out.println("Se requiere hacer pedido al proveedor para el producto " + listaCodigos[j] + " en la sede " + (i+1));
                }
            }
        }
        
        // Calculo de promedio por producto
        System.out.println("");
        double promedio;
        for (int i = 0; i < cantidadProductos; i++) {
            promedio = 0;
            for (int j = 0; j < cantidadSedes; j++) {
                // Esta es la linea que estaba antes
                // promedio += tablaCantidadBodega[i][j];
                
                // CORRECCION: Invertir las variablas para los índices
                // i --> j, j --> i
                promedio += tablaCantidadBodega[j][i];
            }
            promedio /= cantidadSedes;
            System.out.println("El promedio de productos del codigo " + listaCodigos[i] + " es " + promedio);
        }
        
    }
    
}
