/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author The Wolf Legendary
 */
public class equipo {

    //Atributos
    ArrayList<jugador> jugadores;

    public equipo() {
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "equipo{" + "jugadores=" + jugadores + '}';
    }

}
