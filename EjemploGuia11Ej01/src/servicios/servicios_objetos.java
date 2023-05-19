/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */

package servicios;

import entidades.DNI;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class servicios_objetos {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre de la persona.");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese el apellido de la persona");
        persona.setApellido(leer.nextLine());
        
        DNI dni=crearDNI();
        persona.setDni(dni);
        
        return persona;
    }
    
    public DNI crearDNI(){
    DNI dni=new DNI();
        System.out.println("Ingrese la serie del DNI.");
        dni.setSerie(leer.next().charAt(0));
        System.out.println("Ingrese el número de DNI.");
        dni.setNumero(leer.nextInt());
    return dni;
    }
}
