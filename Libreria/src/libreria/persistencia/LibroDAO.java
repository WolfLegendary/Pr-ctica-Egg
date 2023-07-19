package libreria.persistencia;

import libreria.entidades.Libro;

/**
 *
 * @author The Wolf Legendary
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void guardar(Libro libro) {
        try {
            if (libro != null) {
                super.guardar(libro);
                System.out.println("Libro guardado con éxito!");
            } else {
                System.out.println("¡Libro sin datos!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public Libro buscarPorTitulo(String titulo) throws Exception {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", titulo).getSingleResult();
            desconectar();
            return libro;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public void modificarLibro(Libro libro) throws Exception {
        conectar();
        try {
            if (libro != null) {
                super.editar(libro);
                System.out.println("¡Libro modificado con éxito!");
            } else {
                System.out.println("No existe libro con ese título.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public void altaBajaLibro(Long isbn) {
        conectar();
        Libro libro = null;
        try {
            libro = em.find(Libro.class, isbn);
            if (libro != null) {
                if (libro.getAlta()) {
                    libro.setAlta(false);
                    System.out.println("Libro dado de baja");
                } else {
                    libro.setAlta(true);
                    System.out.println("Libro dado de alta");
                }
                em.getTransaction().begin();
                em.merge(libro);
                em.getTransaction().commit();
            } else {
                System.out.println("No se encontro el libro con el isbn: " + isbn + ".");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }
}
