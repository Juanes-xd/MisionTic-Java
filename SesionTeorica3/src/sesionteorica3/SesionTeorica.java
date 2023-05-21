/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesionteorica3;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SesionTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String tipo;
        int numero;
        String nombre;
        double saldo;
        
        double cantidad;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo (Ahorros o Corriente): ");
        tipo = scanner.nextLine();
        System.out.println("Ingrese nombre del titular: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese el número de cuenta: ");
        numero = scanner.nextInt();
        System.out.println("Ingrese saldo de la cuenta: ");
        saldo = scanner.nextDouble();
        
        // Instancia una cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(tipo, numero, nombre, saldo);
        
        CuentaBancaria cuenta2 = new CuentaBancaria();
        System.out.println("Saldo cuenta 2: " + cuenta2.saldo);
        
        CuentaBancaria[] cuentas = new CuentaBancaria[100];
        cuentas[0] = new CuentaBancaria(0);
        cuentas[1] = new CuentaBancaria(1);
        
        int accion = -1;
        while(accion != 0) {
            System.out.println("Seleccione la opción a realizar:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Hacer un retiro");
            System.out.println("3. Hacer un deposito");
            System.out.println("0. Salir del cajeroA");
            accion = scanner.nextInt();
            switch(accion) {
                case 0:
                    System.out.println("Gracias por usar el cajero.");
                    break;
                case 1:
                    System.out.println("El saldo de su cuenta es: $" + cuenta.consultarSaldo());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar");
                    cantidad = scanner.nextDouble();
                    boolean resultado = cuenta.retirar(cantidad);
                    if (resultado) {
                        System.out.println("Retiro de saldo exitoso. Nuevo saldo: $" + cuenta.consultarSaldo());
                    } else {
                        System.out.println("Retiro no exitoso. Saldo insuficiente.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a depositar");
                    cantidad = scanner.nextDouble();
                    cuenta.depositar(cantidad);
                    System.out.println("Deposito exitoso. Nuevo saldo: $" + cuenta.consultarSaldo());
                    break;
                default:
                    System.out.println("Opcion incorrecta. Intente nuevamente.");
                    break;
            }
            System.out.println("");
        }
        
    }
    
}
