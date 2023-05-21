/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import Conexion.Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class Instructor extends Persona{
    
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Instructor(String email, int id, String nombre, String apellido, int tipo) {
        super(id, nombre, apellido, tipo);
        this.email = email;
    }
    
    public static String crearInstructor(String nombre, String apellido, String email) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if(conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "INSERT INTO PERSONAS(NOMBRE, APELLIDO, EMAIL, TIPO) VALUES ('%1$s', '%2$s', '%3$s', 1)";
            String query = String.format(sql, nombre, apellido, email);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if(cantidadFilas == 1) {
                resultado = "Instructor creado exitosamente";
            } else {
                resultado = "No fue posible crear al instructor";
            }
        }
        return resultado;
    }
    
    public static String actualizarInstructor(int identificacion, String nombre, String apellido, String email) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if(conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "UPDATE PERSONAS SET NOMBRE = '%1$s', APELLIDO = '%2$s', EMAIL = '%3$s' WHERE ID = %4$d AND TIPO = 1";
            String query = String.format(sql, nombre, apellido, email, identificacion);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if(cantidadFilas == 1) {
                resultado = "Instructor modificado exitosamente";
            } else {
                resultado = "No fue posible modificar al instructor";
            }
        }
        return resultado;
    }
    
    public static String eliminarInstructor(int identificacion) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if(conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "DELETE FROM PERSONAS WHERE ID = %1$d AND TIPO = 1";
            String query = String.format(sql, identificacion);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if(cantidadFilas == 1) {
                resultado = "Instructor eliminado exitosamente";
            } else {
                resultado = "No fue posible eliminar al instructor";
            }
        }
        return resultado;
    }
    
    public static ArrayList<String> listarInstructores() {
        // ArrayList ==> objeto denota una lista para almacenar elementos
        // ArrayList<Tipo de Objeto>
        // ArrayList<int> ==> lista de números enteros
        // ArrayList<Instructor> ==> lista de objetos de tipo INstructor
        ArrayList<String> resultados = new ArrayList<String>();
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = "SELECT ID, NOMBRE, APELLIDO, EMAIL FROM PERSONAS WHERE TIPO = 1";
        ResultSet instructores = conector.ejecutarQuery(conexion, query);
        try {
            if(instructores != null) {
                while(instructores.next()) {
                    int id = instructores.getInt("ID");
                    String nombre = instructores.getString("NOMBRE");
                    String apellido = instructores.getString("APELLIDO");
                    String email = instructores.getString("EMAIL");

                    // ArrayList.add ==> agrega elementos a la lista
                    String linea = String.format("%1$d %2$s %3$s %4$s", id, nombre, apellido, email);
                    resultados.add(linea);
                }
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return resultados;
    }
    
    public static ArrayList<String> listaCortaInstructores() {
        // ArrayList ==> objeto denota una lista para almacenar elementos
        // ArrayList<Tipo de Objeto>
        // ArrayList<int> ==> lista de números enteros
        // ArrayList<Instructor> ==> lista de objetos de tipo INstructor
        ArrayList<String> resultados = new ArrayList<String>();
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = "SELECT ID, (NOMBRE || ' ' || APELLIDO) AS NOMBRE_COMPLETO FROM PERSONAS WHERE TIPO = 1";
        ResultSet instructores = conector.ejecutarQuery(conexion, query);
        try {
            if(instructores != null) {
                while(instructores.next()) {
                    int id = instructores.getInt("ID");
                    String nombre = instructores.getString("NOMBRE_COMPLETO");

                    // ArrayList.add ==> agrega elementos a la lista
                    String linea = String.format("%1$d - %2$s", id, nombre);
                    resultados.add(linea);
                }
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return resultados;
    }
    
    public static String obtenerNombreInstructor(int id) {
        String nombreInstructor = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = String.format("SELECT (NOMBRE || ' ' || APELLIDO) AS NOMBRE_COMPLETO FROM PERSONAS WHERE ID = %1$d AND TIPO = 1", id);
        ResultSet instructor = conector.ejecutarQuery(conexion, query);
        try {
            int contador = 0;
            while(instructor.next() && contador == 0) {
                nombreInstructor = instructor.getString("NOMBRE_COMPLETO");
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return nombreInstructor;
    }
}
