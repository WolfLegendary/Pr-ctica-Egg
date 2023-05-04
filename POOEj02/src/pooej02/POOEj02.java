/*
 */
package pooej02;

import Entidad.Circunferencia;

public class POOEj02 {

    public static void main(String[] args) {
        Circunferencia calculo = new Circunferencia(0);
        calculo.crearCircunferencia();
        System.out.println("El área de de la circunferencia creada es " + calculo.calcularArea());
        System.out.println("El perímetro de de la circunferencia creada es " + calculo.calcularPerimetro());

    }

}
