/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentepractico8;

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
        
        System.out.println("Digite la cantidad de prendas de vestir: ");
        int cantidadPrendas = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite la cantidad de calzados: ");
        int cantidadCalzados = Integer.parseInt(scanner.nextLine());
        
        Prenda[] prendas = new Prenda[cantidadPrendas];
        Calzado[] calzados = new Calzado[cantidadCalzados];
        
        String  linea = "";
        
        System.out.println("--------------------------");
        System.out.println("PRENDAS");
        System.out.println("");
        for (int i = 0; i < cantidadPrendas; i++) {
            System.out.println("Ingrese la información de la prenda #" + (i+1));
            linea = scanner.nextLine();
            String[] datosPrenda = linea.split("-");
            String codigo = datosPrenda[0];
            String descripcion = datosPrenda[1];
            int precioCompra = Integer.parseInt(datosPrenda[2]);
            int precioVenta = Integer.parseInt(datosPrenda[3]);
            int cantidadBodega = Integer.parseInt(datosPrenda[4]);
            int cantidadMinima = Integer.parseInt(datosPrenda[5]);
            int cantidadMaxima = Integer.parseInt(datosPrenda[6]);
            String talla = datosPrenda[7];
            boolean permitePlanchado = Boolean.parseBoolean(datosPrenda[8]);
            
            Prenda prenda = new Prenda(talla, permitePlanchado, codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            prendas[i] = prenda;
        }
        System.out.println("");
        
        System.out.println("--------------------------");
        System.out.println("CALZADOS");
        System.out.println("");
        for (int i = 0; i < cantidadCalzados; i++) {
            System.out.println("Ingrese la información del calzados #" + (i+1));
            linea = scanner.nextLine();
            String[] datosCalzado = linea.split("-");
            String codigo = datosCalzado[0];
            String descripcion = datosCalzado[1];
            int precioCompra = Integer.parseInt(datosCalzado[2]);
            int precioVenta = Integer.parseInt(datosCalzado[3]);
            int cantidadBodega = Integer.parseInt(datosCalzado[4]);
            int cantidadMinima = Integer.parseInt(datosCalzado[5]);
            int cantidadMaxima = Integer.parseInt(datosCalzado[6]);
            int talla = Integer.parseInt(datosCalzado[7]);
            
            Calzado calzado = new Calzado(talla, codigo, descripcion, precioCompra, precioVenta, cantidadBodega, cantidadMinima, cantidadMaxima);
            
            calzados[i] = calzado;
        }
        
        int opcionMenu = 1;
        while(opcionMenu >0 && opcionMenu <=6) {
            opcionMenu = mostrarMenu();
            
            switch(opcionMenu) {
                case 0:
                    System.out.println("Gracias por usar la aplicación. Adios!");
                    break;
                case 1:
                    // Prendas
                    for (int i = 0; i < cantidadPrendas; i++) {
                        if(prendas[i].solicitarPedido()) {
                            System.out.println("Prenda " + prendas[i].getCodigo() + " require pedido a proveedor");
                        }
                    }
                    // Calzados
                    for (int i = 0; i < cantidadCalzados; i++) {
                        if(calzados[i].solicitarPedido()) {
                            System.out.println("Calzado " + calzados[i].getCodigo() + " requiere pedido a proveedor");
                        }
                    }
                    break;
                case 2:
                    int mayorCantidadC = Integer.MIN_VALUE;
                    int mayorPosicionC = -1;
                    String mayorCodigoC = "";
                    for (int i = 0; i < calzados.length; i++) {
                        if (calzados[i].getCantidadBodega() > mayorCantidadC) {
                            mayorCantidadC = calzados[i].getCantidadBodega();
                            mayorPosicionC = i;
                            mayorCodigoC = calzados[i].getCodigo();
                        }
                    }
                    System.out.println("El calzado con mayor cantidad de elementos es:");
                    System.out.println("Calzado " + mayorCodigoC + " - " + mayorCantidadC + " unidades");
                    break;
                case 3:
                    int mayorCantidadP = Integer.MIN_VALUE;
                    int mayorPosicionP = -1;
                    String mayorCodigoP = "";
                    for (int i = 0; i < prendas.length; i++) {
                        if (prendas[i].getCantidadBodega() > mayorCantidadP) {
                            mayorCantidadP = prendas[i].getCantidadBodega();
                            mayorPosicionP = i;
                            mayorCodigoP = prendas[i].getCodigo();
                        }
                    }
                    System.out.println("La prenda con mayor cantidad de elementos es:");
                    System.out.println("Prenda " + mayorCodigoP + " - " + mayorCantidadP + " unidades");
                    break;
                case 4:
                    System.out.println("Digite el codigo del producto:");
                    String codigoProducto = scanner.nextLine();
                    System.out.println("Digite el tipo de producto, P para prenda, C para calzado:");
                    String tipoProducto = scanner.nextLine();
                    System.out.println("Digite la nueva cantidad minima: ");
                    int nuevaCantidadMinima = Integer.parseInt(scanner.nextLine());
                    // Diga si o no
                    // si, SI, sI, Si, no, NO, nO, No
                    if(tipoProducto.equalsIgnoreCase("p")){
                        for (int i = 0; i < prendas.length; i++) {
                            if(prendas[i].getCodigo().equals(codigoProducto)) {
                                prendas[i].setCantidadMinima(nuevaCantidadMinima);
                                System.out.println("Cantidad minima actualizada. Nueva cantidad: " + prendas[i].getCantidadMinima());
                            }
                        }
                    } else if (tipoProducto.equalsIgnoreCase("c")) {
                        for (int i = 0; i < calzados.length; i++) {
                            if(calzados[i].getCodigo().equals(codigoProducto)) {
                                calzados[i].setCantidadMinima(nuevaCantidadMinima);
                                System.out.println("Cantidad minima actualizada. Nueva cantidad: " + prendas[i].getCantidadMinima());
                            }
                        }
                    } else {
                        System.out.println("Tipo de producto incorrecto.");
                    }
                    break;
                case 5:
                    System.out.println("Digite el codigo del producto");
                    String codigoVender = scanner.nextLine();
                    System.out.println("Digite el tipo de producto, P para prendas, C para calzado");
                    String tipoVender = scanner.nextLine();
                    System.out.println("Ingrese la cantidad de unidades a vender");
                    int unidadesVender = Integer.parseInt(scanner.nextLine());
                    if (tipoVender.equalsIgnoreCase("p")) {
                        int j =0;
                        boolean prendaEncontrada = false;
                        while(j < prendas.length && !prendaEncontrada) {
                            if(prendas[j].getCodigo().equals(codigoVender)) {
                                prendaEncontrada = true;
                                // Validar si las unidades alcanzas
                                if (prendas[j].getCantidadBodega() >= unidadesVender) {
                                    double valorFactura = unidadesVender * prendas[j].getPrecioVenta();
                                    double valorFacturaD = valorFactura * (1 - Producto.descuento);
                                    System.out.println("Valor factura: $" + valorFactura);
                                    System.out.println("Valor con descuento: $" + valorFacturaD);
                                    int nuevaCantidadBodega = prendas[j].getCantidadBodega() - unidadesVender;
                                    prendas[j].setCantidadBodega(nuevaCantidadBodega);
                                    System.out.println("Venta exitosa!");
                                    System.out.println("Nueva cantidad en bodega: " + prendas[j].getCantidadBodega());
                                } else {
                                    System.out.println("No hay unidades suficientes para vender de esta prenda.");
                                }
                            } else {
                                j += 1;
                            }
                        }
                        if(!prendaEncontrada) {
                            System.out.println("Lo sentimos el codigo de producto ingresado no existe. Por favor verifique e intente de nuevo.");
                        }
                    } else if (tipoVender.equalsIgnoreCase("c")) {
                        int k = 0;
                        boolean calzadoEncontrado = false;
                        while(k < calzados.length && !calzadoEncontrado) {
                            if(calzados[k].getCodigo().equals(codigoVender)) {
                                calzadoEncontrado = true;
                                // Validar si hay unidades suficientes
                                if (calzados[k].getCantidadBodega() >= unidadesVender) {
                                    double valorFactura = unidadesVender * calzados[k].getPrecioVenta();
                                    double valorFacturaD = valorFactura * (1 - Producto.descuento);
                                    System.out.println("Valor factura: $" + valorFactura);
                                    System.out.println("Valor con descuento: $" + valorFacturaD);
                                    int nuevaCantidadBodega = calzados[k].getCantidadBodega() - unidadesVender;
                                    calzados[k].setCantidadBodega(nuevaCantidadBodega);
                                    System.out.println("Venta exitosa!");
                                    System.out.println("Nueva cantidad en bodega: " + calzados[k].getCantidadBodega());
                                } else {
                                    System.out.println("No hay unidades suficientes para vender de este calzado.");
                                }
                            } else {
                                k += 1;
                            }
                        }
                        if(!calzadoEncontrado) {
                            System.out.println("Lo sentimos el codigo de producto ingresado no existe. Por favor verifique e intente de nuevo.");
                        }
                    } else {
                        System.out.println("Tipo de producto incorrecto.");
                    }
                    break;
                case 6:
                    System.out.println("Ingrese el codigo del producto");
                    String codigoMostrar = scanner.nextLine();
                    System.out.println("Ingrese el tipo del producto - P para prenda - C para calzado");
                    String tipoMostrar = scanner.nextLine();
                    // Prendas
                    if(tipoMostrar.equalsIgnoreCase("p")) {
                        for(int i=0; i < prendas.length; i++) {
                            if (prendas[i].getCodigo().equals(codigoMostrar)) {
                                System.out.println(prendas[i].mostrar());
                            }
                        }
                    }
                    // Calzados
                    else if (tipoMostrar.equalsIgnoreCase("c")){
                        for(int i=0; i < calzados.length; i++) {
                            if(calzados[i].getCodigo().equals(codigoMostrar)) {
                                System.out.println(calzados[i].mostrar());
                            }
                        }
                    }
                    // Otro tipo
                    else {
                        System.out.println("El tipo ingresado no es valido. Intente nuevamente");
                    }
                    break;
            }
        }
    }
    
    public static int mostrarMenu() {
        int opcion = -1;
        Scanner scannerMenu = new Scanner(System.in);
        while (opcion < 0 || opcion > 6) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("Digite una de las siguientes opciones:");
            System.out.println("1. Verificar productos a pedir");
            System.out.println("2. Calzado con mayor cantidad de unidades en bodega");
            System.out.println("3. Prenda con mayor cantidad de unidades en bodega");
            System.out.println("4. Modificar cantidad minima en bodega");
            System.out.println("5. Vender un producto");
            System.out.println("6. Mostrar un producto");
            System.out.println("0. Salir del programa");
            opcion = Integer.parseInt(scannerMenu.nextLine());
            System.out.println("");
        }
        return opcion;
    }
}
