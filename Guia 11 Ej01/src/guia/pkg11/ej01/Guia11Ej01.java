/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package guia.pkg11.ej01;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.serviciosObjetos;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia11Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();
        serviciosObjetos servicio = new serviciosObjetos();
        String nombre;
        Scanner leer = new Scanner(System.in);
        //Agregamos dos personas a la lista
        System.out.println("Ingrese datos para crear dos personas.");
        for (int i = 0; i < 2; i++) {
            personas.add(servicio.crearPersona());
        }
        //Agregamos dos perros a la lista
        System.out.println("Ingrese datos para crear dos perros.");
        for (int i = 0; i < 2; i++) {
            perros.add(servicio.crearPerro());
        }

        for (Persona elemento : personas) {
            System.out.println("Escriba el nombre del perro, de la siguiente lista para adoptarlo.");
            for (Perro elemento1 : perros) {
                System.out.println(elemento1);
            }
            nombre = leer.nextLine();
            boolean status = false;
            for (int i = 0; i < perros.size(); i++) {
                if (nombre.equalsIgnoreCase(perros.get(i).getNombre())) {
                    elemento.setPerro(perros.get(i));
                    nombre = perros.get(i).getNombre();
                    status = true;
                    perros.remove(i);
                }
            }
            if (status) {
                System.out.println("¡El perro " + nombre + " ha sido adoptado!");
            } else {
                System.out.println("El nombre del perro no esta en la lista");
            }
            System.out.println();
        }
        System.out.println("Listado de personas con sus perros adoptados.");
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getPerro() != null) {
                System.out.println("La persona " + personas.get(i).getNombre() + " ha adoptado a " + personas.get(i).getPerro().getNombre() + ".");
            }
        }

    }

}
