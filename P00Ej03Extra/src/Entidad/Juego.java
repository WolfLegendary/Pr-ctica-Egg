/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de 
adivinanza de números. El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo" después de 
cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el 
número de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.
 */
package Entidad;

import java.util.Scanner;

/**
 * @author The Wolf Legendary
 */
public class Juego {

    private static final int NUMERO_MINIMO_INTENTOS = 1;
    private static final int NUMERO_MAXIMO_INTENTOS = 10;
    private static final int NUMERO_MAXIMO_VICTORIAS = 2;

    private int intentos;
    private int numero;
    private int respuesta;
    private int victoriasJugador1;
    private int victoriasJugador2;

    public Juego() {
        intentos = 0;
        numero = 0;
        respuesta = 0;
        victoriasJugador1 = 0;
        victoriasJugador2 = 0;
    }

    public boolean iniciarJuego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador número uno, ingrese el número para que el jugador número dos adivine.");
        numero = leer.nextInt();

        System.out.println("Jugador número uno, ingrese la cantidad de intentos (entre " + NUMERO_MINIMO_INTENTOS
                + " y " + NUMERO_MAXIMO_INTENTOS + ") para que el jugador número dos adivine.");
        intentos = leer.nextInt();

        while (intentos < NUMERO_MINIMO_INTENTOS || intentos > NUMERO_MAXIMO_INTENTOS) {
            System.out.println("La cantidad de intentos debe estar entre " + NUMERO_MINIMO_INTENTOS + " y "
                    + NUMERO_MAXIMO_INTENTOS + ".");
            intentos = leer.nextInt();
        }

        boolean ganadorJugador1 = false;
        boolean ganadorJugador2 = false;

        for (int i = 1; i <= intentos; i++) {
            System.out.println("Jugador número dos, adivine el número elegido por el jugador número uno.");
            System.out.println("Tiene " + (intentos - i + 1) + " intentos.");

            respuesta = leer.nextInt();

            if (respuesta == numero) {
                System.out.println("¡La respuesta es correcta! ¡Felicitaciones al jugador número dos!");
                ganadorJugador2 = true;
                break;
            } else if (respuesta < numero) {
                System.out.println("La respuesta es incorrecta. El número a adivinar es más alto.");
            } else {
                System.out.println("La respuesta es incorrecta. El número a adivinar es más bajo.");
            }
        }

        if (ganadorJugador2) {
            victoriasJugador2++;
        } else {
            System.out.println("¡El jugador número dos ha perdido el juego! El número correcto era " + numero);
            victoriasJugador1++;
        }

        System.out.println("El marcador actual es: Jugador 1: " + victoriasJugador1 + " victorias, Jugador 2: "
                + victoriasJugador2 + " victorias.");

        if (victoriasJugador1 >= NUMERO_MAXIMO_VICTORIAS) {
            System.out.println("¡El jugador número uno ha ganado el juego!");
            return true;
        } else if (victoriasJugador2 >= NUMERO_MAXIMO_VICTORIAS) {
            System.out.println("¡El jugador número dos ha ganado el juego!");
            return true;
        } else {
            return false;
        }
    }
}
