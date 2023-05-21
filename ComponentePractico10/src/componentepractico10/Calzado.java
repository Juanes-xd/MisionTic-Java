/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componentepractico10;

/**
 *
 * @author Daniel
 * 
 * Ejercicio Adicional Sesion 10

- Agregar en el menu una opción adicional llamada
"Comprar producto en el proveedor":

1. Solicitar el código del producto a comprar
2. Solicitar la cantidad de unidades a comprar
3. Solicitar el tipo de producto: P para prenda, C para calzado

4. Si la cantidad a comprar hace que la cantidad en bodega exceda la cantidad maxima, entonces no se puede hacer la compra

5. Si la cantidad a comprar no hace que la cantidad en bodega exceda la cantidad maxima, entonces vamos a hacer la compra

6. Se debe mostrar en pantalla el valor total a pagar
7. Se debe actualizar la cantidad en bodega del producto del que se hizo la compra.
 * 
 * 
 */
public class Calzado extends Producto {
    
    // Atributos
    
    private int talla;

    // Constructor

    public Calzado(int talla, String codigo, String descripcion, int precioCompra, int precioVenta, int cantidadBodega, int cantidadMinima, int cantidadMaxima) {
        super(codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
        this.talla = talla;
    }

    // Métodos
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }
    
    @Override
    public boolean solicitarPedido() {
        return this.getCantidadBodega() < this.getCantidadMinima();
    }
    
    @Override
    public int calcularTotalPagar(int unidades) {
        return unidades * this.getPrecioCompra();
    }
    
    @Override
    public String mostrar() {
        return super.toString() + "-" + talla;
    }
}
