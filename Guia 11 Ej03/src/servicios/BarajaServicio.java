/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• crearBaraja().
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.
 */
package servicios;

import entidades.Baraja;
import entidades.Carta;
import enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class BarajaServicio {

    
    private Collections mezcla;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Carta> entregadas=new ArrayList<>();
    
    public Baraja crearBaraja() {
        Baraja baraja = new Baraja();
        ArrayList<Carta> cartas = new ArrayList<>();
        int num;

        for (Palo aux : Palo.values()) {
            for (int j = 0; j < 12; j++) {
                num = (1 + j);
                if (num == 8 || num == 9) {
                    //¡No hacemos nada!
                } else {
                    Carta carta = new Carta();
                    carta.setPalo(aux);
                    carta.setNum(num);
                    cartas.add(carta);
                }
            }
            num = 1;
        }
        baraja.setBaraja(cartas);
        return baraja;
    }

    @SuppressWarnings("static-access")

    public Baraja barajar(Baraja baraja) {
        mezcla.shuffle(baraja.getBaraja());
        return baraja;
    }

    public void mostrarBaraja(Baraja baraja) {
        for (Carta aux : baraja.getBaraja()) {
            System.out.println(aux);
        }
    }

    public Carta siguienteCarta(Baraja baraja) {
        Carta cartaSiguiente = new Carta();
        cartaSiguiente = baraja.getBaraja().get(0);
        if (cartaSiguiente != null) {
            System.out.println(baraja.getBaraja().get(0));
        } else {
            System.out.println("No hay más cartas.");
        }
        return cartaSiguiente;
    }

    public int cartasDisponibles(Baraja baraja) {
        int disponibles = baraja.getBaraja().size();
        return disponibles;
    }

    public int darCartas(Baraja baraja) {
        
        ArrayList<Carta> cartas = baraja.getBaraja();
        Iterator<Carta> it = cartas.iterator();
        int dadas;
        int control = 0;
        System.out.println("Ingrese la cantidad de cartas que desea recibir.");
        dadas = leer.nextInt();
        if (dadas <= cartasDisponibles(baraja) && dadas != 0) {

            while (it.hasNext()) {
                if (control < dadas) {
                    control++;
                    Carta carta = it.next(); // Obtener la carta actual del iterador
                    entregadas.add(carta);
                    it.remove();
                } else {
                    break;
                }
            }
            System.out.println("Se han entregado " + dadas + " cartas.");
        } else {
            if (dadas == 0) {
                System.out.println("Usted ingresó cero.\nNo se entregó ninguna carta.");
            } else {
                System.out.println("No disponemos de esa cantidad.\nNo se entregó ninguna carta.");
            }
        }
        baraja.setBaraja(cartas);
        System.out.println("Se entregarón las siguientes cartas hasta ahora:");
        for (Carta elemento : entregadas) {
            System.out.println(elemento);
        }
        return dadas;
    }

    public int cartasMonton(Baraja baraja) {
        int monton;
        monton = 40 - cartasDisponibles(baraja);
        if (monton == 0) {
            System.out.println("No ha salido ninguna carta.");
        } else {
            System.out.println("Cartas dada/s: " + monton);
        }
        return monton;
    }

    
}
