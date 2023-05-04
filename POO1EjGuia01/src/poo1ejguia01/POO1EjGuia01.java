/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1ejguia01;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class POO1EjGuia01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        //Se llama objeto persona desde Entidad
        Persona nombre=new Persona();
       
        //Se llama objeto PersonaService desde Service
        PersonaService mostrar=new PersonaService();
        mostrar.mostrarNombre();
        
        
    }
    
}
