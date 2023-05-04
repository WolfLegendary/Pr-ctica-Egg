/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, que tenga 
los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a un nuevo 
objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra 
(edad del usuario).
 */
package Service;


import java.util.Date;
import java.util.Scanner;

public class FechaService {

    public Date fechaNacimiento() {
        Date fecha;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese su fecha de nacimiento");
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Mes: ");
            int mes = scanner.nextInt() - 1; // Restar 1 para ajustar el mes a partir de 0
            System.out.print("Año: ");
            int anio = scanner.nextInt() - 1900; // Restar 1900 para ajustar el año a partir de 1900
            fecha = new Date(anio, mes, dia);
        }
        return fecha;
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int diferencia(Date fecha1, Date fecha2) {
        int anios = fecha1.getYear() - fecha2.getYear();
        return anios;
    }
}
