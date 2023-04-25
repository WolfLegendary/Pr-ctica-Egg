/*
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona 
creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class ServicePersona {

    Persona sPersona = new Persona();
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        int dia;
        int mes;
        int anio;

        System.out.println("Ingrese su nombre.");
        sPersona.setNombre(leer.nextLine());
        System.out.println("Ingrese su dia de nacimiento.");
        dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento.");
        mes = leer.nextInt() - 1;
        System.out.println("Ingrese su año de nacimiento.");
        anio = leer.nextInt() - 1900;
        Date fechaNacimiento = new Date(anio, mes, dia);
        sPersona.setFechaDeNacimiento(fechaNacimiento);
        return sPersona;

    }

    //Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual
    public int calcularEdad() {
        Date fechaActual = new Date();

        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;
        long diferenciaEnMilisegundos = fechaActual.getTime() - sPersona.getFechaDeNacimiento().getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);

        return diferenciaEnAnos;
    }
    public int calcularEdadPersona(Persona persona) {
        Date fechaActual = new Date();

        long milisegundosPorAno = 1000L * 60L * 60L * 24L * 365L;
        long diferenciaEnMilisegundos = fechaActual.getTime() - sPersona.getFechaDeNacimiento().getTime();
        int diferenciaEnAnos = (int) Math.round((double) diferenciaEnMilisegundos / milisegundosPorAno);

        return diferenciaEnAnos;
    }
    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad 
    //consultada o false en caso contrario.
    public boolean menorQue(Persona persona,int edad){
        return calcularEdadPersona(persona)<edad;

    }
    
    //Método mostrarPersona que muestra la información de la persona deseada
    public void mostrarPersona(){
        System.out.println("El nombre de la persona es: ");
        System.out.println(sPersona.getNombre());
        System.out.println("La fecha de nacimiento es: ");
        System.out.println(sPersona.getFechaDeNacimiento());
    }
    
    

}
