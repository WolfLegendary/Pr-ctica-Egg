/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
un atributo privado altura. La clase incluirá un método para crear el rectángulo con los datos del Rectángulo
dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para 
calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante 
asteriscos usando la base y la altura. Se deberán además definir los métodos getters, setters y constructores 
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Entidad;

import java.util.Scanner;

public class Rectangulo1 {

    //Atributos
    public Rectangulo1(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Métodos propios

    public void crearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura y base del rectágulo.");
        this.altura = leer.nextDouble();
        this.base = leer.nextDouble();
    }

    public double calcularSuperficie() {
        double superficie = base * altura;
        return superficie;
    }

    public double calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

    public void dibujarRectangulo() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (j == 0 || j == base-1 || i == 0 || i == altura-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}


