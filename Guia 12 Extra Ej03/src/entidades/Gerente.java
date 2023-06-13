package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Gerente {

    //ATRIBUTOS
    private String nombre;
    private Integer dni;

    public Gerente() {
    }

    public Gerente(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

}
