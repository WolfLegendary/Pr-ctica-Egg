/*
EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
 */
package ejemploguia11ej01;

import entidades.Persona;
import servicios.servicios_objetos;

/**
 *
 * @author The Wolf Legendary
 */
public class EjemploGuia11Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicios_objetos servicio=new servicios_objetos();
        Persona persona=new Persona();
        
        persona=servicio.crearPersona();
        System.out.println("Mostramos la persona creada.");
        System.out.println(persona.getNombre());
        System.out.println(persona.getApellido());
        System.out.println(persona.getDni());
        System.out.println("Acceso puntual a los atributos del DNI de la persona");
        System.out.println(persona.getDni().getNumero());
        System.out.println(persona.getDni().getSerie());
        
    
    }
    
}
