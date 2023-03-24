package primer.programa;

import java.util.Scanner;

/**
 * Ejercicio2Clase7
 */
public class PrimerPrograma {
    /*
Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida 
por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, 
la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "Si"; //Inicialmente le damos el valor de Si a respuesta para que se ejecute el bucle  
  
        do {
            System.out.println("Ingrese la cantidad de euros para realizar las conversiones.");
            
            int euros = leer.nextInt();
            leer.nextLine(); //Consumir el salto de línea pendiente

            conversion(euros);
            
            System.out.println("¿Quiere realizar otra conversión? Si/No");
        
            respuesta=leer.nextLine();
            
        } while (respuesta.equalsIgnoreCase("Si"));
    }
    //Subprograma que convierte el Euro en otras monedas
    public static void conversion(int euros) {
        System.out.println("El equivalente en libras es " + 0.86 * euros);
        System.out.println("El equivalente en dólares es " + 1.28611 * euros);
        System.out.println("El equivalente en yenes es " + 129.852 * euros);
    }
}
