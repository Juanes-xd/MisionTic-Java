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
public class Ejercicio3 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(Integer.toString(15));
        
        System.out.println("Ejercicio #3");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en bodega: ");
        int cantidadBodega = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad minima requerida: ");
        int cantidadMinima = scanner.nextInt();
        
        if (cantidadBodega < cantidadMinima) {
            System.out.println("Se debe hacer pedido al proveedor");
        } else {
            System.out.println("No se necesita hacer pedido al proveedor");
            int cantidadRestante = cantidadBodega - cantidadMinima;
            System.out.println("Quedan " + Integer.toString(cantidadRestante) + " unidades antes de solicitar pedido");
            if (cantidadRestante < 10) {
                System.out.println("Alerta generada");
            }
        }
       
    }
}
