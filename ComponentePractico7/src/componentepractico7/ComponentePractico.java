/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico7;

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
        
        int cantidadProductos = 0;
        // Solicitar la cantidad de productos hasta que el usuario ingrese un número mayor a 0
        while (cantidadProductos <= 0) {
            System.out.println("Digite la cantidad de productos a ingresar. (Debe ser mayor a 0)");
            cantidadProductos = Integer.parseInt(scanner.nextLine());
        }
        
        Producto[] productos = new Producto[cantidadProductos];
        
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese los datos del producto " + (i+1) + " separados por guion");
            
            String[] datos = scanner.nextLine().split("-");
            String codigo = datos[0];
            int precioCompra = Integer.parseInt(datos[1]);
            int precioVenta = Integer.parseInt(datos[2]);
            int cantidadBodega = Integer.parseInt(datos[3]);
            int cantidadMinima = Integer.parseInt(datos[4]);
            int cantidadMaxima = Integer.parseInt(datos[5]);
            
            Producto producto = new Producto(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            productos[i] = producto;
        }
        
        // Mostrar menu;
        int opcionMenu = 0;
        while(opcionMenu != 6) {
            opcionMenu = mostrarMenu();
            
            switch(opcionMenu) {
                // Validar productos por pedir
                case 1: 
                    for (int i = 0; i < productos.length; i++) {
                        if(productos[i].solicitarPedido()) {
                            System.out.println("Producto " + productos[i].getCodigo() + " - Se debe solicitar producto a proveedor");
                        }
                    }
                    break;
                case 2:
                    int mayorCantidad = Integer.MIN_VALUE;
                    int mayorPosicion = -1;
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i].getCantidadBodega() > mayorCantidad) {
                            mayorCantidad = productos[i].getCantidadBodega();
                            mayorPosicion = i;
                        }
                    }
                    // Producto con mayor cantidad en bodega: ___ - ___ unidades
                    System.out.println("Producto con mayor cantidad en bodega: " + productos[mayorPosicion].getCodigo() + " - " + mayorCantidad + " unidades");
                    break;
                case 3:
                    System.out.println("Ingrese el codigo a comprar: ");
                    String codigoComprar = scanner.nextLine();
                    System.out.println("Ingrese las unidades a comprar: ");
                    int unidadesComprar = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < productos.length; i++) {
                        // if (productos[i].getCodigo() == codigoComprar
                        if(productos[i].getCodigo().equals(codigoComprar)) {
                            System.out.println("Total de la compra: " + productos[i].calcularTotalPagar(unidadesComprar));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el codigo del producto a modificar");
                    String codigoModificar = scanner.nextLine();
                    System.out.println("Ingrese la nueva cantidad minima: ");
                    int cantidadModificar = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < productos.length; i++) {
                        if (productos[i].getCodigo().equals(codigoModificar)) {
                            productos[i].setCantidadMinima(cantidadModificar);
                            System.out.println("Cantidad modificada, nueva cantidad: " + productos[i].getCantidadMinima());
                        }
                    }
                    break;
                case 5:
                    System.out.println("Ingrese el codigo del producto a vender: ");
                    String codigoVender = scanner.nextLine();
                    System.out.println("Ingrese la cantidad de unidades a vender: ");
                    int unidadesVender = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < productos.length; i++) {
                        // Si el codigo del producto coincide con el que ingreso el usuario
                        if(productos[i].getCodigo().equals(codigoVender)) {
                            // Validar si tengo unidades suficientes
                            if (productos[i].getCantidadBodega() >= unidadesVender) {
                                // Valor de la venta sin descuento
                                double totalVenta = unidadesVender * productos[i].getPrecioVenta();
                                // Valor de la venta con descuento
                                double totalVentaDescuento = totalVenta * (1 - Producto.descuento);
                                System.out.println("Valor de la venta sin descuento: $" + totalVenta);
                                System.out.println("Valor de la venta con descuento: $" + totalVentaDescuento);
                                
                                // Actualizar la cantidad en bodega
                                int nuevaCantidad = productos[i].getCantidadBodega() - unidadesVender;
                                productos[i].setCantidadBodega(nuevaCantidad);
                                System.out.println("Venta exitosa. Nueva cantidad en bodega: " + productos[i].getCantidadBodega());
                            } else {
                                System.out.println("Lo sentimos. La cantidad de unidades solicitada no está disponible en bodega.");
                            }
                        }
                    }
                    break;
                // Salir
                case 6:
                    System.out.println("Gracias por hacer uso del programa. Adios!");
                    break;
            }
        }
        
    }
    
    public static int mostrarMenu() {
        Scanner scannerMenu = new Scanner(System.in);
        scannerMenu.nextLine();
        int opcion = 0;
        while(opcion < 1 || opcion > 6) {
            System.out.println("--------------------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Verificar productos por pedir");
            System.out.println("2. Mostrar producto con mayor cantidad en bodega");
            System.out.println("3. Total a pagar por pedido a realizar");
            System.out.println("4. Modificar cantidad minima de un producto");
            System.out.println("5. Vender producto");
            System.out.println("6. Salir del menu");
            opcion = Integer.parseInt(scannerMenu.nextLine());
            System.out.println("");
        }
        return opcion;
    }
    
}
