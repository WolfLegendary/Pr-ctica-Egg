/*
Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
dos métodos para calcular el área, el perímetro y el valor de PI como constante.

Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
calcule el área y el perímetro de los dos. 
En el main se crearán las formas y se mostrará el
resultado final.
Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
package servicios;

import entidades.FigurasGeometricas;
import interfaces.calculosFormas;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class calculoCirculo implements calculosFormas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    @Override
    public void calcularArea(FigurasGeometricas figura) {
        double diametro = figura.getValor();
        Double area = Math.PI * Math.pow((diametro / 2), 2);

        System.out.println("El area del círculo es " + area + ".");
    }

    @Override
    public void calcularPerimetro(FigurasGeometricas figura) {
        double diametro = figura.getValor();
        Double perimetro = Math.PI * diametro;
        System.out.println("El perímetro del círculo es " + perimetro + ".");
    }
}
