package libreria.persistencia;

import java.util.List;
import libreria.entidades.Libro;

/**
 *
 * @author The Wolf Legendary
 */
public class LibroDAO extends DAO<Libro> {

    @Override
    public void persistir(Libro libro) {
        try {
            if (libro != null) {
                super.persistir(libro);
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
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", titulo).getResultList();
            desconectar();
            if (!libros.isEmpty()) {
                return libros.get(0); // Devuelve el primer libro si la lista no está vacía
            }
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
                    System.out.println("Libro dado de baja.");
                } else {
                    libro.setAlta(true);
                    System.out.println("Libro dado de alta.");
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

    public Libro buscarPorISBN(Long isbn) throws Exception {
        try {
            conectar();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn")
                    .setParameter("isbn", isbn).getSingleResult();
            desconectar();
            return libro;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    //No es buena práctica andar borrando entidades en la práctica, usaremos un bit booleano mejor.
    public void eliminarLibro(Long isbn) {
        conectar();
        Libro libro = null;
        try {
            libro = em.find(Libro.class, isbn);
            if (libro != null) {
                em.getTransaction().begin();
                em.remove(libro);
                em.getTransaction().commit();
                System.out.println("El libro de ISBN: " + isbn + " fue eliminado con éxito.");
            } else {
                System.out.println("No se encontró el libro.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        desconectar();
    }

    public List<Libro> listarLibros() {
        try {
            conectar();
            List<Libro> libros = null;
            libros = em.createQuery("SELECT l FROM Libro l")
                    .getResultList();
            desconectar();
            if (!libros.isEmpty()) {
                return libros;
            } else {
                System.out.println("No existen libros aún.");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public Libro buscarPorNombreDeAutor(String autor) throws Exception {
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.autor.nombre LIKE :autor")
                    .setParameter("autor", autor).getResultList();
            desconectar();
            if (!libros.isEmpty()) {
                return libros.get(0);//Devuelve el primer libro si la lista no esta vacía.
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

    public Libro buscarPorNombreDeEditoreal(String nombre) throws Exception {
        try {
            conectar();
            List<Libro> libros = em.createQuery("SELECT l FROM Libro l WHERE l.editoreal.nombre LIKE :nombre")
                    .setParameter("nombre", nombre).getResultList();
            desconectar();
            if (!libros.isEmpty()) {
                return libros.get(0);//Devuelve el primer libro si la lista no esta vacía.
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return null;
    }

}
