/*
Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: 
(b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante 
debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante
debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una 
única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que 
tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en 
caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

/**
 * @author The Wolf Legendary
 */
public class ServiceRaices {

    Raices sRaices = new Raices();
    Scanner leer = new Scanner(System.in);

    /*Metodo incerte valores de ecuación.*/
    public void crearEcuacion() {
        System.out.println("Ingrese coeficiente a.");
        sRaices.setA(leer.nextDouble());
        System.out.println("Ingrese coeficiente b.");
        sRaices.setB(leer.nextDouble());
        System.out.println("Ingrese coeficiente c.");
        sRaices.setC(leer.nextDouble());
    }

    /* Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente 
fórmula: (b^2)-4*a*c*/
    public double getDiscriminante() {
        double discriminante = Math.pow(sRaices.getB(), 2) - (4 * sRaices.getA() * sRaices.getC());
        return discriminante;
    }

    /*Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante 
debe ser mayor o igual que 0.*/
    public boolean tieneRaices() {
        double discriminante = getDiscriminante();
        return discriminante >= 0;
    }

    /*Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, 
el discriminante debe ser igual que 0.*/
    public boolean tieneRaiz() {
        double discriminante = getDiscriminante();
        return discriminante == 0;
    }

    //Método obtenerRaices(): llama a tieneRaíces() y si devolvió́  true, imprime las 2 posibles soluciones.*/
    public void obtenerRaices(double solucion1, double solucion2) {

        System.out.println("A continuación, se imprimen las dos soluciones.");
        System.out.println("Las soluciones son " + solucion1 + " y " + solucion2 + ".");
    }

    /*Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una 
única solución posible.*/
    public void obtenerRaiz(double solucion1) {

        System.out.println("A continuación, se imprime la solución.");
        System.out.println("La solución es " + solucion1 + ".");

    }

    /*Método calcular(): esté  método llamará  tieneRaices() y a tieneRaiíz(), y mostrará por pantalla las posibles soluciones 
que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y 
en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b*/
    public void calcular() {
        double discriminante = getDiscriminante();
        if (tieneRaices()) {
            double solucion1 = (-sRaices.getB() + Math.sqrt(discriminante)) / (2 * sRaices.getA());
            double solucion2 = (-sRaices.getB() - Math.sqrt(discriminante)) / (2 * sRaices.getA());
            obtenerRaices(solucion1, solucion2);
        } else if (tieneRaiz()) {
            double solucion = -sRaices.getB() / (2 * sRaices.getA());
            obtenerRaiz(solucion);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

}
