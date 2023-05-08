/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package guia.pkg10.ej01;

import Entidad.Perros;
import Servicio.ServicioPerros;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia10Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPerros sPerros = new ServicioPerros();
        Scanner leer = new Scanner(System.in);
        ArrayList<Perros> perros = new ArrayList();
        String respuesta = "N";

        do {
            //Agregamos los perros creados a la colección llamada perros
            perros.add(sPerros.crearPerro());
            //Verificamos condición del bucle While
            System.out.println("¿Desea salir? S/N");
            respuesta = leer.next();
        } while (!"S".equals(respuesta.toUpperCase()));
        //Lamamamos a la función mostrar ArrayList <Perros>
        mostrarPerros(perros);

    }

    public static void mostrarPerros(ArrayList<Perros> perros) {
        for (Perros aux : perros) {
            System.out.println(aux);
        }

    }

}
