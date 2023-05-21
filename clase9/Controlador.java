/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

/**
 *
 * @author faanb
 */
public class Controlador {
    private static Perro[] lista_perros = new Perro[100];
    private static int cant_perros_actuales = 0;
    
    // Bloqueo el constructor para que no se puedan crear objetos con base en esta clase
    private Controlador(){};
    
    public static Perro crearPerro(String raza, String sexo, int edad, String nombre, String color, boolean pedigree){
        // aquí debería hacer las valicaciones
        if(sexo.equals("M") || sexo.equals("H")){
            Perro nuevo_perro = Perro.crearEnBaseDeDatos(nombre, color, pedigree, raza, sexo, edad);
            lista_perros[cant_perros_actuales] = nuevo_perro;
            cant_perros_actuales ++;
            return nuevo_perro;
        }
        return null;
    }
    
    public static Perro buscarPerro(int id){
        // return new Perro();
        return null;
    }
    
    public static Perro[] obtenerTodosLosPerros(){
        return Perro.getListaPerros();
    }
    
    public static void inicializar(){
        ModeloBase.conectarConBaseDeDatos();
    }
    
}
