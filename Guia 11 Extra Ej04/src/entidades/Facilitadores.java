
package entidades;

import java.util.HashSet;

/**
 *
 * @author The Wolf Legendary
 */
public class Facilitadores {

    public Facilitadores() {
    }

    public HashSet<Alumno> getFacilitadoresPrincipales() {
        return facilitadoresPrincipales;
    }

    public void setFacilitadoresPrincipales(HashSet<Alumno> facilitadoresPrincipales) {
        this.facilitadoresPrincipales = facilitadoresPrincipales;
    }

    public HashSet<Alumno> getFacilitadoresSuplentes() {
        return facilitadoresSuplentes;
    }

    public void setFacilitadoresSuplentes(HashSet<Alumno> facilitadoresSuplentes) {
        this.facilitadoresSuplentes = facilitadoresSuplentes;
    }

    @Override
    public String toString() {
        return "Facilitadores{" + "facilitadoresPrincipales=" + facilitadoresPrincipales + ", facilitadoresSuplentes=" + facilitadoresSuplentes + '}';
    }
    HashSet<Alumno> facilitadoresPrincipales;
    HashSet<Alumno> facilitadoresSuplentes;
}
