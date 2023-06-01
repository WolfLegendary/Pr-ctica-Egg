package enums;

/**
 *
 * @author The Wolf Legendary
 */
public enum Nombres {
    MARTINA("Martina"),
    SANTIAGO("Santiago"),
    VALENTINA("Valentina"),
    MATEO("Mateo"),
    SOFIA("Sofía"),
    MARTINAX("Martinas"),
    SANTIAGOX("Santiagos"),
    VALENTINAX("Valentinas"),
    MATEOX("Mateos"),
    SOFIAX("Sofías");

    private String nombre;

    private Nombres(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

}
