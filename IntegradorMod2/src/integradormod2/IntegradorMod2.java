/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8
estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un
arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las
dos tareas que nos ha pedido la escuela.
1. Calcular y mostrar el promedio de notas de todo el curso
2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
nota mayor al promedio del curso
3. Por último, deberemos mostrar todos los estudiantes con una nota
mayor al promedio.
 */
package integradormod2;

import Entidad.Estudiante;
import Service.ServiceEstudiante;

/**
 *
 * @author The Wolf Legendary
 */
public class IntegradorMod2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se definen la cantidad de estudiantes
        int cantidadEstudiantes = 8;
        //Se crea vector para objetos Estudiante
        Estudiante estudiante[] = new Estudiante[cantidadEstudiantes];
        //Se crea objeto ServiceEstudiante
        ServiceEstudiante sEstudiante = new ServiceEstudiante();

        //Creamos los estudiantes
        sEstudiante.crearEstudiante(estudiante);
        //Mostramos los estudiantes creados
        System.out.println("Nombres y notas de estudiantes creados.");
        sEstudiante.mostrar(estudiante);
        System.out.println("");
        double promedio = sEstudiante.calculoPromedio(estudiante);
        //1. Calcular y mostrar el promedio de notas de todo el curso
        System.out.println("El promedio de la notas finales es " + promedio + ".");
        System.out.println("");
        //2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
        //nota mayor al promedio del curso
        String vNombres[] = sEstudiante.alumnosArribaPromedio(estudiante);
        //3. Por último, deberemos mostrar todos los estudiantes con una nota
        //mayor al promedio.
        sEstudiante.mostrarEstudiantes(estudiante);
    }
}
