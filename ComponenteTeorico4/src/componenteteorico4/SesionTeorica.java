/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico4;

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
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Nota 1: ");
        float nota1 = scanner.nextFloat();
        System.out.println("Nota 2: ");
        float nota2 = scanner.nextFloat();
        System.out.println("Nota 3: ");
        float nota3 = scanner.nextFloat();
        
        Estudiante estudiante = new Estudiante(nombre, nota1, nota2, nota3);
        Estudiante estudiante3 = new Estudiante(nombre);
        Estudiante estudiante2 = new Estudiante(nombre, nota1, nota2, nota3);
    }
    
}
