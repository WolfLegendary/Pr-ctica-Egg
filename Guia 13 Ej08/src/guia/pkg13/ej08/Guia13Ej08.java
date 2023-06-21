/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg13.ej08;

/**
 *
 * @author USUARIO
 */
public class Guia13Ej08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Uno uno = new Uno();
        try {
            System.out.println(uno.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
    }
}
