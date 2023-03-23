package primer.programa;

import java.util.Scanner;

/**
 *
 */
public class PrimerPrograma {

    /**
     *
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numerosLeidos = 0;
        int numerosPares = 0;
        int numerosImpares = 0;

        while (true) {
            System.out.print("Ingrese un número entero: ");
            int numero = input.nextInt();

            if (numero < 0) {
                continue;
            }

            numerosLeidos++;

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }

            if (numero % 5 == 0) {
                break;
            }
        }

        System.out.println("Cantidad de números leídos: " + numerosLeidos);
        System.out.println("Cantidad de números pares: " + numerosPares);
        System.out.println("Cantidad de números impares: " + numerosImpares);
    }
}
