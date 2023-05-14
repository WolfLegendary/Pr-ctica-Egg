/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package Entidad;

import java.util.Comparator;
import java.util.Map;

/**
 *
 * @author The Wolf Legendary
 */
public class Producto {

    //Atributos
    private String nombre;
    private Double precio;
    private Integer cantidad;

    public Producto() {
    }

    public Producto(String nombre, Double precio, Integer cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    public static Comparator<Map.Entry<String, Producto>> comparador = new Comparator<Map.Entry<String, Producto>>() {
        // Definir el comparador dentro del objeto
        @Override
        public int compare(Map.Entry<String, Producto> entrada1, Map.Entry<String, Producto> entrada2) {
            int cantidad1 = entrada1.getValue().getCantidad();
            int cantidad2 = entrada2.getValue().getCantidad();
            return Integer.compare(cantidad2, cantidad1);
        }

    };

}
