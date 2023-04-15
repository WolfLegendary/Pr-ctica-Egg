package Service;

import Entidad.Personas;
import java.util.Scanner;

/**
 * @author The Wolf Legendary
 */
public class ServicePersona {

    //LLamada de onjetos
    Personas spersonas = new Personas();
    Scanner leer = new Scanner(System.in);
    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
    public boolean mayorDeEdad(){
    return spersonas.getEdad()>=18;
    }
    //   Método Crear Persona 
    public void crearPersona() {

        System.out.println("Ingrese nombre.");
        spersonas.setNombre(leer.next());

        System.out.println("Ingrese edad.");
        spersonas.setEdad(leer.nextInt());

        System.out.println("Ingrese el sexo de la persona (H/M/O): ");
        //Lee el caracter y lo guarda en mayúscula.
        spersonas.setSexo(Character.toUpperCase(leer.next().charAt(0)));

        while (spersonas.getSexo() != 'M' && spersonas.getSexo() != 'H' && spersonas.getSexo() != 'O') {
            System.out.println("Usted ingreso un caracter no valido.");
            System.out.println("Ingrese nuevamente.");
        //Lee el caracter y lo guarda en mayúscula.
            spersonas.setSexo(Character.toUpperCase(leer.next().charAt(0)));
        }

        System.out.println("Ingrese la altura.");
        spersonas.setAltura(leer.nextDouble());

        System.out.println("Ingrese su peso.");
        spersonas.setPeso(leer.nextDouble());
    }
/*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula 
da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso 
ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:*/
    public int metodoCalcularIMC() {
        double IMC;
        int retorno;
        IMC = spersonas.getPeso() / Math.pow(spersonas.getAltura(), 2);
        if (IMC < 20) {
            retorno = -1;
            return retorno;
        }
        if (IMC > 25) {
            retorno = 1;
            return retorno;
        }
        retorno = 0;
        return retorno;
    }
}


