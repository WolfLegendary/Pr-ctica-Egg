/*

 */
package primer.programa;

//import java.util.Random;
import java.util.Arrays;
//import java.util.Scanner;

/**
 *
 * @WolfLegendary
 */
public class Clase4_Ejercicio_Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numerosAleatorios = new int[5];

for (int i = 0; i < numerosAleatorios.length; i++) {
    int numeroAleatorio;
    boolean numeroRepetido;

    do {
        numeroAleatorio = (int) (Math.random() * 10) + 1;
        numeroRepetido = false;

        for (int j = 0; j < i; j++) {
            if (numerosAleatorios[j] == numeroAleatorio) {
                numeroRepetido = true;
                break;
            }
        }
    } while (numeroRepetido);

    numerosAleatorios[i] = numeroAleatorio;
}

System.out.println("Los números aleatorios son: " + Arrays.toString(numerosAleatorios));
    }
}
