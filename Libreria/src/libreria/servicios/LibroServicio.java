package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editoreal;
import libreria.entidades.Libro;
import libreria.persistencia.LibroDAO;

/**
 *
 * @author The Wolf Legendary
 */
public class LibroServicio {

    //Atributos
    private AutorServicio autorServicio;
    private EditorealServicio editorealServicio;
    private final LibroDAO DAO;

    public LibroServicio() {
        this.DAO = new LibroDAO();
    }

    public void setServicios(AutorServicio autorServicio, EditorealServicio editorealServicio) {
        this.autorServicio = autorServicio;
        this.editorealServicio = editorealServicio;
    }

    public Libro crearLibro(String titulo, Integer anio, Integer ejemplares,
            Integer ejemplaresPrestados, Integer ejemplaresRestantes,
            Autor autor, Editoreal editoreal) {
        Libro libro = new Libro();
        try {
            libro.setTitulo(titulo);
            libro.setAnio(anio);
            libro.setEjemplares(ejemplares);
            libro.setEjemplaresPrestados(ejemplaresPrestados);
            libro.setEjemplaresRestantes(ejemplaresRestantes);
            libro.setAutor(autor);
            libro.setEditoreal(editoreal);
            DAO.guardar(libro);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean eliminarPorISBN(Long isbn) {
        try {
            DAO.eliminarLibro(isbn);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Libro buscarPorTitulo(String titulo) {
        try {
            Libro libro = null;
            libro = DAO.buscarPorTitulo(titulo);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Libro> listarLibros() {
        try {
            List<Libro> libros = null;
            libros = DAO.listarLibros();
            System.out.println("");
            for (Libro libro : libros) {
                System.out.println(libro);
                System.out.println("");
            }
            return libros;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void bajaAltaLibro(Long isbn) {
        try {
            DAO.altaBajaLibro(isbn);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Libro buscarPorISBN(Long isbn) {
        try {
            Libro libro = null;
            libro = DAO.buscarPorISBN(isbn);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public void modificarLibro(Libro libro) {
        try {
            if (libro != null) {
                DAO.modificarLibro(libro);
            } else {
                System.out.println("No se econtró libro para modificar.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Libro buscarPorNombreDeAutor(String autor) {
        try {
            Libro libro = null;
            libro = DAO.buscarPorNombreDeAutor(autor);
            return libro;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    
}
