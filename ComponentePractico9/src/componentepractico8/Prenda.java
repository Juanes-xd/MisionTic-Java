/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico8;

/**
 *
 * @author Daniel
 */
public class Prenda extends Producto {
    
    // Atributos
    
    private String talla;
    private boolean permitePlanchado;
    
    // Constructor

    public Prenda(String talla, boolean permitePlanchado, String codigo, String descripcion, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
        this.talla = talla;
        this.permitePlanchado = permitePlanchado;
    }

    // Métodos

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPermitePlanchado() {
        return permitePlanchado;
    }

    public void setPermitePlanchado(boolean permitePlanchado) {
        this.permitePlanchado = permitePlanchado;
    }
    
    @Override
    public String mostrar() {
        // super.toString() hace referencia al método toString() definido en la clase Producto
        // A través de super obtenemos la referencia de la clase Padre.
        return super.toString() + "-" + talla + "-" + permitePlanchado;
    }
}
