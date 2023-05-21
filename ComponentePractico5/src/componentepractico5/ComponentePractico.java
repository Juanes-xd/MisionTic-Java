/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico5;

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
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        
        int numeroEntero;   // Valor entero sin decimales, 1, 2, 3...10000, etc
        float decimal1;     // Valores decimales
        double decimal2;    // Valores decimales
        boolean logico;     // true: Verdadero, false: Falso
        char caracter;      // a, b, c, d, 1, 2, @, %
        String cadena;      // daniel, hola mundo
        long numeroLargo = 123L;
        
        //tipo[] ==> vector
        int[] numeros;
        String[] cadenas;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Numero de productos a manejar: ");
        int cantidadProductos = Integer.parseInt(scanner.nextLine());
        
        Producto[] productos = new Producto[cantidadProductos];
        
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Ingrese la informacion del producto separada por guion");
            System.out.println("Codigo-precio compra-cantidad bodega-cantidad minima-cantidad maxima");
            String linea = scanner.nextLine();
            
            String[] valores = linea.split("-");
            String codigo = valores[0];
            int precioCompra = Integer.parseInt(valores[1]);
            int cantidadBodega = Integer.parseInt(valores[2]);
            int cantidadMinima = Integer.parseInt(valores[3]);
            int cantidadMaxima = Integer.parseInt(valores[4]);
            
            Producto producto = new Producto(codigo, precioCompra, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            // Insertar el producto en el vector
            productos[i] = producto;
        }
        
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
    }
    
}
