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
package guia.pkg12.ej04;

import entidades.Circulo;
import entidades.Rectangulo;
import servicios.calculoCirculo;
import servicios.calculoRectangulo;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia12Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo=new Circulo(1.0);
        Rectangulo rectangulo=new Rectangulo(1.0, 1.0);
        
        calculoCirculo calC=new calculoCirculo();
        calculoRectangulo calR=new calculoRectangulo();
        
        calC.calcularArea(circulo);
        calC.calcularPerimetro(circulo);
        
        calR.calcularArea(rectangulo);
        calR.calcularPerimetro(rectangulo);
    }
    
}
