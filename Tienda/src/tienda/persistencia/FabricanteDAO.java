package tienda.persistencia;

import java.util.ArrayList;
import java.util.Collection;
import tienda.entidades.Fabricante;

/**
 *
 * @author TWL
 */
public final class FabricanteDAO extends DAO{
    
    
    public Collection<Fabricante> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM Fabricante ";
            consultarBase(sql);
            Collection<Fabricante> fabricantes = new ArrayList();
            while (resultado.next()) {
                Fabricante fabricante = new Fabricante();
                //Llenamos los productos
                fabricante.setCodigo(resultado.getInt(1));
                fabricante.setNombre(resultado.getString(2));
                fabricantes.add(fabricante);
            }
            desconectarBase();
            return fabricantes;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public void insertarFabricanteNuevo(int codigo, String nombre) throws Exception {
        try {
            String sql = "INSERT INTO fabricante (codigo, nombre)\n"
                    + "VALUES (" + codigo + ",'" + nombre + "');";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }
 
    
}
