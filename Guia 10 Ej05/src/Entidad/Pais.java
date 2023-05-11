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
package Entidad;

import java.util.Comparator;

/**
 *
 * @author The Wolf Legendary
 */
public class Pais {

    //Atributos
    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais{" + "pais=" + pais + '}';
    }
    //Forma extendida de llamar al Comparator
    /*public static Comparator<Pais> ordenAscendente = new Comparator<Pais>() {
    @Override
    public int compare(Pais p1, Pais p2) {
        return p1.getPais().compareTo(p2.getPais());
    }
};*/
    //Forma lambda de llamar al Comparator
    public static Comparator<Pais> ordenDescendente=(p2,p1)->p1.getPais().compareTo(p2.getPais());
}
