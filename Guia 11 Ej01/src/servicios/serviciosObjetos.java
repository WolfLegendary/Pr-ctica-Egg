/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package servicios;

import entidades.Perro;
import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class serviciosObjetos {

    Scanner leerTexto = new Scanner(System.in);
    Scanner leerNum = new Scanner(System.in);

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese el nombre, apellido, edad y documento de la persona.");
        persona.setNombre(leerTexto.nextLine());
        persona.setApellido(leerTexto.nextLine());
        persona.setEdad(leerNum.nextInt());
        persona.setDocumento(leerNum.nextInt());
        return persona;
    }

    public Perro crearPerro() {
        Perro perro = new Perro();
        System.out.println("Ingrese nombre, raza, edad y tamaño del perro.");
        perro.setNombre(leerTexto.nextLine());
        perro.setRaza(leerTexto.nextLine());
        perro.setEdad(leerNum.nextInt());
        perro.setTamanio(leerTexto.nextLine());
        return perro;
    }

}
