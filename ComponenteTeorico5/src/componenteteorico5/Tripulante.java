/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico5;

/**
 *
 * @author Daniel
 */
public class Tripulante {
    int codigo;
    String nombre;      // Se inicializan en null
    int edad;           // Se inicializan en 0
    private static String institucion = "Universidad del Norte"; // Se inicializan en null
    static int contadorCodigo = 0;
    boolean finalizado; // Se inicializan en false
    
    public Tripulante(String nombre) {
        // ...
        this.nombre = nombre;
        // System.out.println("Institución: " + institucion);
        contadorCodigo +=1;
        this.codigo = contadorCodigo;
    }
    
    public boolean haFinalizado() {
        System.out.println("Institucion: " + institucion);
        return this.finalizado;
    }
    
    public void metodoVoid() {
        
    }
    
    public static String getInstitucion() {
        return institucion;
    }
    
    public static void setInstitucion(String institucion) {
        System.out.println("Anterior institucion: " + getInstitucion());
        Tripulante.institucion = institucion;
        System.out.println("Nueva institucion: " + getInstitucion());
    }
}
