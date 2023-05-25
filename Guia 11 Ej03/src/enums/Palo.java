/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).
 */
package enums;

/**
 *
 * @author The Wolf Legendary
 */
public enum Palo {

    ESPADA("Espada"), BASTO("Basto"), ORO("Oro"), COPA("Copa");

    //Atributo
    private String nombre;

    private Palo() {
    }

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Palo{" + "nombre=" + nombre + '}';
    }

}
