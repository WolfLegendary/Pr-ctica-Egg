
package Entidades;

/**
 *
 * @author TWL
 */
public class Sintetizador {
    private Integer consumoDeEnergia;

    public Integer getConsumoDeEnergia() {
        return consumoDeEnergia;
    }

    public void setConsumoDeEnergia(Integer consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public Sintetizador(Integer consumoDeEnergia) {
        this.consumoDeEnergia = consumoDeEnergia;
    }

    public Sintetizador() {
    }
}
