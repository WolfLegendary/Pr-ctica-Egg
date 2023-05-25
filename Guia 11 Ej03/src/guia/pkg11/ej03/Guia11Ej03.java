/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
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
package guia.pkg11.ej03;

import entidades.Baraja;
import java.util.Scanner;
import servicios.BarajaServicio;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia11Ej03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        BarajaServicio barajaServicio = new BarajaServicio();
        Scanner leer=new Scanner(System.in);
        String opc="";
        
        baraja=barajaServicio.crearBaraja();
        System.out.println("Se crea baraja.");
        
        while (!"6".equals(opc)) {            
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        opc = leer.next();
        switch (opc) {
            case "1":
                barajaServicio.barajar(baraja);
                System.out.println("Mazo barajado");
                break;
            case "2":
                barajaServicio.siguienteCarta(baraja);
                break;
            case "3":
                barajaServicio.darCartas(baraja);
                break;
            case "4":
                barajaServicio.cartasMonton(baraja);
                break;
            case "5":
                barajaServicio.mostrarBaraja(baraja);
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
     
        }
        }
      

    }
}


