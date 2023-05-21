/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//package reto1;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Asus-PC
 */
public class reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       //int numeroCuerpos=0;
       String nombresCuerpos[] = new String[100];
       float numeroId[] = new float[100];
       String municipio[] = new String[100];
       String tipoCuerpoAgua[] = new String[100];
       String tipoAgua[] = new String[100];
       float irca[] = new float[100];

       DecimalFormat frmt = new DecimalFormat("#.##");
       //frmt.setMaximumFractionDigits(1);
       
       int numeroBajo=0;
       String nombresCuerposBajos[] = new String[100];
       String linea = " ";
        String[] datos = new String[6];
        
           //System.out.println("Numero de cuerpos de agua");
         int numeroCuerpos= Integer.parseInt(scanner.nextLine());

       //float cuenta=0;
        for(int i=0; i<numeroCuerpos;i++){
            //System.out.println("Nombre de cuerpos de agua");
            linea = scanner.nextLine();
             datos = linea.split(" ");
             nombresCuerpos[i]=datos[0];
             numeroId[i] = Float.parseFloat(datos[1]);
             irca[i]= Float.parseFloat(datos[5]);
             
             /**
            nombresCuerpos[i] =scanner.nextLine();
            //System.out.println("Numero de id de cuerpos de agua");
            numeroId[i] =scanner.nextLine();
            //System.out.println("Municipio de los cuerpos de agua");
            municipio[i] =scanner.nextLine();
            //System.out.println("Tipos de cuerpos de agua");
            tipoCuerpoAgua[i] =scanner.nextLine();
            //System.out.println("Tipo de agua");
            tipoAgua[i] =scanner.nextLine();
            //System.out.println("Nivel de riesgo");
            irca[i]= Float.parseFloat(scanner.nextLine());
            */
        } 
        
        int otro=0;
        otro=numeroCuerpos;
        for(int i=0; i<nombresCuerpos.length;i++){
            if(nombresCuerpos[i] != null){
            System.out.println(nombresCuerpos[i]);
            }
        }
        
         int k=0;
           //int cero=0;
            String nada = "NA";
        for(int i=0; i<numeroCuerpos;i++){
           
            if(irca[i]>=0 && irca[i]<=14){
                numeroBajo++;
                 k=i;
                
            } 
        }
        if(numeroBajo>0){
            System.out.println(frmt.format(numeroBajo)+".0");
            for(int i=0; i<numeroCuerpos;i++){
           
            if(irca[i]>5 && irca[i]<=14){
                
                 k=i;
                System.out.print(nombresCuerpos[k]+" ");
                
            } 
        }
            System.out.println();
        }
        else{
            System.out.println(0.0);
            System.out.println("NA");
        }
        
        //System.out.println();
        float mayor = irca[0];
        int j=1;
        int aux=0;
        for(int i=1; i<numeroCuerpos;i++){
            if(irca[i]>mayor){
                aux++;
                mayor = irca[i];
                j =i;
            
            }
            
        }
        if(aux >0){
        System.out.println(nombresCuerpos[j]+" "+ frmt.format(numeroId[j])+".0");
        }
        else{
            System.out.println(nombresCuerpos[0]+" "+ frmt.format(numeroId[0])+".0");
        }
        
        
    }
    
}
