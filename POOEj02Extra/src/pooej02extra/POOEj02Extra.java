/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej02extra;

import Entidad.Puntos;

/**
 *
 * @author USUARIO
 */
public class POOEj02Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Puntos distancia = new Puntos();
        distancia.crearPunto();
        System.out.println("La distancia para los puntos ingresados es: " + distancia.calcularDistancia());
    }

}
