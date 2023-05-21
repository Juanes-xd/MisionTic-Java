/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto2;

import java.util.Scanner;

/**
 *
 * @author Asus-PC
 */
public class reto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
        int numeroPacientes;
        String[] nombresEnfermedades = new String[6];
        nombresEnfermedades[0]="cancer";
        nombresEnfermedades[1]="cardiovasculares";
        nombresEnfermedades[2]="respiratorias";
        nombresEnfermedades[3]="cerebrovasculares";
        nombresEnfermedades[4]="hipertension";
        nombresEnfermedades[5]="diabetes";
        String[] nombresEps = new String[100];

        int[] eps = new int[5];
        
        int cancer=0,cardiovasculares=0, respiratorias=0, cerebrovasculares=0, hipertension=0,diabetes=0;
        int[] enfermedades = new int[6];
        enfermedades[0]=cancer;
        enfermedades[1]=cardiovasculares;
        enfermedades[2]=respiratorias;
        enfermedades[3]=cerebrovasculares;
        enfermedades[4]=hipertension;
        enfermedades[5]=diabetes;
        String linea = " ";
        numeroPacientes = Integer.parseInt(scanner.nextLine());
        String[] datos = new String[6];
        
        String Adultos[] = new String[numeroPacientes];
        Paciente paciente = new Paciente();
        
        
        for(int i=0; i<numeroPacientes; i++){
            
             linea = scanner.nextLine();
             datos = linea.split(" ");
             
             nombresEps[i]=datos[4];

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
             
             String edad = datos[2];
            int anios;
         anios = Integer.parseInt(edad);
        if(paciente.clasificarEdad(anios).equals("Adulto")){
            Adultos[i] = datos[0]+" "+datos[1];
        }
        
        }
        /*
       
Antonia Holmes-5083530292-64-Monteria-Famisanar-cancer
Walter Henry-1622015042-48-San Andres-Famisanar-hipertension
Cindy Senter-1970157496-43-Yopal-Salud Total-hipertension
John Saeler-6385440634-87-Cali-Salud Total-respiratorias
Marion Howell-9234480659-46-Sincelejo-Cafesalud-diabetes
John Cottrell-7565162201-61-Tunja-Coomeva-hipertension
James Fallon-4356190370-24-Cartagena-Salud Colmena-cancer
        
        
        16
Shane Malmquist-1209718048-28-Sincelejo-Compensar-cerebrovasculares
Melissa Hull-1228766796-42-Monteria-SALUDCOLOMBIA-cerebrovasculares
Refugio Smit-1294546796-34-Bogota-Cafesalud-cancer
Tracy Johnson-1272047867-38-Santa Marta-Cafesalud-cardiovasculares
Craig Brown-1057283516-66-Ibague-Compensar-cerebrovasculares
Jerry Howe-1268110342-70-Cartagena-Salud Colmena-hipertension
Terry Washington-1010094607-31-Bogota-Saludcoop-respiratorias
Roger Granata-1154705606-62-Neiva-Comfenalco Valle-cancer
Eva Pulliam-1239040349-39-Popayan-SALUDCOLOMBIA-respiratorias
Lorna Courville-1025268542-38-Mitu-Cruz Blanca-diabetes
Jason Langston-1117334580-48-Leticia-Comfenalco Valle-cardiovasculares
Hugo Gade-1152614060-59-Rioacha-SURA-cancer
Jean Carmody-1092548081-45-Inirida-Colseguros-diabetes
Shawna Weeden-1181196460-45-Medellin-Salud Colmena-hipertension
Adrienne Galloway-1177270732-37-Armenia-Saludcoop-diabetes
Jerry Coughlin-1038581373-77-Inirida-Saludcoop-cancer
        
        
        
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
        
        
         int mayorC = Integer.MIN_VALUE; // Almacena el valor menor posible del vector
        int mayorP = -1;
         String string = "";        
        int elemento = 0;
        int repetido=0;
        for (int i = 0; i < nombresEps.length; i++) {
            int r = 0;
            for (int j = i; j < nombresEps.length; j++){
                if(nombresEps[i]!=null){
                if (nombresEps[i].equals(nombresEps[j])){
                    r++;
                }
                }
            }
            if (r > repetido && r >=3) {
                mayorP = i;
                repetido = r;
                System.out.println(nombresEps[mayorP]);
            }
        }
       
        
        
        
        for(int i=0;i<numeroPacientes;i++){
           if(Adultos[i] != null){
                System.out.println(Adultos[i]);
           }
        }
    }
    
}
