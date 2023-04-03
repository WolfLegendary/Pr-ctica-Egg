package primer.programa;

//import java.util.Random;
import java.util.Scanner;

/*
Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que 
el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio 
del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java substring(), 
Length() y Math.random().
 */
public class PrimerPrograma {

    public static void main(String[] args) {
        System.out.println("Bienvenido al generador de sopas de letras para niños.");
        System.out.println("Nueva frase.");
        System.out.println("Por favor ingrese 5 palabras de 3 a 5 letras cada una.");
        Scanner leer = new Scanner(System.in);
        //Definir una matriz tipo String de 20x20.
        String sopaDeLetras[][] = new String[20][20];
        //Pide y lee 5 palabras, con un mínimo de 3 y un máximo de 5 carácteres.
        String palabra;
        String[] palabras = new String[5];
        //Posiciones random
        int[] posicionFilas = new int[palabras.length];
        int[] posicionColumnas = new int[palabras.length];

        int contador = 0;
        do {
            System.out.println("Ingrese la palabra número " + (contador + 1) + " con un mín. de 3 y un máx. de 5 carácteres.");
            palabra = leer.nextLine().toUpperCase();
            if ((palabra.length() < 3 || palabra.length() > 5)) {
                System.out.println("Ha ingresado una palabra con la cantidad incorrecta de carácteres.");
            } else {

                palabras[contador] = palabra;
                contador += 1;
            }
        } while (contador < 5);

        muestraVector(palabras);
        //Generar 5 posiciones random para las  palabras, en filas y columnas.
        //La posiciones en las filas pueden estar del 0 al 19.
        posicionFilas = numerosAleatorios(posicionFilas.length, 19, 0);
        //La posiciones en las columnas pueden estar del 0 al 16.
        posicionColumnas = numerosAleatorios(posicionColumnas.length, 16, 0);

        //Escribir las palabras dentro de la matriz, en las posiciones generadas.
        for (int x = 0; x < palabras.length; x++) {
            sopaDeLetras[posicionFilas[x]][posicionColumnas[x]] = palabras[x];
        }
        //Completar valores vacios con números random desde el 0 al 9.
        for (String[] sopaDeLetra : sopaDeLetras) {
            for (int j = 0; j < sopaDeLetra.length; j++) {
                if (null == sopaDeLetra[j]) {
                    sopaDeLetra[j] = String.valueOf((int) (Math.random() * 10));
                }
            }
        }

        //Mostrar la matriz completa.
        muestraMatriz(sopaDeLetras);
    }

    //Subproceso para mostrar vector
    public static void muestraVector(String[] vector) {
        for (String elemento : vector) {
            System.out.println(elemento);
        }
    }

    //Subproceso para mostrar matriz
    public static void muestraMatriz(String[][] matriz) {
        for (String[] fila : matriz) {
            for (String elemento : fila) {
                //En este caso, el elemento se formatea para tener una longitud de 3 caracteres ("%-3s")
                String elementoFormateado = String.format("%-3s", elemento);
                System.out.print(elementoFormateado);

            }
            System.out.println("");
        }
    }
    //Genera números aleatorios que no se repiten

    public static int[] numerosAleatorios(int cantidad, int maximo, int minimo) {
        int[] numerosAleatorios = new int[cantidad];
        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numeroAleatorio;
            boolean numeroRepetido;

            do {
                numeroAleatorio = (int) (Math.random() * (maximo - minimo) + 1);
                numeroRepetido = false;

                for (int j = 0; j < i; j++) {
                    if (numerosAleatorios[j] == numeroAleatorio) {
                        numeroRepetido = true;
                        break;
                    }
                }
            } while (numeroRepetido);

            numerosAleatorios[i] = numeroAleatorio;
        }

        return numerosAleatorios;
    }
}
