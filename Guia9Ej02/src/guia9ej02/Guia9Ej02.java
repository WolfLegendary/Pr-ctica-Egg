/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los cuales se realizarán 
diferentes operaciones matemáticas. La clase debe tener un constructor vacío, getters y setters. 
En el constructor vacío se usará el Math.random para generar los dos números. 
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente 
se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada 
se debe obtener 
el valor absoluto del número.
 */
package guia9ej02;

import Service.ServiceParDeNumeros;
import java.text.DecimalFormat;

/**
 *
 * @author USUARIO
 */
public class Guia9Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceParDeNumeros reales=new ServiceParDeNumeros();
        DecimalFormat df = new DecimalFormat("#.####");// Cuestión estética para mostrar menos decimales(4).
        reales.mostrarValores();
        System.out.println("El mayor valor generado es: "+df.format(reales.devolverMayor())+".");
        System.out.println("La potencia del número mayor es: "+df.format(reales.calcularPotencia())+".");
        System.out.println("La raiz cuadradada del número menor absoluto es: "+df.format(reales.calcularRaiz())+".");
        
    }
    
}
