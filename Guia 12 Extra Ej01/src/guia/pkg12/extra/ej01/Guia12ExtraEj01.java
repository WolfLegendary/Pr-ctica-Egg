/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package guia.pkg12.extra.ej01;

import java.util.Scanner;
import entidades.Alquiler;
import entidades.Barco;
import entidades.BarcoMotor;
import entidades.Cliente;
import entidades.Velero;
import entidades.Yate;
import servicios.CalAlquilerBarcoMotor;
import servicios.CalAlquilerVelero;
import servicios.CalAlquilerYate;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia12ExtraEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int menu;
        int precioFinal = 0;
        //Cliente modelo por defecto
        Barco barco = new Barco();
        Cliente cliente = new Cliente("Cliente", 36046941);
        CalAlquilerBarcoMotor calBarco = new CalAlquilerBarcoMotor();
        CalAlquilerVelero calVelero = new CalAlquilerVelero();
        CalAlquilerYate calYate = new CalAlquilerYate();
        Alquiler alquiler = new Alquiler(cliente, "01/06/2023", "11/06/2023", 0, barco, precioFinal);
        Scanner leer = new Scanner(System.in);
        System.out.println("¡Bienvenido!");
        System.out.println("Complete los datos para conocer el valor del alquiler de un barco.");
        do {
            System.out.println("Escoja un barco.");
            System.out.println("1.Barco a motor.");
            System.out.println("2.Velero.");
            System.out.println("3.Yate.");
            System.out.println("4.Salir.");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    //Instanciamos y cargamos un barco por defecto
                    BarcoMotor barcoMotor = new BarcoMotor(10, 1, 1, 2023);
                    alquiler.setBarco(barcoMotor);
                    System.out.println("Precio final: " + calBarco.calculoAlquiler(alquiler) + "$");
                    break;
                case 2:
                    //Instanciamos y cargamos un barco por defecto
                    Velero velero = new Velero(10, 1, 1, 2023);
                    alquiler.setBarco(velero);
                    System.out.println("Precio final: " + calVelero.calculoAlquiler(alquiler) + "$");
                    break;
                case 3:
                    //Instanciamos y cargamos un barco por defecto
                    Yate yate = new Yate(10, 1, 1, 1, 2023);
                    alquiler.setBarco(yate);
                    System.out.println("Precio final: " + calYate.calculoAlquiler(alquiler) + "$");
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    menu = 0;
                    break;
                default:
                    System.out.println("Eligió una opción no válida.");
                    break;
            }
        } while (menu != 0);
    }
}
