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
public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        
        int diaSemana;
        double totalSinDescuento, totalPagar, descuento;
        
        Scanner scanner  = new Scanner(System.in);
        
        // Solicitar el día de la semana
        System.out.println("Ingrese el día de la semana en numero (1-7)");
        diaSemana = scanner.nextInt();
        
        // Solicitar el total sin descuento
        System.out.println("Ingrese el total de la compra sin descuento");
        totalSinDescuento = scanner.nextDouble();
        
        // Obtener el descuento
        switch (diaSemana) {
            case 1: 
                descuento = 0.05;
                break;
            case 2:
                descuento = 0.03;
                break;
            case 3:
                descuento = 0.1;
                break;
            case 4:
                descuento = 0.04;
                break;
            case 5:
                descuento = 0.06;
                break;
            case 6:
                descuento = 0.02;
                break;
            case 7:
                descuento = 0.01;
                break;
            // Este bloque (default) se ejecuta únicamente si no se cumple ninguno de los cases arriba
            default:
                descuento = 0;
                break;
        }
        
        // Obtener el valor a pagar
        totalPagar = totalSinDescuento * (1 - descuento);
        
        System.out.println("Total a pagar con descuento: $" + totalPagar);
    }
}
