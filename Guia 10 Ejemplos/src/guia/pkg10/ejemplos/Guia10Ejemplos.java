/*
 */
package guia.pkg10.ejemplos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia10Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 20;
        int y = 20;
        //*********************************************LISTAS*********************************************//
        ArrayList<Integer> numerosA = new ArrayList();
        System.out.println("LISTAS");
        //Se agregan varios objetos a la colección
        numerosA.add(x);
        numerosA.add(10);
        numerosA.add(x);
        numerosA.add(y);
        numerosA.add(50);
        System.out.println(numerosA);
        numerosA.remove(0);
        System.out.println("Se elimina el elemento número 1.");
        System.out.println(numerosA);

        //Recorrre lista
        System.out.println("Se recorre lista con for each");
        for (Integer cadenaA : numerosA) {
            System.out.println(cadenaA);
        }
        //Eliminar un elemento de una coleccion con iterator
        Iterator<Integer> it = numerosA.iterator();

        while (it.hasNext()) {
            if (it.next().equals(50)) {//Borramos si el objeto es igual a 50
                it.remove();
            }
        }
        System.out.println("Se elimina el elemento número 50.");
        System.out.println(numerosA);

        //*********************************************CONJUNTOS******************************************//
        HashSet<Integer> numerosB = new HashSet();
        System.out.println("CONJUNTOS");

        numerosB.add(y);
        numerosB.add(10);
        numerosB.add(0);

        System.out.println(numerosB);

        System.out.println("Se elimina el elemento 10.");
        numerosB.remove(10);
        System.out.println(numerosB);
        System.out.println("Se recorre conjunto con for each");
        //Recorre conjunto
        for (Integer cadenaB : numerosB) {
            System.out.println(numerosB);
        }
        //*********************************************MAPAS*********************************************//
        HashMap<Integer, String> alumnos = new HashMap();
        System.out.println("MAPAS");
        Integer dni = 36046941;
        String nombreAlumnos = "Pepe";
        //Insertamos la llave y el valor
        alumnos.put(dni, nombreAlumnos);
        //Agregamos mas objetos
        alumnos.put(433577, "CaraPalida");
        System.out.println(alumnos);

        System.out.println("Se elimina el elemento con la llave 433577.");
        alumnos.remove(433577);
        System.out.println(alumnos);
        alumnos.put(433577, "CaraPalida");
        //Recorrer las dos partes del mapa
        System.out.println("Se vuelve agregar 433577 y se recorre con Map.Entry");
        for (Map.Entry<Integer, String> entry : alumnos.entrySet()) {
            System.out.println("documento=" + entry.getKey() + ",nombre=" + entry.getValue());
        }
        // Sin Map.Entry
        //Mostrar solo las llaves
        System.out.println("Se recorre mapa con for each mostrando solo llaves");
        for (Integer key : alumnos.keySet()) {
            System.out.println("Documento: " + key);
        }
        //Mostrar solo los valores
        System.out.println("Se recorre mapa con for each mostrando solo valores");
        for (String valores : alumnos.values()) {
            System.out.println("Nombre: " + valores);
        }
    }
}
