/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author USUARIO
 */
public class ExcepcionNumero extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionNumero</code> without detail message.
     */
    public ExcepcionNumero() {
    }

    /**
     * Constructs an instance of <code>ExcepcionNumero</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionNumero(String msg) {
        super(msg);
    }
}
