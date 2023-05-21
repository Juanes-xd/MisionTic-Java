/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico5;

/**
 *
 * @author Daniel
 */
public class Producto {
    
    private String codigo;
    private int precioCompra;
    private int cantidadBodega;
    private int cantidadMinima;
    private int cantidadMaxima;
    private static double descuento = 0.01;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(int precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public static double getDescuento() {
        return descuento;
    }

    public static void setDescuento(double descuento) {
        Producto.descuento = descuento;
    }
    
    public Producto(String codigo, int precioCompra, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
    }
    
    public boolean solicitarPedido() {
        return cantidadBodega < cantidadMinima;
    }
    
    public double calcularTotalPagar(int unidades) {
        return unidades * precioCompra * (1 - descuento);
    }
}
