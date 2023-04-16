/*
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 

Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y 
simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para 
llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse 
llenado en cuanto quedó la taza.

Método vaciarCafetera(): pone la cantidad de café actual en cero. 

Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a 
la cafetera la cantidad de café indicada.
 */
package Service;

import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ServiceCafetera {

    Scanner leer = new Scanner(System.in);
    Cafetera sCafetera = new Cafetera();

    public int llenarCafetera() {
       // sCafetera.setCapacidadMaxima(100);
        sCafetera.setCantidadActual(sCafetera.getCapacidadMaxima());
        return sCafetera.getCantidadActual();
    }

    public int servirTaza() {
        System.out.println("¿Qué tamaño tiene su taza de café?");
        int tamañoTaza = leer.nextInt();
        /*Si la cantidad actual de café “no alcanza” para 
llenar la taza, se sirve lo que quede. El método le informará al usuario si se llenó o no la taza, y de no haberse 
llenado en cuanto quedó la taza.*/
        if (sCafetera.getCantidadActual() < tamañoTaza) {
            System.out.println("Taza no se llenó por completo");
            sCafetera.setCantidadActual(0);
        } else {
            System.out.println("La Taza se llenó por completo");
            //Se resta el cafe actual menos la taza
            sCafetera.setCantidadActual(sCafetera.getCantidadActual() - tamañoTaza);
        }
        return sCafetera.getCantidadActual();

    }

    public int vaciarCafetera() {
        sCafetera.setCantidadActual(0);
        return sCafetera.getCantidadActual();
    }

//Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a 
//la cafetera la cantidad de café indicada.
    public int agregar() {
        System.out.println("Ingrese una cantidad de café.");
        int agregarCafe = leer.nextInt();

        sCafetera.setCantidadActual(sCafetera.getCantidadActual() + agregarCafe);
        if (sCafetera.getCantidadActual()>=100) {
            sCafetera.setCantidadActual(100);
        }

        return sCafetera.getCantidadActual();

    }

}
