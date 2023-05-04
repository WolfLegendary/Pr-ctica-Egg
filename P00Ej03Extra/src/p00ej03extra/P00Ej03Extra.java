/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p00ej03extra;

import Entidad.Juego;

/**
 *
 * @author USUARIO
 */
public class P00Ej03Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Juego game=new Juego();
        for (int i = 0; i < 5; i++) {
            game.iniciarJuego();
        }
        
        
    }
    
}
