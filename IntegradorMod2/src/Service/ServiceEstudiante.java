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
package Service;

import Entidad.Estudiante;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServiceEstudiante {

    Scanner leer = new Scanner(System.in);
    Estudiante sEstudiante = new Estudiante();

    public String nombresAleatorios() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Carla", "Pepito", "Tulex", "Juancito"};
        Random rand = new Random();
        int index = rand.nextInt(nombres.length);
        String nombreAleatorio = nombres[index];
        return nombreAleatorio;
    }

    public Estudiante crearEstudiante() {
        //System.out.println("Nombre del estudiante: ");
        sEstudiante.setNombre(nombresAleatorios());
        //System.out.println("Nota final del estudiante: ");
        sEstudiante.setNota(Math.random() * 10);
        return sEstudiante;
    }

    public void mostrarEstudiante(Estudiante estudiantes) {
        System.out.print("[Nombre: " + sEstudiante.getNombre() + "],[Nota: ");
        System.out.println(sEstudiante.getNota() + "]");
    }

    public double calculoPromedio(Estudiante estudiantes[]) {
        double promedio = 0;
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma = suma + estudiante.getNota();
        }
        promedio = suma / estudiantes.length;
        return promedio;
    }

}
