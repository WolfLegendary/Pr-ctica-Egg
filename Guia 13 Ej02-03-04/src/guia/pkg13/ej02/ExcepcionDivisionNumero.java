/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg13.ej02;

/**
 *
 * @author USUARIO
 */
public class ExcepcionDivisionNumero extends Exception {

    /**
     * Creates a new instance of <code>ExcepcionDivisionNumero</code> without detail message.
     */
    public ExcepcionDivisionNumero() {
    }

    /**
     * Constructs an instance of <code>ExcepcionDivisionNumero</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public ExcepcionDivisionNumero(String msg) {
        super(msg);
    }
}
