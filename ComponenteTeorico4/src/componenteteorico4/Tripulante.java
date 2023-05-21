/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteteorico4;

/**
 *
 * @author Daniel
 */
public class Tripulante {
    
    private String nombre;
    private int edad;
    private String genero;
    private String ciudad;
    private int ciclo;
    private String[] lenguajesProgramacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String[] getLenguajesProgramacion() {
        return lenguajesProgramacion;
    }

    public void setLenguajesProgramacion(String[] lenguajesProgramacion) {
        this.lenguajesProgramacion = lenguajesProgramacion;
    }
    
    public Tripulante(String nombre, int edad, String genero, String ciudad, int ciclo, String[] lenguajesProgramacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ciudad = ciudad;
        this.ciclo = ciclo;
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

    public Tripulante(String nombre) {
        this.nombre = nombre;
    }
    
    
}
