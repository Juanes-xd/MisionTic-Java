/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesionpractica3;

/**
 *
 * @author Daniel
 */
public class Producto {
    
    // Atributos
    String codigo;
    int precioCompra;
    int cantidadBodega;
    int cantidadMinima;
    
    // Constructor
    public Producto(String codigo, int precioCompra, int cantidadBodega, int cantidadMinima) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
    }
    
    // Métodos
    boolean solicitarPedido() {
        return cantidadBodega < cantidadMinima;
    }
}
