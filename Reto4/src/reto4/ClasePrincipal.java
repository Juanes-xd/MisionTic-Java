package folder_principal;

import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author faanb
 */
public class ClasePrincipal {

    static Scanner teclado = new Scanner(System.in);
    static Perro[] mis_perritos = new Perro[100];
    static int contador_perritos = 0;

    public static void main(String[] args) {
        // TODO code application logic here
        
        String opcion;
        boolean continuar_preguntando = true;
        
        System.out.println("Bienvenido a veterinaria MisionPerrito");
        System.out.println("Seleccione una opcion:");
        
        do{
            System.out.println("1) Registrar un perrito");
            System.out.println("2) Actualizar info de un perrito");
            System.out.println("3) Borrar un perrito");
            System.out.println("4) Mostras mis perritos");
            System.out.println("0) Salir");
            
            opcion = teclado.nextLine();
            
            switch (opcion) {
                case "1":
                    registrar_perro();
                    break;

                case "2":
                    System.out.println("No disponible aun");

                    break;
                case "3":
                    System.out.println("No disponible aun");
                    break;
                case "4":
                    for (int i=0; i<contador_perritos;i++) {
                        String info = mis_perritos[i].obtenerInfo();
                        System.out.println(info);
                    }
                    break;
                case "0":
                    continuar_preguntando = false;
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
            }
            
        }while(continuar_preguntando);
        System.out.println("Gracias por usar nuestro sistema.");
        teclado.close();
    }

    public static String assign_sexo() {
        boolean isInvalidSex = true;
        String valid_sex = null;
        while (isInvalidSex) {

            System.out.println("Ingrese sexo valido de perro");
            System.out.println("Sexos validos: MACHO, HEMBRA");
            String input_sex = teclado.nextLine().toUpperCase();

            if ((input_sex.equals("MACHO")) || (input_sex.equals("HEMBRA"))) {
                valid_sex = input_sex;
                isInvalidSex = false;
            }
            else {
                System.out.println("Sexo invalido, intenta de nuevo");
            }
        }
        return valid_sex;
    }

    public static void registrar_perro() {

        System.out.println("1");
        System.out.println("Ingrese nombre:");
        String nombre = teclado.nextLine();
        String sexo = assign_sexo();
        System.out.println("Ingrese raza:");
        String raza = teclado.nextLine();
        Perro nuevo_perrito = new Perro(nombre, sexo, raza);

        //System.out.println("Ingrese año de nacimiento:");
        //nuevo_perrito.anho_nacimiento = Integer.parseInt(teclado.nextLine());
        // Aun no pidan madre y padre !!!!

        mis_perritos[contador_perritos] = nuevo_perrito;
        contador_perritos ++;

    }
}
/*

    buscar_perro()
    actualizar_perro()
    borrar_perro()
    mostar_perro()
*/

    


