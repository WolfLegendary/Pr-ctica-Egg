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
import entidades.Rectangulo;
import interfaces.calculosFormas;

/**
 *
 * @author The Wolf Legendary
 */
public class calculoRectangulo implements calculosFormas {

    @Override
    public void calcularArea(FigurasGeometricas figura) {
        Rectangulo rectangulo = (Rectangulo) figura;
        Double base = rectangulo.getValor();
        Double altura = rectangulo.getValor1();
        Double area = base * altura;
        System.out.println("El área del rectángulo es " + area + ".");
    }

    @Override
    public void calcularPerimetro(FigurasGeometricas figura) {
        Rectangulo rectangulo = (Rectangulo) figura;
        Double base = rectangulo.getValor();
        Double altura = rectangulo.getValor1();
        Double perimetro = (base + altura) * 2;
        System.out.println("El perímetro del rectángulo es " + perimetro + ".");
    }

}
