/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters
 */
package Entidad;

/**
 *
 * @author USUARIO
 */
public class CuentaBancaria {

    public CuentaBancaria(int numeroCuenta, int dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public CuentaBancaria() {
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    private int numeroCuenta;
    private int dniCliente;
    private double saldoActual;
    
}
