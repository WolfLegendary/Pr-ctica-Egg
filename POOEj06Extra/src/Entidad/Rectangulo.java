/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" 
que calcule y devuelva el área del rectángulo. Luego crea un objeto "rectangulo1" de la clase 
"Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
 */
package Entidad;

/**
 *
 * @author The Wolf Legendary
 */
public class Rectangulo {

    public Rectangulo() {
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
    
    double lado1;
    double lado2;
    
    public double calcularArea(double lado1,double lado2){
    double area=lado1*lado2;
    return area;
    }
    
}
