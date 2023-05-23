/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver.
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author The Wolf Legendary
 */
public class juego {

    //Atributos
    private ArrayList<jugador> jugadores;
    private revolver r;

    public juego(ArrayList<jugador> jugadores, revolver r) {
        this.jugadores = jugadores;
        this.r = r;
       
    }

    public juego() {
    }

    public ArrayList<jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public revolver getR() {
        return r;
    }

    public void setR(revolver r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "juego{" + "jugadores=" + jugadores + ", r=" + r + '}';
    }

    public void llenarJuego(ArrayList<jugador>jugadoresAux, revolver rAux){
    /*
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
    */
    jugadores=jugadoresAux;
    r=rAux;
    }
    public boolean ronda(int i) {
        /*
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
         */
        boolean juegoSigue = true;
        jugadores.get(i).disparo(r);

        if (jugadores.get(i).getMojado()) {
            juegoSigue = false;
        }
        return juegoSigue;
    }
}
