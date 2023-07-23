package libreria.persistencia;

import java.util.List;
import libreria.entidades.Autor;

/**
 *
 * @author The Wolf Legendary
 */
public class AutorDAO extends DAO<Autor> {

    @Override
    public void persistir(Autor autor) {
        try {
            if (autor != null) {
                super.persistir(autor);
                System.out.println("Autor guardado con éxito!");
            } else {
                System.out.println("¡Autor sin datos!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public Autor buscarAutorPorNombre(String nombre) throws Exception {
        try {
            conectar();
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                    .setParameter("nombre", nombre).getResultList();
            desconectar();
            if (!autores.isEmpty()) {
                return autores.get(0);//Devuelve el primer autor si la lista no esta vacía.
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
    
        public Autor buscarAutorPorID(Integer id) throws Exception {
        try {
            conectar();
            List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id")
                    .setParameter("id", id).getResultList();
            desconectar();
            if (!autores.isEmpty()) {
                return autores.get(0);//Devuelve el primer autor si la lista no esta vacía.
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }
}
