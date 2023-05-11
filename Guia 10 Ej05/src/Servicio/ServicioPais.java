/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)

Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.

Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.*/
package Servicio;

import Entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioPais {

    Scanner leer = new Scanner(System.in);

    public void crearPaises(HashSet<Pais> paises) {
        String respuesta = "";
        do {
            Pais pais = new Pais();
            System.out.println("Ingrese el nombre del país que desea almacenar:");
            pais.setPais(leer.next());
            //Agregamos el objeto a la colección
            paises.add(pais);
            System.out.println("¿Desea ingresar otro país a la colección? S/N:");
            respuesta = leer.next().toUpperCase();
        } while ("S".equals(respuesta));
        System.out.println("");
        System.out.println("Paises ordenados alfabéticamente:");
        mostrarPaises(paises);
    }

    public void mostrarPaises(HashSet<Pais> paises) {
        for (Pais aux : paises) {
            System.out.println(aux);
        }
    }
//De manera descendente

    public void mostrarAlfabeticamente(HashSet<Pais> paises) {
        // Para ordenar un hashset hay que convertirlo en una lista primero
        List<Pais> listaPaises = new ArrayList(paises);
        //Mostramos el hashSet ordenado ascendente
        listaPaises.sort(Pais.ordenDescendente);
        //Mostramos el hashSet ordenado ascendente
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }

    public void eliminarPais(HashSet<Pais> paises) {
        System.out.println("Ingrese el país que desea eliminar:");
        String paisAeliminar = leer.next();
        //Usamos el iterator para remover un elemento porque con el for each falla.
        Iterator<Pais> it = paises.iterator();
        boolean status = false;
        while (it.hasNext()) {
            Pais pais = new Pais();
            pais.setPais(paisAeliminar);
            if (it.next().getPais().equals(pais.getPais())) {
                status = true;
                it.remove();
            }
        }
        System.out.println("");
        if (status) {
            System.out.println("El país ingresado ha sido eliminado.");
        } else {
            System.out.println("El país ingresdo no se encontraba en la lista almacenada.");
            System.out.println("Por lo tanto, no ha sido eliminado.");
        }
        System.out.println("");
        System.out.println("Resultado final.");
        mostrarPaises(paises);
    }

}
