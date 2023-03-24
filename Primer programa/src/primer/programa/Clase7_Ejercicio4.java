/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.programa;

import java.util.Scanner;

/**
 *
 * @author Wolf Legendary
 */
public class Clase7_Ejercicio4 {

    /*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro 
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25
es divisible entre 5, sin embargo, 17 si es primo.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String respuesta = "Si";//Inicialmente es Si
        Boolean retorno;
        do {
            System.out.println("Ingrese un número, para determinar si es primo.");
            int num = leer.nextInt();

            leer.nextLine(); //Consumir el salto de línea pendiente

            retorno = verificar(num); //Se llama a la función para determinar si el número es primo
            System.out.print("La afirmación de que el número " + num + " es primo es ");
            System.out.println(retorno + ".");

            System.out.println("¿Quiere realizar otra consulta? Si/No");
            respuesta = leer.nextLine();

        } while (respuesta.equalsIgnoreCase("Si"));
    }

//Función que dice si el número es primo o no.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. 
    public static boolean verificar(int num) {
        if (num == 1) {
            return false;
        }
        int contador = 0;
        boolean check = true;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                // Suma 1 cuando le da resto cero. Si acumula más de dos casos el numero no es primo.
                contador++;
                // Detiene la ejecución si contador es igual a 2.
                if (contador == 2) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
}
