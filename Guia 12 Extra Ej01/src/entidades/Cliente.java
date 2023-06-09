   /*
    Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
    */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Cliente {

    public Cliente() {
    }

    public Cliente(String nombre, Integer documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", documento=" + documento + '}';
    }
    
    
    private String nombre;
    private Integer documento;
    
    
}
