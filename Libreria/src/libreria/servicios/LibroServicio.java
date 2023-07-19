package libreria.servicios;

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

}
/*

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


*/