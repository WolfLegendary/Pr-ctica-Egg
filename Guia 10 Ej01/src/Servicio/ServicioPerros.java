/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Servicio;

import Entidad.Perros;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioPerros {

    Scanner leer = new Scanner(System.in);

    public Perros crearPerro() {
        Perros perro=new Perros();
        System.out.println("Ingrese raza del perro.");
        perro.setRaza(leer.next());
        
        return perro;
    }

}
