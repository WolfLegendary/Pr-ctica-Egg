package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author TWL
 */
public class ProductoServicio {

    private ProductoDAO dao;

    public ProductoServicio() {
        this.dao = new ProductoDAO();
    }

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

//Métodos 
    public void imprimirProductos() throws Exception {
        try {
            //Listamos los productos
            Collection<Producto> productos = dao.listarProductos();
            //Imprimimos los productos
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Código   Nombre                             Precio         Código de Fabricante");
                for (Producto p : productos) {
                    System.out.println(p.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirProductosYprecios() throws Exception {
        try {
            //Listamos los productos
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Nombre                            Precio");
                for (Producto p : productos) {
                    String formatoPrecio = String.format("%.2f", p.getPrecio()); // Formatear el precio con dos decimales
                    System.out.printf("%-33s %6s\n", p.getNombre(), formatoPrecio);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirCond1() throws Exception {
        try {
            //Listamos los productos
            Collection<Producto> productos = dao.listarProductosCond1();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Nombre                            Precio");
                for (Producto p : productos) {
                    String formatoPrecio = String.format("%.2f", p.getPrecio()); // Formatear el precio con dos decimales
                    System.out.printf("%-33s %6s\n", p.getNombre(), formatoPrecio);
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void imprimirCond2() throws Exception {
        try {
            //Listamos los productos
            Collection<Producto> productos = dao.listarProductosCond2();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Nombre                            Precio");
                for (Producto p : productos) {
                    String formatoPrecio = String.format("%.2f", p.getPrecio()); // Formatear el precio con dos decimales
                    System.out.printf("%-33s %6s\n", p.getNombre(), formatoPrecio);
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void imprimirCond3() throws Exception {
        try {
            //Listamos los productos
            Collection<Producto> productos = dao.listarProductosCond3();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Nombre                            Precio");
                for (Producto p : productos) {
                    String formatoPrecio = String.format("%.2f", p.getPrecio()); // Formatear el precio con dos decimales
                    System.out.printf("%-33s %6s\n", p.getNombre(), formatoPrecio);
                }
            }
        } catch (Exception e) {
            throw e;
        }

    }

    public void isertarProductoNuevo() throws Exception {
        try {
            //Listamos los productos y pedimos los datos del producto nuevo a insertar.
            int codigo;
            String nombre;
            double precio;
            int codigoFabricante;
            System.out.println("Inserte el código, nombre, precio y código del fabricante.");
            codigo = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente
            nombre = leer.nextLine();
            precio = leer.nextDouble();
            codigoFabricante = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente
            dao.insertarProductoNuevo(codigo, nombre, precio, codigoFabricante);
        } catch (Exception e) {
            throw e;
        } finally {
            imprimirProductos();
        }
    }

    public Producto buscarProducto(int codigo) {
        try {
            Producto producto = new Producto();

        } catch (Exception e) {
        }
        return null;

    }

    public void modificarProducto() throws Exception {
        try {
            Producto producto = new Producto();
            int codigo;
            String nombre;
            double precio;
            int codigoFabricante;
            System.out.println("Inserte el código del producto a modificar.");
            codigo = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente
            //Verificamos que exista el producto a ser modificado en la base de datos primero.
            producto = dao.buscarProducto(codigo);
            if (producto == null) {
                throw new Exception("No existe producto con tal código.");
            } else {
                System.out.println("Inserte el nombre, precio y código del fabricante modificado.");
                nombre = leer.nextLine();
                precio = leer.nextDouble();
                codigoFabricante = leer.nextInt();
                leer.nextLine(); // Consumir el carácter de nueva línea pendiente
                producto.setCodigo(codigo);
                producto.setNombre(nombre);
                producto.setPrecio(precio);
                producto.setCodigoFabricante(codigoFabricante);
                dao.modificarProducto(producto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            imprimirProductos();
        }
    }
    
    public void eliminarProducto() throws Exception {
        try {
            Producto producto = new Producto();
            int codigo;
            System.out.println("Inserte el código del producto a eliminar.");
            codigo = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente
            //Verificamos que exista el producto a ser modificado en la base de datos primero.
            producto = dao.buscarProducto(codigo);
            if (producto == null) {
                throw new Exception("No existe producto con tal código.");
            } else {
                dao.eliminarProducto(producto);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            imprimirProductos();
        }
    }
    
}
