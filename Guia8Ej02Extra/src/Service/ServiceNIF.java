/*
En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra.
Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para 
obtener la letra correspondiente.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 * @author The Wolf Legendary
 */
public class ServiceNIF {

    NIF sNIF = new NIF();
    Scanner leer = new Scanner(System.in);

    //Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá. 
    public char crearNif() {
        char letra = 0;
        System.out.println("Ingrese su DNI.");
        sNIF.setDni(leer.nextLong());
/*La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente 
manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para 
obtener la letra correspondiente.*/
        int resto = (int) (sNIF.getDni() % 23);
        switch (resto) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                System.out.println("No se encontró la letra NIF");// Código a ejecutar si la expresión no coincide con ningún caso
                break;
        }
        sNIF.setLetra(letra);
        return sNIF.getLetra();
    }

    /*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
por ejemplo: 00395469-F).*/
    public void mostrar() {
        System.out.println(sNIF.getDni() + "-" + sNIF.getLetra());
    }
}
