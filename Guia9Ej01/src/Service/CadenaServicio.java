/*
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:
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
package Service;

import Entidad.Cadena;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author The Wolf Legendary
 */
public class CadenaServicio {

    Cadena sCadena = new Cadena();
    Scanner leer = new Scanner(System.in);

    //Ingrese frase.
    public void ingreseFrase(String frase) {
        sCadena.setFrase(frase);
    }

    public int mostrarVocales() {
        Set<Character> vocales = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int conteoVocales = 0;
        for (int i = 0; i < sCadena.getLongitud(); i++) {
            if (vocales.contains(Character.toLowerCase(sCadena.getFrase().charAt(i)))) {
                conteoVocales += 1;
            }
        }
        return conteoVocales;
    }

    public void invertirFrase() {
        StringBuilder sb = new StringBuilder(sCadena.getFrase());
        System.out.println("La frase ingresada invertida es: " + sb.reverse());
    }

    public void vecesRepetido() {

        System.out.println("Ingrese letra a buscar.");
        String letra = leer.next().toLowerCase();// Convertir a minúsculas
        leer.nextLine(); // Agregamos esta línea para descartar la entrada restante en el búfer
        int cont = 0;
        for (int i = 0; i < sCadena.getLongitud(); i++) {
            if (letra.equals(String.valueOf(sCadena.getFrase().toLowerCase().charAt(i)))) { // convertir a minúsculas
                cont += 1;
            }
        }
        System.out.println("La cantidad de " + letra + " es: " + cont + ".");
    }

    public String reemplazar(char letra) {
        String nuevaFrase = sCadena.getFrase().replace('a', letra);
        sCadena.setFrase(nuevaFrase);
        return nuevaFrase;
    }

    public void compararLongitud(String frase) {
        if (sCadena.getLongitud() > frase.length()) {
            System.out.println("La frase ingresada tiene menos caracteres que la frase: " + sCadena.getFrase() + ".");
        } else if (sCadena.getLongitud() < frase.length()) {
            System.out.println("La frase ingresada tiene más caracteres que la frase: " + sCadena.getFrase() + ".");
        } else {
            System.out.println("Ambas frases tienen la misma cantidad de letras que la frase" + sCadena.getFrase() + ".");
        }

    }

    public String unirFrases() {
        String fraseNueva;
        System.out.println("Ingrese una nueva frase.");
        fraseNueva = leer.nextLine();
        sCadena.setFrase(sCadena.getFrase() + " " + fraseNueva); //Agregamos un espacio en blanco antes de la nueva frase para separarla de la anterior
        return sCadena.getFrase();
    }

    public boolean contiene(String letra) {
        return sCadena.getFrase().toLowerCase().contains(letra.toLowerCase());
    }

}
