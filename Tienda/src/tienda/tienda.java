package tienda;

import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

/**
 *
 * @author The Wolf Legendary
 */
public class tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciamos los servicios de cada tabla
        ProductoServicio Sproducto = new ProductoServicio();
        FabricanteServicio Sfabricante = new FabricanteServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int menu;
        System.out.println("¡Bienvenido!");
        do {
            System.out.println("Escoja una opción del menú.");
            System.out.println("1- Listamos todos los productos de la tabla.");
            System.out.println("2- Imprimimos solo los nombres y precios de los productos.");
            System.out.println("3- Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4- Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5- Listar el nombre y el precio del producto más barato.");
            System.out.println("6- Insertar producto nuevo.");
            System.out.println("7- Insertar fabricante nuevo.");
            System.out.println("8- Editar un producto con datos a elección.");
            System.out.println("9- Eliminar un producto de la lista");
            System.out.println("10- Salir.");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    try {
                        //Listamos todos los productos de la tabla.
                        Sproducto.imprimirProductos();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 2:
                    try {
                        //Imprimimos solo los nombres y precios de los productos.
                        Sproducto.imprimirProductosYprecios();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;

                case 3:
                    try {
                        //Listar aquellos productos que su precio esté entre 120 y 202.
                        Sproducto.imprimirCond1();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 4:
                    try {
                        //Buscar y listar todos los Portátiles de la tabla producto.
                        Sproducto.imprimirCond2();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 5:
                    try {
                        //Listar el nombre y el precio del producto más barato.
                        Sproducto.imprimirCond3();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 6:
                    try {
                        //Insertar producto nuevo.
                        Sproducto.isertarProductoNuevo();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 7:
                    try {
                        //Insertar fabricante nuevo.
                        Sfabricante.isertarFabricanteNuevo();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 8:
                    try {
                        //Editar un producto con datos a elección.
                        Sproducto.modificarProducto();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    System.out.println("----------------------------------------------------------------------------------------");
                    break;
                case 9:
                    try {
                        //Editar un producto con datos a elección.
                        Sproducto.eliminarProducto();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 10:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Ha ingresado una opción no valida.");
                    break;
            }
        } while (menu != 10);

    }
}
