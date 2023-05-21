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
public class Tripulante extends Persona {
    
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Tripulante(int edad, int id, String nombre, String apellido, int tipo) {
        super(id, nombre, apellido, tipo);
        this.edad = edad;
    }
    
    public static String crearTripulante(String nombre, String apellido, int edad) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if(conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "INSERT INTO PERSONAS(NOMBRE, APELLIDO, EDAD, TIPO) VALUES ('%1$s', '%2$s', %3$d, 2)";
            String query = String.format(sql, nombre, apellido, edad);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if(cantidadFilas == 1) {
                resultado = "Tripulante creado exitosamente";
            } else {
                resultado = "No fue posible crear al tripulante";
            }
        }
        return resultado;
    }
    
    public static String actualizarTripulante(int identificacion, String nombre, String apellido, int edad) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if(conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "UPDATE PERSONAS SET NOMBRE = '%1$s', APELLIDO = '%2$s', EDAD = %3$d WHERE ID = %4$d AND TIPO = 2";
            String query = String.format(sql, nombre, apellido, edad, identificacion);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if(cantidadFilas == 1) {
                resultado = "Tripulante modificado exitosamente";
            } else {
                resultado = "No fue posible modificar al tripulante";
            }
        }
        return resultado;
    }
    
    public static String eliminarTripulante(int identificacion) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if(conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "DELETE FROM PERSONAS WHERE ID = %1$d AND TIPO = 2";
            String query = String.format(sql, identificacion);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if(cantidadFilas == 1) {
                resultado = "Tripulante eliminado exitosamente";
            } else {
                resultado = "No fue posible eliminar al tripulante";
            }
        }
        return resultado;
    }
    
    public static ArrayList<String> listarTripulantes() {
        // ArrayList ==> objeto denota una lista para almacenar elementos
        // ArrayList<Tipo de Objeto>
        // ArrayList<int> ==> lista de números enteros
        // ArrayList<Instructor> ==> lista de objetos de tipo INstructor
        ArrayList<String> resultados = new ArrayList<String>();
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = "SELECT ID, NOMBRE, APELLIDO, EDAD FROM PERSONAS WHERE TIPO = 2";
        ResultSet tripulantes = conector.ejecutarQuery(conexion, query);
        try {
            while(tripulantes.next()) {
                int id = tripulantes.getInt("ID");
                String nombre = tripulantes.getString("NOMBRE");
                String apellido = tripulantes.getString("APELLIDO");
                int edad = tripulantes.getInt("EDAD");

                // ArrayList.add ==> agrega elementos a la lista
                String linea = String.format("%1$d %2$s %3$s %4$d", id, nombre, apellido, edad);
                resultados.add(linea);
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return resultados;
    }
    
}
