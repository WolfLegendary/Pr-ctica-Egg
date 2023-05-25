/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
se dispara y se moja. Las clases por hacer del juego son las siguientes:
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package guia.pkg11.ej02;


import entidades.juego;
import entidades.jugador;
import entidades.revolver;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia11Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<jugador>jugadores=new ArrayList<>();
        int cantidad;
        System.out.println("Ingrese la cantidad de jugadores para jugar a la Ruleta Rusa de Agua.");
        System.out.println("El número de jugadores debe estar entre 1 y 6, de lo contrario se pondran 6 por defecto.");
        cantidad = leer.nextInt();
        if (cantidad < 1 || cantidad > 6) {
            cantidad = 6;
        }
        //Se crean los jugadores, según la cantidad dada por el Usuario
        for (int i = 0; i < cantidad; i++) {
            jugador jugador=new jugador(i+1);
            jugadores.add(jugador);
        }
        for (jugador elemento : jugadores) {
            System.out.println(elemento);
        }
        System.out.println("Se va a preparar el revolver.");
        revolver r=new revolver();
        r.llenarRevolver();
        
        System.out.println("Revolver cargado. Se da inicio al juego");

        juego j = new juego();
        j.llenarJuego(jugadores, r);
        
        boolean juegoSigue = true;
        int turno = 0;
        while (juegoSigue) {
            if (turno == (cantidad)){
                turno = 0;
            }
            System.out.println("El " + j.getJugadores().get(turno).getNombre() + " procede a disparar");
            juegoSigue = j.ronda(turno);
            if (juegoSigue) {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " se salva");
            } else {
                System.out.println("El " + j.getJugadores().get(turno).getNombre() + " ha sido mojado");
                System.out.println("Juego finalizado");
            }
            turno++;
        }
        System.out.println("");
    }
        

}


