/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Servicio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioProducto {

    Scanner leertexto = new Scanner(System.in).useDelimiter("\n");
    Scanner leernum = new Scanner(System.in).useDelimiter("\n");

    /**
     * @param productos Representa los productos de la tienda.
     */
    public void introducirElemento(HashMap<String, Double> productos) {
        String respuesta = "";
        String key;
        Double value;
        do {
            System.out.println("Introduza el nombre del producto que desea ingresar:");
            key = leertexto.nextLine();
            System.out.println("Introduzca el precio del producto que desea ingresar:");
            value = leernum.nextDouble();
            //Alamacenamiento del producto
            productos.put(key, value);
            System.out.println("¿Desea introducir otro producto? S/N");
            respuesta = leertexto.nextLine().toUpperCase();
        } while ("S".equals(respuesta));
        System.out.println("");
        System.out.println("Los productos ingresados son:");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("{Nombre: " + entry.getKey() + "} - {Precio: " + entry.getValue() + "}");
        }
        System.out.println("");
    }

    public void modificarPrecio(HashMap<String, Double> productos) {
        String nombreModificar = "";
        boolean status = false;
        System.out.println("Ingrese el nombre del producto para modificar su precio:");
        nombreModificar = leertexto.nextLine();
        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            if (entry.getKey().equals(nombreModificar)) {
                status = true;
                System.out.println("Ingrese el nuevo precio del producto " + nombreModificar + ":");
                entry.setValue(leernum.nextDouble());
            }
        }
        if (status) {
            System.out.println("¡El precio ha sido moficado con éxito!");
            System.out.println("");
            System.out.println("Los productos con los precios modificados quedaron así:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println("{Nombre: " + entry.getKey() + "} - {Precio: " + entry.getValue() + "}");
            }
        } else {
            System.out.println("El producto no existe en la lista.");
            System.out.println("Se sugiere ingresarlo.");
        }
        System.out.println("");
    }

    public void mostrarProductos(HashMap<String, Double> productos) {
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println("{Nombre: " + entry.getKey() + "} - {Precio: " + entry.getValue() + "}");
        }
        System.out.println("");
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        String nombreEliminar = "";
        boolean status = false;
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        nombreEliminar = leertexto.nextLine();
        Iterator<Map.Entry<String, Double>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            if (entry.getKey().equals(nombreEliminar)) {
                status = true;
                it.remove();
            }
        }
        if (status) {
            System.out.println("¡El producto ha sido eliminado con éxito!");
            System.out.println("");
            System.out.println("Los productos remanentes quedaron así:");
            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                System.out.println("{Nombre: " + entry.getKey() + "} - {Precio: " + entry.getValue() + "}");
            }
        } else {
            System.out.println("El producto no existe en la lista.");
        }
        System.out.println("");
    }

}
