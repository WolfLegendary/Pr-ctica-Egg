/*
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente 
se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada 
se debe obtener 
el valor absoluto del número.
 */
package Service;

import Entidad.ParDeNumeros;
import java.text.DecimalFormat;

/**
 *
 * @author The Wolf Legendary
 */
public class ServiceParDeNumeros {
    DecimalFormat df = new DecimalFormat("#.##");// Cuestión estética para mostrar menos decimales(2).
    ParDeNumeros sParDnum = new ParDeNumeros();

    //Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores() {
        System.out.println("Los valores guardados y generados son: " + df.format(sParDnum.getReal1()) + " y " + df.format(sParDnum.getReal2()) + ".");
    }

    public double devolverMayor() {
        double maximo = Math.max(sParDnum.getReal1(), sParDnum.getReal2());
        //System.out.println("El mayor número generado es: " + maximo + ".");
        return maximo;
    }

    public double devolverMinimo() {
        double minimo = Math.min(sParDnum.getReal1(), sParDnum.getReal2());
        //System.out.println("El menor número generado es: " + minimo + ".");
        return minimo;
    }

// Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente 
//se deben redondear ambos valores.
    public double calcularPotencia() {
        double maximo = Math.round(devolverMayor() * 100.0) / 100.0; //Se redondea a 2 decimales.
        double minimo = Math.round(devolverMinimo() * 100.0) / 100.0;
        double potencia = Math.pow(maximo, minimo);
        return potencia;
    }
// Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada 
// se debe obtener el valor absoluto del número.
    public double calcularRaiz() {
        double raiz = Math.sqrt(Math.abs(devolverMinimo()));
        return raiz;
    }

}
