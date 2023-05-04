/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán 
diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters. 
En el constructor vacío se usará el Math.random para generar los dos números. 
 */
package Entidad;

/**
 * @author The Wolf Legendary
 */
public class ParDeNumeros {

    private double real1;
    private double real2;

    public double getReal1() {
        return real1;
    }

    public void setReal1(double real1) {
        this.real1 = real1;
    }

    public double getReal2() {
        return real2;
    }

    public void setReal2(double real2) {
        this.real2 = real2;
    }

    public ParDeNumeros() {
      
        double real1 = Math.random() * 20 - 10;//Genera números random de -10 a 10
        double real2 = Math.random() * 20 - 10;

        this.real1=real1;
        this.real2=real2;
    }

}
