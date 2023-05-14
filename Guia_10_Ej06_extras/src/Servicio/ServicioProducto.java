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

import Entidad.Producto;
import static Entidad.Producto.comparador;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
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
     * @param productos Representa los productos de la tienda, posee el nombre que hará de key y precio, cantidad como atributos secundarios.
     */
    public void introducirElemento(HashMap<String, Producto> productos) {
        String respuesta = "";
        String key;
        Double value;
        int cantidad;
        do {
            System.out.println("Introduza el nombre del producto que desea ingresar:");
            key = leertexto.nextLine();
            System.out.println("Introduzca el precio del producto que desea ingresar:");
            value = leernum.nextDouble();
            System.out.println("Introduzca la cantidad del producto que desea ingresar:");
            cantidad = leernum.nextInt();
            //Creación del producto
            Producto producto = new Producto(key, value, cantidad);
            //Almacenamiento del producto
            productos.put(key, producto);
            System.out.println("¿Desea introducir otro producto? S/N");
            respuesta = leertexto.nextLine().toUpperCase();
        } while ("S".equals(respuesta));
        System.out.println();
        System.out.println("Los productos ingresados son:");
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
            System.out.println("{Nombre: " + producto.getNombre() + "} - {Precio: " + producto.getPrecio() + "}" + "} - {Cantidad: " + producto.getCantidad() + "}");
        }
        System.out.println();
    }
    
    public void modificarPrecio(HashMap<String, Producto> productos) {
        String nombreModificar = "";
        boolean status = false;
        System.out.println("Ingrese el nombre del producto para modificar su precio:");
        nombreModificar = leertexto.nextLine();
        Iterator<Map.Entry<String, Producto>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Producto> entry = it.next();//Para acceder a los atributos de la colección productos
            Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
            if (entry.getKey().equals(nombreModificar)) {
                status = true;
                System.out.println("Ingrese el nuevo precio del producto " + nombreModificar + ":");
                producto.setPrecio(leernum.nextDouble());
            }
        }
        if (status) {
            System.out.println("¡El precio ha sido moficado con éxito!");
            System.out.println("");
            System.out.println("Los productos con los precios modificados quedaron así:");
            for (Map.Entry<String, Producto> entry : productos.entrySet()) {
                Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
                System.out.println("{Nombre: " + producto.getNombre() + "} - {Precio: " + producto.getPrecio() + "}" + "} - {Cantidad: " + producto.getCantidad() + "}");
            }
        } else {
            System.out.println("El producto no existe en la lista.");
            System.out.println("Se sugiere ingresarlo.");
        }
        System.out.println();
    }
    
    public void mostrarProductos(HashMap<String, Producto> productos) {
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
            System.out.println("{Nombre: " + producto.getNombre() + "} - {Precio: " + producto.getPrecio() + "}" + "} - {Cantidad: " + producto.getCantidad() + "}");
        }
        System.out.println();
    }
    
    public void eliminarProducto(HashMap<String, Producto> productos) {
        String nombreEliminar = "";
        boolean status = false;
        System.out.println("Ingrese el nombre del producto que desea eliminar:");
        nombreEliminar = leertexto.nextLine();
        Iterator<Map.Entry<String, Producto>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Producto> entry = it.next();
            if (entry.getKey().equals(nombreEliminar)) {
                status = true;
                it.remove();
            }
        }
        if (status) {
            System.out.println("¡El producto ha sido eliminado con éxito!");
            System.out.println("");
            System.out.println("Los productos remanentes quedaron así:");
            for (Map.Entry<String, Producto> entry : productos.entrySet()) {
                Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
                System.out.println("{Nombre: " + producto.getNombre() + "} - {Precio: " + producto.getPrecio() + "}" + "} - {Cantidad: " + producto.getCantidad() + "}");
            }
        } else {
            System.out.println("El producto no existe en la lista.");
        }
        System.out.println();
    }
    
    public void ordenarPorCantidad(HashMap<String, Producto> productos) {
        List<Map.Entry<String, Producto>> listaProductos = new ArrayList<>(productos.entrySet());

        // Ordenar la lista de productos utilizando el comparador
        listaProductos.sort(comparador);
        
        System.out.println("Productos ordenados por cantidad:");
        for (Map.Entry<String, Producto> entry : listaProductos) {
            Producto producto = entry.getValue();
            System.out.println("{Nombre: " + producto.getNombre() + "} - {Precio: " + producto.getPrecio() + "} - {Cantidad: " + producto.getCantidad() + "}");
        }
        System.out.println();
        
    }
    
    public void vender(HashMap<String, Producto> productos) {
        String nombreEliminar = "";
        boolean status = false;
        int vendidos = 0;
        System.out.println("Ingrese el nombre del producto vendido:");
        nombreEliminar = leertexto.nextLine();
        System.out.println("Ingrese la cantidad de producto vendido.");
        vendidos = leernum.nextInt();
        Iterator<Map.Entry<String, Producto>> it = productos.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Producto> entry = it.next();
            if (entry.getKey().equals(nombreEliminar)) {
                status = true;
                Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
                producto.setCantidad(producto.getCantidad() - vendidos);
            }
        }
        if (status) {
            System.out.println("");
            System.out.println("Los productos remanentes quedaron así:");
            for (Map.Entry<String, Producto> entry : productos.entrySet()) {
                Producto producto = entry.getValue();//Para acceder a los atributos del objeto almacenado en la colección productos
                System.out.println("{Nombre: " + producto.getNombre() + "} - {Precio: " + producto.getPrecio() + "}" + "} - {Cantidad: " + producto.getCantidad() + "}");
            }
        } else {
            System.out.println("El producto no existe en la lista.");
        }
        System.out.println();
        
    }
}
