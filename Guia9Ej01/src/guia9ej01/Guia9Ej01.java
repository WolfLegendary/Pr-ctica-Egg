/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su 
longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con 
frase como atributo debe setear la longitud de la frase de manera automática. Crear una clase CadenaServicio en el 
paquete servicios que implemente los siguientes métodos:
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por ejemplo: Entrada: "casa blanca",
Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar cuántas veces se repite
el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase con otra nueva frase
ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el
usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro 
arácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve 
verdadero si la contiene y falso si no.
 */
package guia9ej01;

import Service.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia9Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = 0;
        int i = 0;
        char letra;
        CadenaServicio frase = new CadenaServicio();
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido, para empezar, ingrese una frase.");
        String cadena = leer.nextLine();
        frase.ingreseFrase(cadena);
        do {
            if (i == 0) {
                System.out.println("A continuación, ingrese una opción del menú.");
            } else {
                System.out.println("Ingrese otra opción del menú.");
            }
            i = 1;
            System.out.println("1. Invertir la frase.");
            System.out.println("2. Contar la cantidad de vocales que tiene la frase.");
            System.out.println("3. Buscar un caracter específico dentro de la frase.");
            System.out.println("4. Reemplazar las letras A de la frase por otra letra.");
            System.out.println("5. Comparar la longitud de otra frase ingresada con la frase original.");
            System.out.println("6. Unir otra frase a la frase orginal.");
            System.out.println("7. Corroborar que la frase contenga un caracter específico ingresado por teclado.");
            System.out.println("8. Salir.");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    frase.invertirFrase();
                    break;
                case 2:
                    System.out.println("La cantidad de vocales que tiene la frase es: " + frase.mostrarVocales() + ".");
                    break;
                case 3:
                    frase.vecesRepetido();
                    break;
                case 4:
                    System.out.println("Ingrese una letra para generar el reemplazo en la frase.");
                    letra = leer.next().charAt(0);

                    System.out.println(frase.reemplazar(letra));
                    System.out.println("La frase se ha modificado.");
                    break;
                case 5:
                    System.out.println("Ingrese una frase para comparar la logitud de la misma con la frase original.");
                    leer.nextLine(); // Agregamos esta línea para descartar la entrada restante en el búfer
                    cadena = leer.nextLine();
                    frase.compararLongitud(cadena);
                    break;
                case 6:
                    System.out.println(frase.unirFrases());
                    System.out.println("La frase se ha modificado.");
                    break;
                case 7:
                    System.out.println("Ingrese letra para revisar si la frase la contiene.");
                    leer.nextLine(); // Agregamos esta línea para descartar la entrada restante en el búfer
                    cadena = leer.nextLine();
                    System.out.println(frase.contiene(cadena));
                    break;
                case 8:
                    System.out.println("Fin del programa.");

                    break;
                default:
                    System.out.println("Ha ingresado una opción del menú que no existe.");
                    break;
            }
        } while (opcion != 8);

    }
}
