/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package servicioEntidades;

import entidades.equipo;
import entidades.jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class servicioEntidades {

    Scanner leertexto = new Scanner(System.in).useDelimiter("\n");
    Scanner leernum = new Scanner(System.in).useDelimiter("\n");

    public equipo crearEquipo(ArrayList<jugador> jugadores) {
        equipo equipo = new equipo();
        equipo.setJugadores(jugadores);
        return equipo;
    }

    public jugador crearJugador() {
        jugador jugador = new jugador();
        System.out.println("Ingrese nombre, apellido, posicion y número del jugador.");
        jugador.setNombre(leertexto.nextLine());
        jugador.setApellido(leertexto.nextLine());
        jugador.setPosicion(leernum.nextInt());
        jugador.setNumero(leernum.nextInt());
        return jugador;
    }

}
