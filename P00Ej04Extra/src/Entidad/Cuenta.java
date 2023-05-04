/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" 
que permita retirar una cantidad de dinero del saldo de la cuenta. 
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package Entidad;


/**
 *
 * @author The Wolf Legendary
 */
public class Cuenta {

    private double saldo;
    private String titular;

    public Cuenta(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void retirarDinero(double monto) throws IllegalArgumentException {
        if (monto > saldo) {
            throw new IllegalArgumentException("No hay suficiente saldo para el retiro.");
        }
        saldo -= monto;
    }
}
