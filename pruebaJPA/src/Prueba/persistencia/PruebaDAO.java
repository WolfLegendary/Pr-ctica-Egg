package Prueba.persistencia;

import Prueba.entidades.Entidad;
import java.util.List;

/**
 *
 * @author TWL
 */
public class PruebaDAO extends DAO<Entidad> {

    @Override
    public void guardar(Entidad entidad) {
        super.guardar(entidad);
    }

    //No es buena práctica andar borrando entidades en la práctica, usaremos un bit booleano mejor.
    public void eliminarEntidad(Long id) {
        conectar();
        Entidad entidad;
        try {
            entidad = em.find(Entidad.class, id);
            if (entidad != null) {
                em.getTransaction().begin();
                em.remove(entidad);
                em.getTransaction().commit();
                System.out.println("La entidad de Id: " + id + " fue eliminada con éxito.");
            } else {
                System.out.println("No se encontro la entidad");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public void altaBajaEntidad(Long id) {
        conectar();
        Entidad entidad;
        try {
            entidad = em.find(Entidad.class, id);
            if (entidad != null) {
                if (entidad.getAlta()) {
                    entidad.setAlta(false);
                    System.out.println("Entidad dada de baja");
                } else {
                    entidad.setAlta(true);
                    System.out.println("Entidad dada de alta");
                }
                em.getTransaction().begin();
                em.merge(entidad);
                em.getTransaction().commit();
            } else {
                System.out.println("No se encontro el autor");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public Entidad buscarPorNombre(String nombre) throws Exception {
        conectar();
        Entidad entidad = (Entidad) em.createQuery("SELECT e FROM Entidad e WHERE e.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return entidad;
    }

    public void modificarEntidad(Entidad entidad) throws Exception {
        conectar();
        try {
            if (entidad != null) {
                super.editar(entidad);
                System.out.println("¡Entidad modificada con éxito!");
            } else {
                System.out.println("No existe entidad con ese nombre.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public List<Entidad> listarEntidades() {
        conectar();
        List<Entidad> entidades = em.createQuery("SELECT e FROM Entidad e")
                .getResultList();
        desconectar();
        return entidades;
    }

    
}
