package folder_principal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Perro {
    
    /*
    public int anho_nacimiento;
    public int tamanho_cm;
    public boolean castrado;
    public boolean tiene_pedigree;
    public Perro padre;
    public Perro madre;
    */
    
    public String nombre;
    public String raza;
    
    static int id_counter = 0;
    private int id;
    private String sexo;

    private String color;
    private String color_2;
    private String manchas;
    
    static Set<String> sexos_posibles = new HashSet<String>(Arrays.asList("MACHO", "HEMBRA"));
    static Set<String> colores_posibles = new HashSet<String>(Arrays.asList("Blanco", "Negro", "Cafe", "Amarillo", "Hueso", "Pardo"));
    static Set<String> secundarios_posibles = new HashSet<String>(Arrays.asList("Blanco", "Negro", "Cafe", "Amarillo", "Hueso", "Pardo", "Sin color secundario"));
    static Set<String> manchas_posibles = new HashSet<String>(Arrays.asList("Blanco", "Negro", "Cafe", "Amarillo", "Hueso", "Pardo", "Sin manchas"));


    public int get_id() {
        return id;
    }

    public Perro(String nombre_perro, String sexo_perro) {
        this(nombre_perro, sexo_perro, "NA");
    }

    public Perro(String nombre_perro, String sexo_perro, String raza_perro) {
        id_counter ++;
        id = id_counter;
        nombre = nombre_perro;
        raza = raza_perro;
        set_sexo(sexo_perro);
    }

    public void set_sexo(String sexo_perro) {
        
        if (sexos_posibles.contains(sexo_perro)) {
            sexo = sexo_perro;
        }
        else {
            System.out.println("Valores invalidos");
        }
    }

    public String get_sexo() {
        return sexo;
    }

    public void set_color(String color_perro) {
        if (colores_posibles.contains(color_perro)) {
            color = color_perro;
        }
        else {
            System.out.println("Valores invalidos - Blanco, Negro, Cafe, Amarillo, Hueso, Pardo");
        }
    }

    public String get_color() {
        return color;
    }

    public void set_color_2(String color_perro_2) {
        if (secundarios_posibles.contains(color_perro_2)) {
            color_2 = color_perro_2;
        }
        else {
            System.out.println("Valores invalidos - Blanco, Negro, Cafe, Amarillo, Hueso, Pardo");
        }
    }

    public String get_color_2() {
        return color_2;
    }

    public void set_manchas(String color_manchas) {
        if (secundarios_posibles.contains(color_manchas)) {
            manchas = color_manchas;
        }
        else {
            System.out.println("Valores invalidos - Blanco, Negro, Cafe, Amarillo, Hueso, Pardo");
        }
    }

    public String get_manchas() {
        return manchas;
    }

    public String obtenerInfo() {
        return "Nombre: " + nombre + " Id: " + id + " Raza: " + raza;
    }
   
}  
