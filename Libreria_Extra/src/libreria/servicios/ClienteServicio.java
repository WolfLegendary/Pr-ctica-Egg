package libreria.servicios;

import libreria.entidades.Cliente;
import libreria.persistencia.ClienteDAO;

/**
 *
 * @author TWL
 */
public class ClienteServicio {
        //Atributos
    private AutorServicio autorServicio;
    private EditorealServicio editorealServicio;
    private LibroServicio libroServicio;
    private final ClienteDAO DAO;
    
    public ClienteServicio() {
        this.DAO = new ClienteDAO();
    }
    
    public void setServicios(AutorServicio autorServicio, EditorealServicio editorealServicio, LibroServicio libroServicio) {
        this.autorServicio = autorServicio;
        this.editorealServicio = editorealServicio;
        this.libroServicio=libroServicio;
    }
      public Cliente crearCliente(String nombre) {
        Cliente cliente = new Cliente();
        try {
            cliente.setNombre(nombre);
            DAO.persistir(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
