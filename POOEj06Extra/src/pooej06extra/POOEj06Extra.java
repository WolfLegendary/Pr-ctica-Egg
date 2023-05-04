/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06extra;

import Entidad.Rectangulo;
import Entidad.Rectangulo1;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POOEj06Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     Rectangulo area=new Rectangulo();
   
     double lado1;
     double lado2;
        System.out.println("Ingrese los lados del rectágulo.");
        lado1=leer.nextDouble();
        lado2=leer.nextDouble();
        System.out.println("El área del rectangulo ingresado es "+area.calcularArea(lado1, lado2)+"m^2");    
        System.out.println("Y así quedaria impreso.");
        Rectangulo1 imprime=new Rectangulo1(lado1,lado2);
        imprime.dibujarRectangulo();

    }
    
}
