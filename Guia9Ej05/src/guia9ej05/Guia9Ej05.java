/*
Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento (Tipo Date), 
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, en el paquete servicio, 
con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona 
creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada
o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.
 */
package guia9ej05;

import Entidad.Persona;
import Service.PersonaService;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia9Ej05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaService identidad=new PersonaService();
        Persona sujeto=new Persona();
        
        sujeto=identidad.crearPersona();
        
       
        //Calcula la edad del sujeto creado
        identidad.calcularEdad();
        
        //Consulta si una persona es menor que 15 años como ejemplo
        System.out.println("La afirmación de que la persona consultada tiene menos de 15 años es:");
        System.out.println(identidad.menorQue(sujeto, 15));
        
        System.out.println("A continuación, se muestran los datos de la persona seleccionada.");
        identidad.mostrarPersona(sujeto);
       
    }
    
}
