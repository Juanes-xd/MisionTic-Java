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
public class Horario {
    private int id;
    private String dia;
    private int hora;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Horario(int id, String dia, int hora) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
    }
    
    public static ArrayList<String> listarHorarios() {
        ArrayList<String> resultados = new ArrayList<String>();
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = "SELECT * FROM HORARIOS ORDER BY ID ASC";
        ResultSet horarios = conector.ejecutarQuery(conexion, query);
        try {
            while(horarios.next()) {
                int id = horarios.getInt("ID");
                String dia = horarios.getString("DIA");
                int hora = horarios.getInt("HORA");

                // ArrayList.add ==> agrega elementos a la lista
                String linea = String.format("%1$d %2$s %3$d", id, dia, hora);
                resultados.add(linea);
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return resultados;
    }
    
    /**
     * Devolver el día y la hora formateado de un horario a partir del ID
     * @param id
     * @return 
     */
    public static String obtenerHorario(int id) {
        String horarioFormateado = "";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        String query = String.format("SELECT DIA, HORA FROM HORARIOS WHERE ID = %1$d", id);
        ResultSet horario = conector.ejecutarQuery(conexion, query);
        try {
            int contador = 0;
            while(horario.next() && contador == 0) {
                String dia = horario.getString("DIA");
                int hora = horario.getInt("HORA");
                horarioFormateado = String.format("%1$s %2$d:00", dia, hora); // Lunes 10:00
            }
        } catch(SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return horarioFormateado;
    }
}
