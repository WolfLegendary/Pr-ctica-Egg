package integrador;

import Entidad.Estudiante;
import Servicio.ServicioEstudiante;

/**
 *
 * @author The Wolf Legendary
 */
public class Integrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioEstudiante sEstudiante=new ServicioEstudiante();
        Estudiante estudiante[]=new Estudiante[8];
    
        sEstudiante.crearEstudiantes(estudiante);
        sEstudiante.mostrarEstudiantes(estudiante);
        System.out.println("Promedio.");
        System.out.println(sEstudiante.calcularPromedio(estudiante));
        sEstudiante.arregloNombres(estudiante);
        System.out.println("Estudiantes con mayores notas al promedio.");
        sEstudiante.mostrarMayoresNotas(estudiante);
    
    }
    
}
