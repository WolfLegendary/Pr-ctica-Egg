/*
Definir los siguientes métodos en AhorcadoService:
 */
package Service;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class AhorcadoService {

    Scanner leer = new Scanner(System.in);
    Ahorcado ahorcado = new Ahorcado();

    public Ahorcado crearJuego() {
        /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
        Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
        Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
        en un índice del vector. Y también, guarda la cantidad de jugadas máximas y el valor que 
        ingresó el usuario.*/
        String palabra;//Definimos una variable palabra.
        System.out.println("Ingrese la palabra.");
        palabra = leer.next();
        char[] letras = new char[palabra.length()]; //Definimos un vector de letras.
        ahorcado.setLongitud(palabra.length()); //Seteamos la longitud
        for (int i = 0; i < ahorcado.getLongitud(); i++) {
            letras[i] = palabra.charAt(i); //Asiganmos cada letra de la palabra a una posición del vector.
        }
        ahorcado.setLetras(letras); //Seteamos la palabra
        System.out.println("Ingrese la cantidad de jugadas máximas.");
        ahorcado.setCantJugadasMaximas(leer.nextInt()); //Seteamos la cantidad de jugadas máx.
        
        return ahorcado;
    }

    public void mostrarLongitud() {
        /*Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar como se usa el 
        vector.length.*/
        System.out.println("La longitud de la palabra a buscar es de " + ahorcado.getLongitud() + " letras.");
    }

    public int buscarLetra() {
        /*Método buscar(letra):  este método recibe una letra dada por el usuario y busca si la letra 
        ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
        int contador = 0;
        char letra;
        char[] letras = new char[ahorcado.getLongitud()];
        letras = ahorcado.getLetras();
        System.out.println("Ingrese una letra.");
        letra = leer.next().charAt(0);
        for (int i = 0; i < ahorcado.getLongitud(); i++) {
            if (letra == letras[i]) {
                contador++;
            }
        }
        if (contador > 0) {
            System.out.println("La letra ingresada es parte de la palabra buscada.");
        } else {
            System.out.println("La letra ingresada no es parte de la palabra buscada.");
        }
        return contador;
    }

    public boolean encontradas() {
        /*Método encontradas(letra):  que reciba una letra ingresada por el usuario y muestre cuantas 
        letras han sido encontradas y cuántas le faltan. Este método además deberá devolver true si 
        la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra que no 
        esté, se le restará uno a sus oportunidades.*/
        int contador = buscarLetra();
        ahorcado.setCantLetrasEncontradas(contador + ahorcado.getCantLetrasEncontradas()); //Seteamos cantidad de lentras encontradas
        int faltantes = ahorcado.getLongitud() - ahorcado.getCantLetrasEncontradas();
        System.out.println("Número de letras (encontradas, faltantes): (" + ahorcado.getCantLetrasEncontradas() + "," + faltantes + ")");

        if (contador > 0) {
            return true;
        } else {
            ahorcado.setCantJugadasMaximas(ahorcado.getCantJugadasMaximas() - 1);
            return false;
        }
    }

    public int intentos() {
        System.out.println("Número de oportunidades restantes: " + ahorcado.getCantJugadasMaximas());
        return ahorcado.getCantJugadasMaximas();
    }

}
