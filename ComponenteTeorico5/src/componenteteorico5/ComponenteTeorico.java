/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico5;

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
        
        Tripulante tripulante1 = new Tripulante("Daniel");
        Tripulante tripulante2 = new Tripulante("Daniela");
        Tripulante tripulante3 = new Tripulante("Jose");
        
        // Atributos no estáticas
        // Para los atributos que no son estáticos, se requiere tener una instancia
        // de la clase para poder acceder a estos atributos
        System.out.println("Nombre tripulante 1: " + tripulante1.nombre);
        System.out.println("Nombre tripulante 2: " + tripulante2.nombre);
        System.out.println("Nombre tripulante 3: " + tripulante3.nombre);
        
        System.out.println("Codigo tripulante 1: " + tripulante1.codigo);
        System.out.println("Codigo tripulante 2: " + tripulante2.codigo);
        System.out.println("Codigo tripulante 3: " + tripulante3.codigo);
        
        // Atributo Estático
        // Para el caso de atributos estáticos, estos atributos pertenecen
        // Directamente a la clase, y no requieren instanciación
        System.out.println("Institucion: " + Tripulante.getInstitucion());
        Tripulante.setInstitucion("Uninorte");
        System.out.println("Institucion: " + Tripulante.getInstitucion());
        
        tripulante1.haFinalizado();
        tripulante2.haFinalizado();
    }
    
}
