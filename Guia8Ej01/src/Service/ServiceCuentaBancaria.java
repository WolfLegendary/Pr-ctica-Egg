/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
1.Método para crear cuenta pidiéndole los datos al usuario.
2.Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
3.Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
4.Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
5.Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
6.Método consultarDatos: permitirá mostrar todos los datos de la cuenta.

 */
package Service;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ServiceCuentaBancaria {

    //Creación de objetos
    Scanner leer = new Scanner(System.in);
    CuentaBancaria ServiceCuenta = new CuentaBancaria();

    //Creación de Método Crear
    public void crearCuenta() {
        System.out.println("Ingrese su numero de cuenta.");
        ServiceCuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI.");
        ServiceCuenta.setDniCliente(leer.nextInt());
        ServiceCuenta.setSaldoActual(0);
    }

    public double ingresarCuenta(double ingreso) {
        double saldoActual = ServiceCuenta.getSaldoActual() + ingreso;
        ServiceCuenta.setSaldoActual(saldoActual);
        return ServiceCuenta.getSaldoActual();
    }

    public double retirarCuenta(double retiro) {
        double saldoActual = ServiceCuenta.getSaldoActual() - retiro;
        //Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
        if (saldoActual < 0) {
            saldoActual = 0;
        }
        ServiceCuenta.setSaldoActual(saldoActual);
        return ServiceCuenta.getSaldoActual();
    }

    public double extraccionRapida() {
        System.out.println("Ingrese cantidad a retirar.");
        double retiro = leer.nextDouble();
        while (retiro > (0.2 * ServiceCuenta.getSaldoActual())) {
            System.out.println("La cantidad ingresada debe ser menor al 20%.");
            System.out.println("Ingrese una cantidad menor.");
            retiro = leer.nextDouble();
        }
        double saldoActual = ServiceCuenta.getSaldoActual() - retiro;
        ServiceCuenta.setSaldoActual(saldoActual);
        return ServiceCuenta.getSaldoActual();

    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es " + ServiceCuenta.getSaldoActual());
    }

    public void consultarDatos() {

        System.out.println("El número de la cuenta es " + ServiceCuenta.getNumeroCuenta());
        System.out.println("El DNI es " + ServiceCuenta.getDniCliente());
        System.out.println("El saldo actual es " + ServiceCuenta.getSaldoActual());
    }

}
