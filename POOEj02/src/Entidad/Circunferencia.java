/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. 
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
 */
package Entidad;

import java.util.Scanner;

public class Circunferencia {

    //Atributo
    private double radio;

    //Construtores
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //Get and Set
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //Métodos propios
    public void crearCircunferencia() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese radio de la circunferencia:");
        this.radio = leer.nextDouble();
    }

    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(this.radio, 2);
        return area;
    }

    public double calcularPerimetro() {
        double perimetro;
        perimetro = 2 * Math.PI * this.radio;
        return perimetro;
    }
}
