/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesionpractica3;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class SesionPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String codigo;
        int precioCompra, cantidadBodega, cantidadMinima;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el código del producto: ");
        codigo = scanner.nextLine();
        System.out.println("Ingrese el precio de compra: ");
        precioCompra = scanner.nextInt();
        // precioCompra = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese la cantidad en bodega: ");
        cantidadBodega = scanner.nextInt();
        System.out.println("Ingrese la cantidad minima: ");
        cantidadMinima = scanner.nextInt();
        
        // Instanciar un producto
        Producto producto = new Producto(codigo, precioCompra, cantidadBodega, cantidadMinima);
        
        boolean requierePedido = producto.solicitarPedido();
        if (requierePedido) {
            System.out.println("Se requiere hacer un pedido del producto " + producto.codigo + " al proveedor");
        }
                
    }
    
}

