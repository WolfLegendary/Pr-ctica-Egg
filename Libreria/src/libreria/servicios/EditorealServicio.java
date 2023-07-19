package libreria.servicios;

import libreria.entidades.Editoreal;
import libreria.persistencia.EditorealDAO;

/**
 *
 * @author The Wolf Legendary
 */
public class EditorealServicio {

    //Atributos
    private AutorServicio autorServicio;
    private LibroServicio libroServicio;
    private final EditorealDAO DAO;

    public EditorealServicio() {
        this.DAO = new EditorealDAO();
    }

    public void setServicios(AutorServicio autorServicio, LibroServicio libroServicio) {
        this.autorServicio = autorServicio;
        this.libroServicio = libroServicio;
    }

    public Editoreal crearEditoreal(String nombre) {
        Editoreal editoreal = new Editoreal();
        try {
            editoreal.setNombre(nombre);
            DAO.guardar(editoreal);
            return editoreal;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
