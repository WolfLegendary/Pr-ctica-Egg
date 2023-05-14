/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package guia.pkg10.ej06;

import Entidad.Producto;
import Servicio.ServicioProducto;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia10Ej06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioProducto sproducto = new ServicioProducto();
        HashMap<String, Producto> productos = new HashMap();
        Scanner leer = new Scanner(System.in);
        int menu = 0;
        boolean status = true;

        do {
            if (status) {
                System.out.println("¡Bienvenido!");
                System.out.println("Ingrese alguna de las opciones del menú:");
                System.out.println("1. Introducir producto/s a la tienda.");
                System.out.println("2. Modificar el precio de un producto de la tienda.");
                System.out.println("3. Eliminar un producto de la tienda.");
                System.out.println("4. Ordenar por cantidad disponible.");
                System.out.println("5. Ingresar productos vendidos.");
                System.out.println("6. Salir");
                status = false;
            } else {
                System.out.println("Ingrese otra de las opciones del menú:");
                System.out.println("Ingrese alguna de las opciones del menú:");
                System.out.println("1. Introducir producto/s a la tienda.");
                System.out.println("2. Modificar el precio de un producto de la tienda.");
                System.out.println("3. Eliminar un producto de la tienda.");
                System.out.println("4. Ordenar por cantidad disponible.");
                System.out.println("5. Ingresar productos vendidos.");
                System.out.println("6. Salir");
            }
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    sproducto.introducirElemento(productos);
                    break;
                case 2:
                    sproducto.modificarPrecio(productos);
                    break;
                case 3:
                    sproducto.eliminarProducto(productos);
                    break;
                case 4:
                    sproducto.ordenarPorCantidad(productos);
                    break;    
                case 5:
                    sproducto.vender(productos);
                    break;                   
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Ha ingresado una opción que no existe en el menú.");
                    System.out.println("Ingrese una opción válida.");
                    break;
            }
        } while (menu != 6);
        System.out.println("Fin del programa.");
    }
}
