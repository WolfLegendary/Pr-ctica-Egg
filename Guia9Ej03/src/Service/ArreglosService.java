/*
El arreglo A de 50 números reales y el arreglo B de 20 números reales. 
Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 
10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
package Service;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author The Wolf Legendary
 */
public class ArreglosService {

    //Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
    public void inicializarA(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Math.random() * 20 - 10;//Genera aleatorios de -10 a 10
        }
    }

    //Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double[] arreglo) {
        System.out.println(Arrays.toString(arreglo));
    }

    //Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor
    public void ordenar(double[] arreglo) {
        Double[] objetoArreglo = Arrays.stream(arreglo).boxed().toArray(Double[]::new); // Convertir el arreglo primitivo a un arreglo de objetos Double
        Arrays.sort(objetoArreglo, Comparator.reverseOrder()); // Ordenar el arreglo en orden descendente utilizando un comparador
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = objetoArreglo[i]; // Copiar los valores del arreglo ordenado de objetos Double al arreglo original de doubles
        }
        /*Cuando se trabaja con arreglos primitivos en Java, como double[], no se pueden utilizar muchas de las 
funcionalidades que se tienen con los objetos en Java. En particular, los arreglos primitivos no tienen métodos 
como sort().
Para utilizar la funcionalidad de sort() y otros métodos que están disponibles para los objetos en Java, es
necesario convertir el arreglo primitivo a un arreglo de objetos. Esto se hace utilizando la clase envolvente Double 
(con mayúscula), que es la versión objeto del tipo double (con minúscula).
La conversión se realiza utilizando el método boxed() de la clase Arrays.stream(). Este método devuelve un Stream 
de objetos de la clase envolvente Double. Luego, utilizando el método toArray(), se convierte este Stream en un 
arreglo de objetos Double[].*/
    }

    //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 
    //10 posiciones del arreglo B con 0.5.
    public void inicializarB(double[] arreglo1, double[] arreglo2) {
        System.arraycopy(arreglo2, 0, arreglo1, 0, 10);
        Arrays.fill(arreglo1, 10, 20, 0.5);
    }
}
