/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05extra;

import Entidad.Empleado;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class POOEj05Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad=0;
        double salario;
       Empleado nuevoSalario = new Empleado ();
       Scanner leer= new Scanner (System.in);
       
        System.out.println("Hola, ingrese su nombre.");
       nombre=leer.next();
       System.out.println("A continuación, ingrese su edad.");
        edad=leer.nextInt();
        while(edad<=0 || edad>100) { System.out.println("Ingrese su edad de nuevo, la misma no puede ser cero o mayor a 100.");
            edad=leer.nextInt();
        }
        System.out.println("Ingrese su salario actual.");
        salario=leer.nextDouble();
        
        System.out.println("Su salario nuevo es de "+nuevoSalario.calcularAumento(nombre, edad, salario));
       
       
    }
    
}
