package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Producto;

/**
 * @author The Wolf Legendary
 */
public final class ProductoDAO extends DAO{
    
    public Collection<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Producto ";
            consultarBase(sql);
            //Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto producto = new Producto();
                //Llenamos los productos
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductosCond1() throws Exception {
        try {
            String sql = "SELECT *\n"
                    + "FROM producto\n"
                    + "WHERE precio BETWEEN 120 AND 210; ";
            consultarBase(sql);
            //Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()){
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductosCond2() throws Exception {
        try {
            String sql = "SELECT *\n"
                    + "FROM producto\n"
                    + "WHERE nombre LIKE'%Portátil%'";
            consultarBase(sql);
            //Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()){
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Producto> listarProductosCond3() throws Exception {
        try {
            String sql = "SELECT *\n"
                    + "FROM producto p\n"
                    + "INNER JOIN fabricante f ON p.codigo_fabricante=f.codigo\n"
                    + "ORDER BY p.precio ASC\n"
                    + "LIMIT 1;";
            consultarBase(sql);
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                Producto producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getInt(3));
                producto.setCodigoFabricante(resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
 
    public void insertarProductoNuevo(int codigo, String nombre, double precio, int codigoFabricante) throws Exception {
        try {
            String sql = "INSERT INTO producto (codigo, nombre, precio, codigo_fabricante)\n"
                    + "VALUES (" + codigo + ",'" + nombre + "'," + precio + "," + codigoFabricante + ");";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarProducto(Producto producto) throws Exception {
        try {
            if (producto == null) {
                throw new Exception("Debe indicar el producto que desea modificar");
            }
            String sql = "UPDATE producto "
                    + "SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio() + ", codigo_fabricante = " + producto.getCodigoFabricante()
                    + " WHERE codigo = " + producto.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
        
        
        
    }

    public Producto buscarProducto(int codigo) throws Exception {
        try {
            if (codigo < 0) {
                throw new Exception("El código debe ser un número positivo.");
            }
            String sql = "SELECT *\n"
                    + "FROM producto\n"
                    + "WHERE codigo=" + codigo;
            consultarBase(sql);
            Producto producto = null;
            if (resultado.next()) {
                producto = new Producto();
                producto.setCodigo(resultado.getInt(1));
                producto.setNombre(resultado.getString(2));
                producto.setPrecio(resultado.getDouble(3));
                producto.setCodigoFabricante(resultado.getInt(4));
            }
            desconectarBase();
            return producto;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void eliminarProducto(Producto producto) throws Exception {
        try {
            if (producto ==null) {
                throw new Exception("Debe ingresar un producto para eliminarlo.");
            }
            String sql = "DELETE FROM producto WHERE codigo ="+producto.getCodigo();
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    
}
