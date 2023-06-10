
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Oficina {
    private Integer cantPersonas;

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Oficina(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Oficina() {
    }
}
