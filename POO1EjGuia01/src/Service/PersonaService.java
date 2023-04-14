/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class PersonaService {
//Se crea objeto de Entidad
    Persona mostrarPersona = new Persona();
    Scanner leer=new Scanner(System.in);
    
    
    
    public void mostrarNombre() {
        System.out.println("Ingrese nombre de la persona.");
        mostrarPersona.setNombre(leer.next());
        System.out.println("El nombre de la persona es " + mostrarPersona.getNombre());
    }

}
