/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico4;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class ComponentePractico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        int cantidadProductos;
        Producto[] productos = new Producto[100];
        String linea = "";
        
        System.out.println("Digite la cantidad de productos");
        cantidadProductos = Integer.parseInt(scanner.nextLine());
        
        // Solicitar información de los productos
        for(int i=0; i < cantidadProductos; i++) {
            System.out.println("Ingrese los datos del producto "+ (i+1) + " separados por -");
            System.out.println("codigo-precio-cantidad bodega-cantidad minima");
            linea = scanner.nextLine();
            String[] datos = linea.split("-");
            String codigo = datos[0];
            int precioCompra = Integer.parseInt(datos[1]);
            int cantidadBodega = Integer.parseInt(datos[2]);
            int cantidadMinima = Integer.parseInt(datos[3]);
            
            // Crear la instancia del producto
            Producto producto = new Producto(codigo, precioCompra, cantidadBodega, cantidadMinima);
            
            // Insertar el producto en el vector
            productos[i] = producto;
        }
        
        // Verificar si se debe solicitar producto al proveedor
        for(int i=0; i < cantidadProductos; i++) {
            if(productos[i].solicitarPedido()) {
                System.out.println("Se requiere hacer pedido al proveedor. Producto: " + productos[i].getCodigo());
            }
        }
        
        // Verificar producto con menor cantidad
        // Recorrer el vector y comparar valor a valor
        // Una variable inicial que va a tener el valor menor posible
        int menorCantidad = Integer.MAX_VALUE; // Almacena el valor menor posible del vector
        int menorPosicion = -1; // Almacena la posicion donde está el menor valor posible
        // Valor Inicial; Limite; incrementos
        for(int i=0; i < cantidadProductos; i++) {
            if(productos[i].getCantidadBodega() < menorCantidad) {
                menorCantidad = productos[i].getCantidadBodega();
                menorPosicion = i;
            }
        }
        /*int i=0;
        while(i < cantidadProductos) {
            //... logica
            i++;
        }*/
        System.out.println("El producto con menor cantidad está en la posicion " + menorPosicion + " código: " + productos[menorPosicion].getCodigo());
        System.out.println("Con " + productos[menorPosicion].getCantidadBodega() + " unidades");
    }
    
}
