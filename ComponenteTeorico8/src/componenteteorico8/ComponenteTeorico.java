/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico8;

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
        
        Taxi taxiAmarillo = new Taxi("ABC123", "MAT-123", 2022, 2000);
        System.out.println("El modelo del taxi es: " + taxiAmarillo.getModelo());
        
        Autobus autobus = new Autobus(150, "BUS123", 2015, 10000);
        System.out.println("Cupo del autobus: " + autobus.getNumeroCupos());
        System.out.println("El modelo del bus es: " + autobus.getModelo());
    }
    
}
