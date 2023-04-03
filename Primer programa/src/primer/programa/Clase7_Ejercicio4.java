/*Clase 10 29/03/2023
 */
package primer.programa;

import java.util.Scanner;

/**
 * @author Wolf Legendary
 */
public class Clase7_Ejercicio4 {

    /*

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un valor entero para N: ");
        int n = input.nextInt();
        
        int[] fibonacci = new int[n];
        fibonacci[0] = 1;
        
        if (n!=1) {
            fibonacci[1] = 1;
            for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        }
        
        System.out.println("Los primeros " + n + " números de la sucesión de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}

