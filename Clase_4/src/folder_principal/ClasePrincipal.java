/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package folder_principal;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author faanb
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        String opcion;
        boolean continuar_preguntando = true;
        Perro[] mis_perritos = new Perro[100];
        int contador_perritos = 0;
        
        System.out.println("Bienvenido a veterinaria MisionPerrito");
        System.out.println("Seleccione una opcion:");
        
        do{
            System.out.println("1) Registrar un perrito");
            System.out.println("2) Actualizar info de un perrito");
            System.out.println("3) Borrar un perrito");
            System.out.println("4) Mostras mis perritos");
            System.out.println("0) Salir");
            
            opcion = teclado.nextLine();
            
            switch (opcion) {
                case "1":
                    System.out.println("1");
                    Perro nuevo_perrito = new Perro();
                    System.out.println("Ingrese nombre:");
                    nuevo_perrito.nombre = teclado.nextLine();
                    
                    System.out.println("Ingrese año de nacimiento:");
                    nuevo_perrito.anho_nacimiento = Integer.parseInt(teclado.nextLine());
                    // Aun no pidan madre y padre !!!!
                    mis_perritos[contador_perritos] = nuevo_perrito;
                    contador_perritos ++;
                    break;
                case "2":
                    System.out.println("No disponible aun");
                    break;
                case "3":
                    System.out.println("No disponible aun");
                    break;
                case "4":
                    for (int i=0; i<contador_perritos;i++) {
                        String info = mis_perritos[i].obtenerInfo();
                        System.out.println(info);
                    }
                    break;
                case "0":
                    continuar_preguntando = false;
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
            }
            
        }while(continuar_preguntando);
        System.out.println("Gracias por usar nuestro sistema.");
        
    }

}
