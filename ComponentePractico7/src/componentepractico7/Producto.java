/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico7;

/**
 *
 * @author Daniel
 */
public class Producto {
    // Atributos
    private String codigo;
    private int precioCompra;
    private int precioVenta;
    private int cantidadBodega;
    private int cantidadMinima;
    private int cantidadMaxima;
    public static final double descuento = 0.01;
    
    // Constructor
    public Producto(String codigo, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.cantidadMaxima = cantidadMaxima;
    }

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

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
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
        this.cantidadMinima = cantidadMinima >= 0 ? cantidadMinima : 0;
        /*
        if (cantidadMinima >= 0) {
            this.cantidadMinima = cantidadMinima;
        } else {
            this.cantidadMinima = 0;
        }
        */
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }
    
    /**
     * Valida si la cantidad en bodega es menor a la cantidad mínima
     * @return true si la cantidad es menor, de lo contrario false
     */
    public boolean solicitarPedido() {
        return this.cantidadBodega < this.cantidadMinima;
    }
    
    /**
     * Calcula el total a pagar al proveedor según la cantidad de unidades a comprar
     * @param unidades cantidad de unidades a comprar
     * @return El total a pagar al proveedor
     */
    public int calcularTotalPagar(int unidades) {
        return unidades * this.precioCompra;
    }
    
}
