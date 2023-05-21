/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico6;

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
        
        System.out.println("Numero de productos a manejar: ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());
        
        Producto[] productos = new Producto[cantidadProductos];
        
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese la informacion del producto separada por guion");
            System.out.println("Codigo-precio compra-precio venta-cantidad bodega-cantidad minima-cantidad maxima");
            String linea = scanner.nextLine();
            
            String[] valores = linea.split("-");
            String codigo = valores[0];
            int precioCompra = Integer.parseInt(valores[1]);
            int precioVenta = Integer.parseInt(valores[2]);
            int cantidadBodega = Integer.parseInt(valores[3]);
            int cantidadMinima = Integer.parseInt(valores[4]);
            int cantidadMaxima = Integer.parseInt(valores[5]);
            
            Producto producto = new Producto(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            // Insertar el producto en el vector
            productos[i] = producto;
        }
        
        // Hallar el producto con mayor cantidad en bodega
        int mayorPosicion = -1;
        int mayorCantidad = Integer.MIN_VALUE;
        for (int i = 0; i < cantidadProductos; i++) {
            if (productos[i].solicitarPedido()) {
                System.out.println("Se requiere hacer pedido al proveedor para el código " + productos[i].getCodigo());
            }
            
            if (productos[i].getCantidadBodega() > mayorCantidad) {
                mayorPosicion = i;
                mayorCantidad = productos[i].getCantidadBodega();
            }
        }
        System.out.println("El codigo con mayor cantidad de productos en bodega es: " + productos[mayorPosicion].getCodigo());
        System.out.println("Con " + mayorCantidad + " unidades.");
        
        // Mostrar total de compra a proveedor
        System.out.println("------");
        System.out.println("Ingrese el codigo del producto a comprar: ");
        String codigoProducto = scanner.nextLine();
        System.out.println("Ingrese la cantidad de unidades a comprar: ");
        int unidades = Integer.parseInt(scanner.nextLine());
        boolean productoEncontrado = false;
        int i = 0;
        
        while(i < cantidadProductos && !productoEncontrado) {
            // Buscar el producto en el vector a partir del código
            if(productos[i].getCodigo().equals(codigoProducto)) {
                System.out.println("El precio a pagar por las unidades es: $" + productos[i].calcularTotalPagar(unidades));
                productoEncontrado = true;
            } else {
                i += 1;
            }
        }
        if (!productoEncontrado) {
            System.out.println("Lo sentimos, el codigo ingresado no existe en el sistema.");
        }
        
        
        // Actualizar la cantidad mínima en bodega de un producto
        System.out.println("");
        System.out.println("-----------");
        System.out.println("Ingrese el código del producto a modificar la cantidad minima: ");
        String codigoModificar = scanner.nextLine();
        System.out.println("Ingrese la nueva cantidad minima de este producto: ");
        String linea = scanner.nextLine();
        int nuevaCantidadMinima = Integer.parseInt(linea);
        
        for (int k = 0; k < cantidadProductos; k++) {
            if (productos[k].getCodigo().equals(codigoModificar)) {
                System.out.println("Cantidad minima en bodega actual: " + productos[k].getCantidadMinima());
                productos[k].setCantidadMinima(nuevaCantidadMinima);
                System.out.println("Nueva cantidad minima: " + productos[k].getCantidadMinima());
            }
        }
        
    }
    
}
