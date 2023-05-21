/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;
import java.util.Scanner;
/**
 *
 * @author @Juan Esteban Ortiz
 */
public class reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        String cantidadPersonas;
        int personas;
        String[] nombresEnfermedades = new String[6];
        nombresEnfermedades[0]="cancer";
        nombresEnfermedades[1]="cardiovasculares";
        nombresEnfermedades[2]="respiratorias";
        nombresEnfermedades[3]="cerebrovasculares";
        nombresEnfermedades[4]="hipertension";
        nombresEnfermedades[5]="diabetes";
        int cancer=0,cardiovasculares=0, respiratorias=0, cerebrovasculares=0, hipertension=0,diabetes=0;
        int[] enfermedades = new int[6];
        enfermedades[0]=cancer;
        enfermedades[1]=cardiovasculares;
        enfermedades[2]=respiratorias;
        enfermedades[3]=cerebrovasculares;
        enfermedades[4]=hipertension;
        enfermedades[5]=diabetes;
        String linea = " ";
        cantidadPersonas = scanner.nextLine();
        personas = Integer.parseInt(cantidadPersonas);
        String[] datos = new String[6];
        
        
        for(int i=0; i<personas;i++){
            linea = scanner.nextLine();
             datos = linea.split("-");
            
             if(datos[5].equals("cancer")){
                 enfermedades[0]+=1;
                 
             }
             if(datos[5].equals("cardiovasculares")){
                 enfermedades[1] +=1;
             }
             if(datos[5].equals("respiratorias")){
                 enfermedades[2] +=1;
             }if(datos[5].equals("cerebrovasculares")){
                 enfermedades[3] +=1;
             }
             if(datos[5].equals("hipertension")){
                 enfermedades[4] +=1;
             }
             if(datos[5].equals("diabetes")){
                 enfermedades[5] +=1;
             
             }
        }
        /*
        for(int j=0; j<enfermedades.length; j++){
                 System.out.println(enfermedades[j]);
        }
*/
         int mayorCantidad = Integer.MIN_VALUE; // Almacena el valor menor posible del vector
        int mayorPosicion = -1; // Almacena la posicion donde está el menor valor posible
        // Valor Inicial; Limite; incrementos
        for(int i=0; i < enfermedades.length; i++) {
            if(enfermedades[i] > mayorCantidad) {
                mayorCantidad= enfermedades[i];
                mayorPosicion = i;
                
            }
        }
         int menorCantidad = Integer.MAX_VALUE; // Almacena el valor menor posible del vector
        int menorPosicion = -1; // Almacena la posicion donde está el menor valor posible
        // Valor Inicial; Limite; incrementos
        for(int i=0; i < enfermedades.length; i++) {
            if(enfermedades[i] < menorCantidad) {
                menorCantidad = enfermedades[i];
                menorPosicion = i;
                
            }
        }
        //System.out.println("Ya se ingresaron los datos");
        System.out.println(nombresEnfermedades[mayorPosicion]);
        System.out.println(nombresEnfermedades[menorPosicion]);
    }
    
}
