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
public class Curso {
    private int id;
    private String nombre;
    private int horario;
    private int instructor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getInstructor() {
        return instructor;
    }

    public void setInstructor(int instructor) {
        this.instructor = instructor;
    }

    public Curso(int id, String nombre, int horario, int instructor) {
        this.id = id;
        this.nombre = nombre;
        this.horario = horario;
        this.instructor = instructor;
    }
    
    public static String crearCurso(String nombre, int horario, int instructor) {
        String resultado = "";
        String sql = "INSERT INTO CURSOS (NOMBRE, HORARIO, INSTRUCTOR) VALUES('%1$s', %2$d, %3$d)";
        String query = String.format(sql, nombre, horario, instructor);
        Conector conector = new Conector();
        Connection connection = conector.crearConexion();
        int cantidadFilas = conector.ejecutarActualizacion(connection, query);
        if (cantidadFilas == 1) {
            resultado = "curso fue creado exitosamente";
        } else {
            resultado = "No se pudo crear el curso.";
        }
        return resultado;
    }
    
    public static ArrayList<String> listarCursos() {
        ArrayList<String> resultados = new ArrayList<String>();
        String query = "SELECT * FROM CURSOS";
        Conector conector = new Conector();
        Connection conexion = conector.crearConexion();
        try {
            ResultSet cursos = conector.ejecutarQuery(conexion, query);
            while(cursos.next()) {
                int id = cursos.getInt("ID");
                String nombre = cursos.getString("NOMBRE");
                int idHorario = cursos.getInt("HORARIO");
                int idInstructor = cursos.getInt("INSTRUCTOR");
                String horarioFormateado = Horario.obtenerHorario(idHorario);
                String nombreInstructor = Instructor.obtenerNombreInstructor(idInstructor);
                String _linea = "%1$d - %2$s - %3$s - %4$s";
                String linea = String.format(_linea, id, nombre, horarioFormateado, nombreInstructor);
                resultados.add(linea);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return resultados;
    }
}
