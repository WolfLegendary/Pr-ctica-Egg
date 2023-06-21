/*
EJ02
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
EJ03
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package guia.pkg13.ej02;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Guia13Ej02 {

    /**
     * @param args the command line arguments
     * @throws guia.pkg13.ej02.ExcepcionDivisionNumero
     */
    public static void main(String[] args) throws ExcepcionDivisionNumero {
        /*int[]vector=new int[4];
        vector[4]=0;
        */
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos número en formato cadena.");
        String a=leer.next();
        String b=leer.next();
        DivisionNumero s=new DivisionNumero();
        s.divisionNumero(a, b);
        /*
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
utilizando bloques try/catch para las distintas excepciones
        */
        
    }
    
}
