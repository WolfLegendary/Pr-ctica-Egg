/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package ejemploguia11ej02;

import entidades.jugador;
import java.util.ArrayList;
import servicioEntidades.servicioEntidades;

/**
 *
 * @author The Wolf Legendary
 */
public class EjemploGuia11Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioEntidades service = new servicioEntidades();
        ArrayList<jugador> jugadores = new ArrayList<>();
        //Se crean 2 Jugadores y se guardan en la lista
        for (int i = 0; i < 2; i++) {
            jugadores.add(service.crearJugador());
        }
        //En el main recorreremos el equipo mostrando la información de cada jugador
        for (jugador elemento : jugadores) {
            System.out.println(elemento);
        }
    }

}
