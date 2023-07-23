package libreria.servicios;

import libreria.entidades.Autor;
import libreria.persistencia.AutorDAO;

/**
 *
 * @author The Wolf Legendary
 */
public class AutorServicio {
    //Atributos

    private LibroServicio libroServicio;
    private EditorealServicio editorealServicio;
    private final AutorDAO DAO;

    public AutorServicio() {
        this.DAO = new AutorDAO();
    }

    public void setServicios(LibroServicio libroServicio, EditorealServicio editorealServicio) {
        this.libroServicio = libroServicio;
        this.editorealServicio = editorealServicio;
    }

    public Autor crearAutor(String nombre) {
        Autor autor = new Autor();
        try {
            autor.setNombre(nombre);
            DAO.persistir(autor);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Autor buscarPorNombre(String nombre) {
        try {
            Autor autor = null;
            autor = DAO.buscarAutorPorNombre(nombre);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Autor buscarPorID(Integer id) {
        try {
            Autor autor = null;
            autor = DAO.buscarAutorPorID(id);
            return autor;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;

    }

}
