package primer.programa;

import java.util.Scanner;

/**
 * Codificación de frase con función
 */
public class PrimerPrograma {

    /*
    Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que 
    el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo, sino 
    informe que no lo son.
     */
    public static void main(String[] args) {
        int num1,num2;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números.");
        num1= leer.nextInt();
        num2= leer.nextInt();
        
        multiplos(num1,num2);
        
       /*
        String retorno = codificacion(frase);
        System.out.println(retorno);
*/
    }

    //Subprograma que verifica si son múltiplos los dos números ingresados
    public static void multiplos(int num1, int num2) {
    
if (num1%num2==0) {
    System.out.println("Los números ingresados son múltiplos");
} else {
    System.out.println("Los números ingresados no son múltiplos");
}
    }
}
