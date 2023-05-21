/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componenteteorico11;

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
        
        /*Taxi taxi = new Taxi(40);
        taxi.acelerar(10);
        taxi.frenar(15);
        taxi.acelerar(50);
        taxi.frenar(85);
        taxi.acelerar(150);
        
        Clase2 c2 = new Clase2();*/
        
        CarroCarreras cc = new CarroCarreras();
        cc.frenar(2);
        cc.acelerar(15);
        System.out.println(cc.tieneLlantaRepuesto());
        
        SuperClase[] objetos = new SuperClase[2];
        SuperClase spc = new SuperClase();
        Subclase sbc = new Subclase();
        objetos[0] = spc;
        objetos[1] = sbc; 
        
        // instanceof 
        // Retorna true o false, dependiendo si el objeto que comparamos
        // Coincide con el tipo que estamos validando
        // objeto instanceof Tipo
        
        // instanceof retorna
        // Si el tipo del objeto es igual al tipo que estamos comparando ==> true
        // SuperClase sc = new SuperClase();
        // sc instanceof SuperClase ==> true
        
        // si el tipo del objeto se compara con una clase heredada de ese objeto ==> true
        // public class Subclase extends SuperClase
        // Subclase sc = new Subclase();
        // sc instanceof SuperClase ==> true
        
        // Si el objeto implementa la interface con la que se está haciendo la comparación ==> true
        // public class Subclase implements Interface1
        // Subclase sc = new Subclase()
        // sc instanceof Interface1 ==> true
        
        // Si el objeto no hereda o implementa la clase que estamos comparando
        // Devuelve un error de comparación
        // Manzana mz  = new Manzana();
        // mz instanceof PantallaComputador ==> error en compilación

        
        // public class Subclase extends SuperClase
        // Subclase subc = new Subclase();
        // SuperClase supc = new SuperClase();
        // subc instanceof Subclase ==> true
        // subc instanceof SuperClase ==> true
        // supc instanceof SuperClase ==> true
        // supc instanceof Subclase ==> false
        
        for (int i = 0; i < objetos.length; i++) {
            // si es superclase invoca mostrar()
            // si es subclase invoca mostrar2()
            
            // si el objeto en la posición i del vector es de tipo Subclase
            if (objetos[i] instanceof Subclase) {
                // Como el tipo de datos en el vector es de tipo SuperClase
                // Se debe hacer casting para poder obtener los métodos / atributos de la clase Subclase
                ((Subclase)objetos[i]).mostrar2();
            } else {
                objetos[i].mostrar();
            }
        }
    }
    
}
