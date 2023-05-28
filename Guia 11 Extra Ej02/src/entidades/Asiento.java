package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Asiento {

    //Atributos
    private String ubicacion;
    private Espectador e;

    public Asiento() {
    }

    public Asiento(String ubicacion, Espectador e) {
        this.ubicacion = ubicacion;
        this.e = e;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Espectador getE() {
        return e;
    }

    public void setE(Espectador e) {
        this.e = e;
    }

        @Override
    public String toString() {
        String s = ubicacion;
        if (e == null) {
        s = s.concat("   |")   ; 
        } else{
            s=s.concat(" X |");
        }
        return s;
    }

}
