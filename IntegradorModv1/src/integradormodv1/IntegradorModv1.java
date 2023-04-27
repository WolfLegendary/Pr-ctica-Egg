/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integradormodv1;

import Entidad.Estudiante;
import Service.EstudianteServicio;

/**
 *
 * @author USUARIO
 */
public class IntegradorModv1 {
        EstudianteServicio servicio = new EstudianteServicio();
        Estudiante[] estudianteObj = new Estudiante[8];
        
        /*
        //Cargar alumnos
        servicio.equals(estudianteObj);
        //Mostrar alumnos
        System.out.println("Alumnos: ");
        servicio.mostrarEstudiantes(estudianteObj);
        System.out.println();
        //Calcular promedio
        System.out.println("Promedio: " + servicio.calcularPromedio(estudianteObj));
        //Obtener alumnos con mayor promedio
        servicio.obtenerAlumnosNotaMayorPromedio(estudianteObj);
        String[] alumnos = servicio.obtenerAlumnosNotaMayorPromedio(estudianteObj);
        //Mostrar alumnos
        System.out.println();
        System.out.println("Alumnos con nota mayor al promedio: ");
        System.out.println(Arrays.toString(alumnos));
        //Mostrar alumnos con nota mayor al promedio
        System.out.println();
        System.out.println("Nombre y Nota:");
        servicio.mostrarAlumnosNotaMayorPromedio(estudianteObj);
    }*/

}
