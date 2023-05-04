package Service;

import Entidad.Personas;
import java.util.Scanner;

/**
 * @author The Wolf Legendary
 */
public class ServicePersona {

    Scanner leer = new Scanner(System.in);
// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

    public boolean[] mayorDeEdad(Personas personas[]) {
        boolean[] mayorDeEdad = new boolean[personas.length];
        for (int i = 0; i < personas.length; i++) {
            mayorDeEdad[i] = personas[i].getEdad() >= 18;
        }
        return mayorDeEdad;
    }
    //   Método Crear Persona 

    public Personas crearPersona(Personas personas[]) {
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Personas();
           
            System.out.println("Ingrese nombre.");
            personas[i].setNombre(leer.nextLine());

            System.out.println("Ingrese edad.");
            personas[i].setEdad(leer.nextInt());

            System.out.println("Ingrese el sexo de la persona (H/M/O): ");
            //Lee el caracter y lo guarda en mayúscula.
            personas[i].setSexo(Character.toUpperCase(leer.next().charAt(0)));

            while (personas[i].getSexo() != 'M' && personas[i].getSexo() != 'H' && personas[i].getSexo() != 'O') {
                System.out.println("Usted ingreso un caracter no valido.");
                System.out.println("Ingrese nuevamente.");
                //Lee el caracter y lo guarda en mayúscula.
                personas[i].setSexo(Character.toUpperCase(leer.next().charAt(0)));
            }

            System.out.println("Ingrese la altura.");
            personas[i].setAltura(leer.nextDouble());

            System.out.println("Ingrese su peso.");
            personas[i].setPeso(leer.nextDouble());
            leer.nextLine();
        }
        
        return new Personas();
    }

    /*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula 
da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso 
ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:*/
    public int[] metodoCalcularIMC(Personas personas[]) {
        int[] vectorIMC = new int[personas.length];
        double IMC;

        for (int i = 0; i < personas.length; i++) {
            IMC = personas[i].getPeso() / Math.pow(personas[i].getAltura(), 2);
            if (IMC < 20) {
                vectorIMC[i] = -1;
            }
            if (IMC > 25) {
                vectorIMC[i] = 1;
            }
            vectorIMC[i] = 0;
        }
        return vectorIMC;
    }
}
