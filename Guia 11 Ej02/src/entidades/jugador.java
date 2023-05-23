/*
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class jugador {

    //Atributos
    private Integer id;
    private String nombre;
    private Boolean mojado;

    public jugador() {
    }

    public jugador(Integer id) {
        this.nombre = "Jugador " + id.toString();
        this.id = id;
        this.mojado = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "jugador{" + "Nombre=" + nombre + " , mojado=" + mojado + '}';
    }

    public boolean disparo(revolver r) {
        /*
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a TRUE y el método
devuelve true, sino false.
         */
        if (r.mojar()) {
            mojado = true;
        } else {
            mojado = false;
            r.siguienteChorro();
        }
        return mojado;
    }
}
