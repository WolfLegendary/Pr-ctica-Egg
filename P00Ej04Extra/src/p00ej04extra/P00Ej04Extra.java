/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p00ej04extra;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class P00Ej04Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre.");
        String titular=leer.next();
        
        System.out.println("Ingrese su saldo.");
        double saldo=leer.nextDouble();
        
        Cuenta retirar = new Cuenta(saldo,titular);
        
        System.out.println("Ingrese monto a retirar.");
        double retiro=leer.nextDouble();
        
        retirar.retirarDinero(retiro);
        System.out.println("Su saldo actual es "+retirar.getSaldo());
        
        
    }

}
