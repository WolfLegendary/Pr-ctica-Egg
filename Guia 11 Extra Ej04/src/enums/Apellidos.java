package enums;

/**
 *
 * @author The Wolf Legendary
 */
public enum Apellidos {
    TULA("Tula"),
    GARCÍA("García"),
    RODRÍGUEZ("Rodríguez"),
    MARTÍNEZ("Martínez"),
    LÓPEZ("López"),
    TULAZ("TulaZ"),
    GARCÍAZ("GarcíaZ"),
    RODRÍGUEZZ("RodríguezZ"),
    MARTÍNEZZ("MartínezZ"),
    LÓPEZZ("LópezZ");

    private String nombre;

    private Apellidos(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
  