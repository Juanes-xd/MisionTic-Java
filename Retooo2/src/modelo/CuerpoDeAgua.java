/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import Conexion.Conector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author Asus-PC
 */
public class CuerpoDeAgua extends ObjetoGeografico {
    private String nombre;
    private int id;
    private String tipoCuerpo;
    private String tipoAgua;
    private float irca;

    public CuerpoDeAgua(String nombre, int id, String tipoCuerpo, String tipoAgua, float irca, String municipio) {
        super(municipio);
        this.nombre = nombre;
        this.id = id;
        this.tipoCuerpo = tipoCuerpo;
        this.tipoAgua = tipoAgua;
        this.irca = irca;
    }

    public CuerpoDeAgua() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoCuerpo() {
        return tipoCuerpo;
    }

    public void setTipoCuerpo(String tipoCuerpo) {
        this.tipoCuerpo = tipoCuerpo;
    }

    public String getTipoAgua() {
        return tipoAgua;
    }

    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    public float getIrca() {
        return irca;
    }

    public void setIrca(float irca) {
        this.irca = irca;
    }

    public static String crearCuerpoAgua(String nombre, int id, String municipio, String tipoCuerpo, String tipoAgua,
            float irca) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if (conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "INSERT INTO Agua(nombre, id, municipio, tipoC, tipoA, irca) VALUES ('%1$s', %2$d, '%3$s', '%4$s', '%5$s', %6$d)";
            String query = String.format(sql, nombre, id, municipio, tipoCuerpo, tipoAgua, irca);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if (cantidadFilas == 1) {
                resultado = "Cuerpo de agua creado exitosamente";
            } else {
                resultado = "No fue posible crear al tripulante";
            }
        }
        return resultado;
    }

    public static String actualizarCuerposAgua(String nombre, int id, String municipio, String tipoCuerpo,
            String tipoAgua,
            float irca) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if (conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "UPDATE Agua SET nombre = '%1$s', id = '%2$d', municipio = '%3$s', tipoC = '%4$s', tipoA = '%5$s', irca = '%6$d', WHERE id = %2$d";
            String query = String.format(sql, nombre, id, municipio, tipoCuerpo, tipoAgua, irca);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if (cantidadFilas == 1) {
                resultado = "Cuerpo de agua modificado exitosamente";
            } else {
                resultado = "No fue posible modificar al cuerpo de agua";
            }
        }
        return resultado;
    }

    public static String eliminarCuerpoAgua(int id) {
        String resultado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        if (conexion == null) {
            resultado = "no fue posible conectarse a la base de datos";
        } else {
            String sql = "DELETE FROM Agua WHERE id = %2$d ";
            String query = String.format(sql, id);
            int cantidadFilas = conector.ejecutarActualizacion(conexion, query);
            if (cantidadFilas == 1) {
                resultado = "Cuerpo de agua eliminado exitosamente";
            } else {
                resultado = "No fue posible eliminar al cuerpo de agua";
            }
        }
        return resultado;
    }

    public static ArrayList<String> listarCuerposAgua() {
        // ArrayList ==> objeto denota una lista para almacenar elementos
        // ArrayList<Tipo de Objeto>
        // ArrayList<int> ==> lista de números enteros
        // ArrayList<Instructor> ==> lista de objetos de tipo INstructor
        ArrayList<String> resultados = new ArrayList<String>();
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = "SELECT nombre, id, municipio, tipoC, tipoA, irca FROM Agua";
        ResultSet CuerposAgua = conector.ejecutarQuery(conexion, query);
        try {
            while (CuerposAgua.next()) {
                String nombre = CuerposAgua.getString("nombre");
                int id = CuerposAgua.getInt("id");
                String municipio = CuerposAgua.getString("municipio");
                String tipoC = CuerposAgua.getString("tipoC");
                String tipoA = CuerposAgua.getString("tipoA");
                float irca = CuerposAgua.getFloat("irca");

                // ArrayList.add ==> agrega elementos a la lista
                String linea = String.format("%1$s %2$d %3$s %4$s %5$s %6$d", nombre, id, municipio, tipoC, tipoA,
                        irca);
                resultados.add(linea);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return resultados;
    }

    public static String buscarCuerposAgua(int Id) {
        // ArrayList ==> objeto denota una lista para almacenar elementos
        // ArrayList<Tipo de Objeto>
        // ArrayList<int> ==> lista de números enteros
        // ArrayList<Instructor> ==> lista de objetos de tipo INstructor
        String[] resultado = new String[100];
        String resultados = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = "SELECT nombre, id, municipio, tipoC, tipoA, irca FROM Agua WHERE id = Id";
        ResultSet CuerposAgua = conector.ejecutarQuery(conexion, query);
        try {
            while (CuerposAgua.next()) {
                String nombre = CuerposAgua.getString("nombre");
                int id = CuerposAgua.getInt("id");
                String municipio = CuerposAgua.getString("municipio");
                String tipoC = CuerposAgua.getString("tipoC");
                String tipoA = CuerposAgua.getString("tipoA");
                float irca = CuerposAgua.getFloat("irca");

                // ArrayList.add ==> agrega elementos a la lista
                String linea = String.format("%1$s %2$d %3$s %4$s %5$s %6$d", nombre, id, municipio, tipoC, tipoA,
                        irca);
                resultados = linea;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return resultados;
    }

    public void clasificacion(float irca) {
        String riesgo;
        if (irca >= 0 && irca <= 5) {
            riesgo = "Sin riesgo";
        } else if (irca > 5 && irca <= 14) {
            riesgo = "Bajo";
        } else if (irca > 14 && irca <= 35) {
            riesgo = "Medio";
        } else if (irca > 35 && irca <= 80) {
            riesgo = "Alto";
        } else if (irca > 80 && irca <= 100) {
            riesgo = "Inviable sanitariamnete";
        }
    }
}
