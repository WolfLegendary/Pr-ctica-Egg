
package Entidades;

/**
 *
 * @author TWL
 */
public class Consola {

    public Consola() {
    }

    public Consola(Integer consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public Integer getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(Integer consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }
    private Integer consumoDeEnergia;
}
