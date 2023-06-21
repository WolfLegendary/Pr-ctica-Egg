/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Servicios;

import Entidades.Numero;
import Excepciones.ExcepcionNumero;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioNumero {

    Scanner leer = new Scanner(System.in);

    public int randomNumber() {
        System.out.println("Generando número aleatorio");
        Numero numero = new Numero();
        Random i = new Random();
        int num = i.nextInt(501) + 1;
        numero.setNumero(num);
        System.out.println("¡El número ha sido generado!");
        System.out.println("El número generado es " + num + ".");
        return num;
    }

    public void juegaAdivinar() throws ExcepcionNumero {
        int intentos = 1;
        boolean condicion = true;
        int num = randomNumber();
        System.out.println("Adivine el número generado entre 1 y 500.");
        try {
            do {
                int respuesta = leer.nextInt();
                if (respuesta != num) {
                    intentos++;
                    System.out.println("Número incorrecto, ingrese otro.");
                } else {
                    System.out.println("¡Ha acertado!");
                    System.out.println("Se han realizado " + intentos + " intentos.");
                    condicion = false;
                }
            } while (condicion);
        } catch (NumberFormatException | InputMismatchException e) {
            intentos++;
            System.out.println("Se han realizado " + intentos + " intentos.");
            throw new ExcepcionNumero("Ha ingresado algo que no es un número.");
        }catch (Exception e) {
             intentos++;
            System.out.println("Se han realizado " + intentos + " intentos.");
            throw new ExcepcionNumero("Error del sistema.");
        }

    }
}
