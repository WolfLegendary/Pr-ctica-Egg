/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. 
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, 
el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado 
al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, 
el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y 
se devuelve el resultado al main.
 */
package Entidad;

import java.util.Scanner;

public class Operacion {

    //Atributos
    private double numero1;
    private double numero2;

    //Construtores
    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //Métodos Get y Set

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    //Métodos propios
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese número 1.");
        this.numero1 = leer.nextInt();
        System.out.println("Ingrese número 2.");
        this.numero2 = leer.nextInt();
    }

    public double calcularSuma() {
        double suma = numero1 + numero2;
        return suma;
    }

    public double calcularResta() {
        double resta = numero1 - numero2;
        return resta;
    }

    public double calcularMultiplicacion() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("¡Error! Ingrese número distinto de cero.");
            return 0;
        } else {
            double multiplicacion = numero1 * numero2;
            return multiplicacion;
        }
    }
    public double calcularDivision() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("¡Error! Ingrese número distinto de cero.");
            return 0;
        } else {
            double division = numero1 / numero2;
            return division;
        }
    }
}
