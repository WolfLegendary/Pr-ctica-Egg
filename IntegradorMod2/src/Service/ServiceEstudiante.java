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

    public String nombresAleatorios() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Carla", "Pepito", "Tulex", "Juancito"};
        Random rand = new Random();
        int index = rand.nextInt(nombres.length);
        String nombreAleatorio = nombres[index];
        return nombreAleatorio;
    }

    public Estudiante crearEstudiante(Estudiante estudiantes[]) {
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            //Nombre aleatorio de la lista
            estudiantes[i].setNombre(nombresAleatorios());
            //Nota aleatoria
            estudiantes[i].setNota(Math.random() * 10);
            //estudiantes[i].setNota(leer.nextDouble());
        }
        return new Estudiante();
    }

    public void mostrar(Estudiante estudiantes[]) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("[Nombre: " + estudiante.getNombre() + "] [Nota: " + estudiante.getNota() + "]");
        }

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

    public String[] alumnosArribaPromedio(Estudiante estudiantes[]) {
        double promedio = calculoPromedio(estudiantes);
        int cant = 0;
        for (Estudiante estudiante1 : estudiantes) {
            if (estudiante1.getNota() > promedio) {
                cant++;
            }
        }
        String vNombres[] = new String[cant];
        int j = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                vNombres[j] = estudiante.getNombre();
                j++;
            }
        }
        return vNombres;
    }

    public void mostrarEstudiantes(Estudiante estudiantes[]) {

        int cant = 0;
        double promedio = calculoPromedio(estudiantes);
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                cant++;
            }
        }
        if (cant > 0) {
            if (cant == 1) {
                System.out.println("A continuación, se muestra el estudiante que superó el promedio.");
            } else {
                System.out.println("A continuación, se muestran los alumnos que superaron el promedio.");
            }
            for (Estudiante estudiante : estudiantes) {
                if (estudiante.getNota() > promedio) {
                    System.out.println("[Nombre: " + estudiante.getNombre() + "] [Nota: " + estudiante.getNota() + "]");
                }
            }
        } else {
            System.out.println("Ningún estudiante superó el promedio.");
        }
    }
}
