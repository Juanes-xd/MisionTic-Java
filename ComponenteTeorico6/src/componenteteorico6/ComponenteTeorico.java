/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico6;

/**
 *
 * @author Daniel
 */
public class ComponenteTeorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // CONVERSION EXPLICITA
        int entero1;
        // Variable Float: se debe colocar el valor y la letra f
        // para especificar el tipo
        float float1 = 2.57f; 
        
        System.out.println("float1 como float: " + float1);
        // La conversión (cast) explícita se realiza 
        // colocando a la izquierda el tipo de dato al que se quiere convertir la variable
        entero1 = (int) float1; 
        System.out.println("entero1 como int: " + entero1);
        
        // CONVERSION IMPLICITA
        int entero2 = 2;
        float float2;
        
        System.out.println("entero2 como int: " + entero2);
        float2 = entero2; // Conversión implícita: Tipo de dato no especificado
        System.out.println("entero2 como float: " + float2);
        
        String nuevoString2 = "20";
        // int entero3 = cadenaNumero; NO ES POSIBLE
        int entero3 = Integer.parseInt(nuevoString2);
        
        float maxFloat;
        double maxDouble = Double.MAX_VALUE;
        
        maxFloat = (float) maxDouble;
        
        float valorFloat;
        double valorDouble = 2.5678230982;
        
        valorFloat = (float) valorDouble;
        
        System.out.println(valorFloat);
        
        long longNumber = 1000000;
        short shortNumber;
        System.out.println("Long number: " + longNumber);
        shortNumber = (short) longNumber;
        System.out.println("short number: " + shortNumber);
        
        Tripulante tripulante = new Tripulante("John", "Smith", 30);
        tripulante.metodo1();
    }
    
}
