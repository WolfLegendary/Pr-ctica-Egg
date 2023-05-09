/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicio;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioPerros {

    Scanner leer = new Scanner(System.in);

    public void crearPerro(ArrayList<String> perros) {
        String respuesta;
        do {
            Perros perro = new Perros();
            System.out.println("Ingrese raza del perro.");
            perro.setRaza(leer.next());
            //Agregamos los perros creados a la colección llamada perros
            perros.add(perro.getRaza());
            //Verificamos condición del bucle While
            System.out.println("¿Desea salir? S/N");
            respuesta = leer.next();
        } while (!"S".equals(respuesta.toUpperCase()));
        //Lamamos a la función mostrar ArrayList <Perros>
        mostrarPerros(perros);
    }

    public static void mostrarPerros(ArrayList<String> perros) {
        for (String aux : perros) {
            System.out.println(aux);
        }

    }

    public void eliminarPerro(ArrayList<String> perros) {
        String raza;
        boolean status = false;
        System.out.println("Ingrese la raza de perro a eliminar.");
        raza = leer.next();

        Iterator it = perros.iterator();
        while (it.hasNext()) {
            if (it.next().equals(raza)) {
                it.remove();
                status = true;
            }
        }
        if (status) {
            System.out.println("Raza eliminada");
        } else {
            System.out.println("Raza no encontrada");
        }
        perros.sort(null);//ordena los elementos del ArrayList en orden alfabético ascendente.
        mostrarPerros(perros);
    }

}
