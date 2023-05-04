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
        char [] vector=new char [23];
        vector[0]='T';
        vector[1]='R';
        vector[2]='W';
        vector[3]='A';
        vector[4]='G';
        vector[5]='M';
        vector[6]='Y';
        vector[7]='F';
        vector[8]='P';
        vector[9]='D';
        vector[10]='X';
        vector[11]='B';
        vector[12]='N';
        vector[13]='J';
        vector[14]='Z';
        vector[15]='S';
        vector[16]='Q';
        vector[17]='V';
        vector[18]='H';
        vector[19]='L';
        vector[20]='C';
        vector[21]='K';
        vector[22]='E';
        System.out.println("Ingrese su DNI.");
        sNIF.setDni(leer.nextLong());
/*La letra correspondiente al dígito verificador se calculará a traves de un método que funciona de la siguiente 
manera: 
Para calcular la letra se toma el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). 
El método debe buscar en un array (vector) de caracteres la posición que corresponda al resto de la división para 
obtener la letra correspondiente.*/
        int resto = (int) (sNIF.getDni() % 23);
        sNIF.setLetra(vector[resto]);
        return sNIF.getLetra();
    }

    /*Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en mayúscula;
por ejemplo: 00395469-F).*/
    public void mostrar() {
        System.out.println(sNIF.getDni() + "-" + sNIF.getLetra());
    }
}
