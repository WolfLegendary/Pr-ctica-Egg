/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.
 */
package guia.pkg11.extra.ej01;

import entidades.Perro;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.serviciosObjetos;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia11ExtraEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Perro> perros = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();
        serviciosObjetos servicio = new serviciosObjetos();
        String nombre;
        Scanner leer = new Scanner(System.in);

        //************************Fabricamos 5 personas
        personas = servicio.fabricaPersonas(5);

        //************************Fabricamos 5 perros
        perros = servicio.fabricaPerros(5);

        for (Persona elemento : personas) {
            System.out.println("Escriba el nombre del perro, de la siguiente lista para adoptarlo.");
            for (Perro elemento1 : perros) {
                System.out.println(elemento1);
            }
            nombre = leer.nextLine();
            boolean status = false;//SI CUMPLE TODOS LOS REQUISITOS DE ADOPCIÓN
            boolean status1 = false;//ESTADO DE ADOPCIÓN
            for (int i = 0; i < perros.size(); i++) {
                if (nombre.equalsIgnoreCase(perros.get(i).getNombre())) {
                    nombre = perros.get(i).getNombre();
                    if (perros.get(i).getAdoptado()) {
                        status1 = true;
                    } else {
                        elemento.setPerro(perros.get(i));
                        status = true;
                        perros.get(i).setAdoptado(status);
                    }
                }
            }
            if (status) {
                System.out.println("¡El perro " + nombre + " ha sido adoptado!");
            } else {
                if (status1) {

                    System.out.println("El perro ya se encuentra adoptado.");
                } else {
                    System.out.println("El nombre del perro no esta en la lista.");
                }
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
