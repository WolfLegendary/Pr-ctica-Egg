/*
Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce 
meses del año, en minúsculas. A continuación, declara una variable mesSecreto de tipo String, y 
hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El programa debe pedir al 
usuario que adivine el mes secreto. Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir 
que vuelva a intentar adivinar el mes secreto.  Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Service;

import Entidad.Meses;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServiceMeses {

    Scanner leer = new Scanner(System.in);

    public void juegoAdivinarMes() {
        System.out.println("El siguiente juego consiste en adivinar el mes del año secreto.");
        //Se crea objeto mes
        Meses mes = new Meses();
        String[] meses = mes.getMeses();
        //Respuesta ingresada por teclado
        String mesElegido;

        int[] elementos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        Random r = new Random();
        int index = r.nextInt(elementos.length);
        //Generamos un mes aleatorio
        String mesAleatorio = meses[index];

        //Comienzo del Juego
        System.out.println("Escoja un mes del año.");
        do {

            mesElegido = leer.next();
            if (mesElegido.equals(mesAleatorio)) {
                System.out.println("¡Ha acertado!");

            } else {
                System.out.println("¡Ha fallado!");
                System.out.println("Ingrese nuevamente otro mes.");
            }
        } while (!mesElegido.equals(mesAleatorio));

    }

}
