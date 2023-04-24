/*
Crear una clase PersonaService, en el paquete servicio, 
con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona 
creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Service;

import Entidad.Persona;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class PersonaService {

    Persona sPersona = new Persona();
    Scanner leer = new Scanner(System.in);

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }
//Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
//retornar el objeto Persona creado.

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre.");
        sPersona.setNombre(leer.nextLine());

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
        sPersona.setFechaDeNacimiento(fecha);

        return sPersona;

    }
//Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.

  public int calcularEdad() {
    int edad;

    Calendar fechaActual = Calendar.getInstance();
    fechaActual.setTime(fechaActual());

    Calendar fechaNacimiento = Calendar.getInstance();
    fechaNacimiento.setTime(sPersona.getFechaDeNacimiento());
   
    int anioActual = fechaActual.get(Calendar.YEAR);
    int mesActual = fechaActual.get(Calendar.MONTH) + 1;
    int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

    int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
    int mesNacimiento = fechaNacimiento.get(Calendar.MONTH) + 1;
    int diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

    edad = anioActual - anioNacimiento;

    if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
        edad--;
    }

    System.out.println(sPersona.getNombre() + " su edad es de " + edad + " años.");

    return edad;
}
  
 //Se replica método calcularEdad por parámetro
   public int calcularEdad1(Date fecha) {
    int edad;

    Calendar fechaActual = Calendar.getInstance();
    fechaActual.setTime(fechaActual());

    Calendar fechaNacimiento = Calendar.getInstance();
    fechaNacimiento.setTime(fecha);

    int anioActual = fechaActual.get(Calendar.YEAR);
    int mesActual = fechaActual.get(Calendar.MONTH) + 1;
    int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);

    int anioNacimiento = fechaNacimiento.get(Calendar.YEAR);
    int mesNacimiento = fechaNacimiento.get(Calendar.MONTH) + 1;
    int diaNacimiento = fechaNacimiento.get(Calendar.DAY_OF_MONTH);

    edad = anioActual - anioNacimiento;

    if (mesNacimiento > mesActual || (mesNacimiento == mesActual && diaNacimiento > diaActual)) {
        edad--;
    }

    return edad;
}
   
//Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
//o false en caso contrario.
   public boolean menorQue(Persona sujeto, int edad){
        return (calcularEdad1(sujeto.getFechaDeNacimiento())<edad);
   }
   
//Método mostrarPersona que muestra la información de la persona deseada.
   public void mostrarPersona(Persona sujeto){
       System.out.println("El nombre de la persona es "+sujeto.getNombre()+".");
       System.out.println("La fecha de nacimiento es "+sujeto.getFechaDeNacimiento());
       System.out.println("Su edad es "+calcularEdad1(sujeto.getFechaDeNacimiento())+".");
   
   }
    
}

    