/*
 */
package pooej01extra;

import Entidad.Cancion;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class POOEj01Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion lista = new Cancion();
        Scanner leer = new Scanner(System.in);

        System.out.println("Inserte el autor y titulo de la canción.");
        lista.setAutor(leer.next());
        lista.setTitulo(leer.next());
        System.out.println("El autor es "+lista.getAutor()+".");
        System.out.println("El título es "+lista.getTitulo()+".");
    }

}
