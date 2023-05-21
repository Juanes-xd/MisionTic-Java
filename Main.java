/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase_3;

import java.util.Scanner;

/**
 *
 * @author Jeiver Sosa 
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int opcionMenu, contador = 0;
        Perro vectorPerro [] = new Perro[100];               
        
        System.out.println("------------------------------------");
        System.out.print("**** BIENVENIDOS A MASCOTASPETS ****");                                
        
        do {
            System.out.println("\n" + "-------------- MENÚ ----------------");
            System.out.println(" 1) Registrar una mascota");
            System.out.println(" 2) Actualizar info de una mascota");
            System.out.println(" 3) Borrar una mascota");
            System.out.println(" 4) Mostrar mis macotas");
            System.out.println(" 0) Salir...");
            System.out.println("------------------------------------");
            
            System.out.print("Ingrese una opción: ");
            opcionMenu = Integer.parseInt(teclado.nextLine());
            
            switch (opcionMenu) {
                case 1:
                    Perro unPerro = new Perro();
                    
                    System.out.print("\n" + "Ingrese nombre: ");
                    unPerro.setNombre(teclado.nextLine());
                    
                    System.out.print("Ingrese raza: ");
                    unPerro.setRaza(teclado.nextLine());
                    
                    System.out.print("Ingrese año: ");
                    unPerro.setAnio(Integer.parseInt(teclado.nextLine()));
                    
                    System.out.print("Ingrese tamaño: ");
                    unPerro.setTamanio(Integer.parseInt(teclado.nextLine()));
                    
                    System.out.print("Ingrese color: ");
                    unPerro.setColor(teclado.nextLine());
                    
                    System.out.print("Está castrado? S/N : ");
                    unPerro.setCastrado(teclado.nextLine());
                    
                    System.out.print("Ingrese sexo: ");
                    unPerro.setSexo(teclado.nextLine());
                                        
                    vectorPerro[contador] = unPerro;
                    contador ++;
                    
                    System.out.println("\n" + "Mascota registrada con exito!");
                    break;
                case 2:
                    System.out.println("\n" + "Cual de las siguientes mascotas desea actualizar:");                    
                    
                    for (int i = 0; i < contador; i++) {
                        System.out.println(i+1 +") "+ vectorPerro[i].getNombre());                        
                    }
                    
                    System.out.print("\n" + "Ingrese una opcion: ");
                    int opcionActualizar = Integer.parseInt(teclado.nextLine());
                    
                    for (int i = 0; i < contador; i++) {
                        if (opcionActualizar == i+1) {
                            System.out.print("\n" + "Ingrese nuevo tamaño: ");
                            vectorPerro[i].setTamanio(Integer.parseInt(teclado.nextLine()));
                            System.out.print("Está castrado?: S/N: ");
                            vectorPerro[i].setCastrado(teclado.nextLine());
                            
                            System.out.print("\n" + vectorPerro[i].getNombre() +" Actualizad@ con exito!!" + "\n");
                            break;
                        }                                                                            
                    }
                    break;
                case 3:
                    System.out.println("\n" + "¿Cual de los siguientes mascotas desea eliminar?");

                    for (int i = 0; i < contador; i++) {
                        System.out.println(i+1 + ") " + vectorPerro[i].getNombre());
                    }

                    System.out.print("Ingrese una opción: ");
                    int opcionEliminar = Integer.parseInt(teclado.nextLine());
                    
                    for (int i = 0; i < contador; i++) {
                        if (opcionEliminar == i+1) {
                            vectorPerro[i] = null;
                            contador -= 1;
                            for (int j = i; j < contador; j++) {
                                vectorPerro[j] = vectorPerro[j+1];
                            }
                            break;
                        }                                                                            
                    }
                    
                    System.out.println("\n" + "Mascota eliminada con exito!! " + "\n");
                    
                    for (int i = 0; i < contador; i++) {
                        System.out.println(i+1 + ") " + vectorPerro[i].getNombre());
                    }                    
                    
                    break;
                case 4:
                    System.out.println("\n" + "Informacion de cada perro hasta ahora: ");
                    for (int i = 0; i < contador; i++) {                        
                        System.out.println(" # " + vectorPerro[i].obtenerInfo());
                    }
                    break;
                default:
                    System.out.println("\n" + "Programa finalizado. Hasta pronto!");
                    break;
            }            
        } while (opcionMenu != 0);        
    }
}