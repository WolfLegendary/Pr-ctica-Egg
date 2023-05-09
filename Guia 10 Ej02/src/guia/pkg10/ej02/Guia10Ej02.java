/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package guia.pkg10.ej02;
import Servicio.ServicioPerros;
import java.util.ArrayList;


/**
 *
 * @author The Wolf Legendary
 */
public class Guia10Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se llama servicio Perros
        ServicioPerros sPerros = new ServicioPerros();
        //Se crea LISTA de Perros
        ArrayList<String> perros = new ArrayList();
        
        sPerros.crearPerro(perros);
        sPerros.eliminarPerro(perros);
    }
}
