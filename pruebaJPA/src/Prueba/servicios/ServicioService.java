package Prueba.servicios;

import Prueba.entidades.Entidad;
import Prueba.persistencia.PruebaDAO;
import java.util.List;

/**
 *
 * @author TWL
 */
public class ServicioService {

    private final PruebaDAO DAO;

    public ServicioService() {
        this.DAO = new PruebaDAO();
    }

    public Entidad crearEntidad(String nombre) {
        Entidad entidad = new Entidad();
        try {
            entidad.setNombre(nombre);
            DAO.guardar(entidad);
            return entidad;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Entidad buscarPorNombre(String nombre) {
        try {
            return DAO.buscarPorNombre(nombre);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorId(Long id) {
        try {
            DAO.eliminarEntidad(id);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public void altaBajaLibroPorId(Long id) {
        try {
            DAO.altaBajaEntidad(id);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void modificarEntidad(Entidad entidad) {
        try {
            DAO.modificarEntidad(entidad);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public List<Entidad> listarEntidades() {
        try {
            return DAO.listarEntidades();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }


}
