/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;



/**
 * C = Create (crear)
 * R = Read (Leer)
 * U = Update (Actualizar)
 * D = Delete (Borrar)
 * 
 * 
 * 
 * @author faanb
 */
public class Perro extends Canino {
    private int id;
    private static int contador;
    private int id_canino;
    
    public String nombre;
    public String color;
    public boolean pedigree;
    
    private Perro(int id, int id_canino, String nombre, String color, boolean pedigree, String raza, String sexo, int edad){
        // Con esto le envio la información al constructor del padre
        super(id_canino, raza, sexo, edad);
        this.nombre = nombre;
        this.color = color;
        this.pedigree = pedigree;
    }
    
    public int getId(){
        return id;
    }
    
    public String getInfo(){
        return id + ") " + nombre + " - edad: " + edad + " raza: " + raza ;
    }
    
    public static Perro crearEnBaseDeDatos(String nombre, String color, boolean pedigree, String raza, String sexo, int edad){
        int id = 0;
        int id_canino = 0;
        Canino canino_pader = Canino.crearEnBaseDeDatos(raza, sexo, edad);
        
        // Creando el Perro
        try{
            PreparedStatement query = conn.prepareStatement("Insert INTO Perro (id_canino, nombre, pedigree) VALUES (?, ?, ?);");
            query.setInt(1, id_canino);
            query.setString(2, nombre);
            query.setBoolean(3, pedigree);
            
            query.execute();
        }catch(Exception e){
            System.out.println("Error al crear el perro: " + e.getMessage());
        }

        // Consultando el id del perro recien creado 
        try {
            // Revisamos si regesó algun resultado
            PreparedStatement query = conn.prepareStatement("Select MAX(id) as id From Perro");
            ResultSet resultado = query.executeQuery();
            
            if (resultado.next() && resultado != null) {
                id = resultado.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el perro: " + e.getMessage());
        }
        
        Perro perro_creado = new Perro(id, id_canino, nombre,"N/a",pedigree, raza, sexo, edad);
        return perro_creado;
    }
    
    public static int getContador(){
        // Consultando el id del perro recien creado 
        try {
            // Revisamos si regesó algun resultado
            PreparedStatement query = conn.prepareStatement("Select COUNT(id) as id From Perro");
            ResultSet resultado = query.executeQuery();
            
            if (resultado.next() && resultado != null) {
                return resultado.getInt("id");
            }
        } catch (Exception e) {
            System.out.println("Error al crear el perro: " + e.getMessage());
        }
        return 0;
    }
    
    public static Perro[] getListaPerros(){
        Perro[] resultado_de_la_busqueda = new Perro[getContador()];
        // Consultando todos los perros disponibles
        try {
            // Revisamos si regesó algun resultado
            PreparedStatement query = conn.prepareStatement("Select Perro.id, id_canino, nombre, edad, raza, sexo, pedigree from Perro, Canino WHERE Canino.id == Perro.id_canino");
            ResultSet resultado = query.executeQuery();
            
            int contador = 0;
            while (resultado.next()) {
                int id_del_perro =  resultado.getInt("id");
                int id_del_canino =  resultado.getInt("id_canino");
                String nombre_del_perro =  resultado.getString("nombre");
                String raza_del_perro =  resultado.getString("raza");
                int edad_del_perro =  resultado.getInt("edad");
                String sexo_del_perro =  resultado.getString("sexo");
                boolean pedigree_del_perro =  resultado.getBoolean("pedigree");
                
                Perro perro_encontrado = new Perro(
                    id_del_perro,
                    id_del_canino,
                    nombre_del_perro, 
                    "N/A",
                    pedigree_del_perro,
                    raza_del_perro,
                    sexo_del_perro,
                    edad_del_perro
                );
                resultado_de_la_busqueda[contador] = perro_encontrado;
                contador ++;
                System.out.println("Sigue buscando..." + contador);
                
            }
            System.out.println("Busqueda completada");
        } catch (Exception e) {
            System.out.println("Error al consultar lista de perros: " + e.getMessage());
        }
        return resultado_de_la_busqueda;
    }
}
