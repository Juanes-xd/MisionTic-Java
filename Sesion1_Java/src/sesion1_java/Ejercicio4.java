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
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4");
        
        Scanner scanner = new Scanner(System.in);
        
        int cantidadBodega, cantidadMinima;
        // int cantidadMinima = 0, cantidadBodega = 0;
        System.out.println("Ingrese la cantidad en bodega: ");
        cantidadBodega = scanner.nextInt();
        
        System.out.println("Ingrese la cantidad minima: ");
        cantidadMinima = scanner.nextInt();
        
        // Si cantidad en bodega es menor a la cantidad minima
        if (cantidadBodega < cantidadMinima) {
            System.out.println("Se requiere solicitar producto al proveedor");
            int cantidadDeseada, valorCompra, dineroCaja;
            
            // Solicitar cantidad deseada a comprar
            System.out.println("Ingrese la cantidad deseada a comprar: ");
            cantidadDeseada = scanner.nextInt();
            
            // Solicitar valor unitario del producto
            System.out.println("Ingrese el valor unitario del producto: ");
            valorCompra = scanner.nextInt();
            
            // Solicitar dinero en caja
            System.out.println("Ingrese la cantidad de dinero en caja");
            dineroCaja = scanner.nextInt();
            
            // Calcular el valor total de la compra
            int totalCompra = cantidadDeseada * valorCompra;
            
            // Si alcanza el dinero
            if (totalCompra <= dineroCaja) {
                System.out.println("Si es posible hacer el pedido.");
            }
            // Si no alcanza el dinero
            else {
                System.out.println("No es posible hacer el pedido.");
            }
        }
        // Si cantidad en bodega es mayor o igual a la cantidad minima
        else {
            System.out.println("No se requiere solicitar producto al proveedor");
            int cantidadRestante = cantidadBodega - cantidadMinima;
            System.out.println("Unidades que hacen falta por vender: " + Integer.toString(cantidadRestante));
            if (cantidadRestante < 10) {
                System.out.println("Alerta por menos de 10 unidades por vender");
            }
        }
    }
}
