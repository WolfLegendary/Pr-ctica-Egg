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
        int cantidadEstudiantes = 8;
        //Se crean vectores para objetos ServiceEstudiante y Estudiante
        ServiceEstudiante sestudiante[] = new ServiceEstudiante[cantidadEstudiantes];
        Estudiante estudiante[] = new Estudiante[cantidadEstudiantes];
        //Se crea objeto simple ServiceEstudiante
        ServiceEstudiante funcionEstudiante = new ServiceEstudiante();

        //Creamos los estudiantes.
        for (int i = 0; i < estudiante.length; i++) {
            //Se inicializa ServiceEstudiante
            sestudiante[i] = new ServiceEstudiante();
            // Una vez creado los estudiantes, guardamos los estudiantes en un
            // arreglo de objetos tipo Estudiante
            //System.out.println("Ingrese los datos del estudiante número " + (i + 1) + ".");
            estudiante[i] = sestudiante[i].crearEstudiante();
        }
        //Mostramos los estudiantes creados
        for (int i = 0; i < estudiante.length; i++) {
            sestudiante[i].mostrarEstudiante(estudiante[i]);
        }
        System.out.println("");
        double promedio = funcionEstudiante.calculoPromedio(estudiante);
        //1. Calcular y mostrar el promedio de notas de todo el curso
        System.out.println("El promedio de la notas finales es " + promedio + ".");
        System.out.println("");
        //2. Retornar otro arreglo con los nombre de los alumnos que recibieron una
        //nota mayor al promedio del curso
        String vNombres[] = alumnosArribaPromedio(estudiante, promedio, cantidadEstudiantes);
        //3. Por último, deberemos mostrar todos los estudiantes con una nota
        //mayor al promedio.
        alumnosArribaNota(estudiante, vNombres, promedio);
    }

    public static String[] alumnosArribaPromedio(Estudiante estudiante[], double promedio, int cantidadEstudiantes) {
        String vNombres[] = new String[cantidadEstudiantes];
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getNota() > promedio) {
                vNombres[i] = estudiante[i].getNombre();
            }
        }
        return vNombres;
    }

    public static void alumnosArribaNota(Estudiante estudiante[], String vNombres[], double promedio) {
        int cant = 0;
        for (int i = 0; i < estudiante.length; i++) {
            if (estudiante[i].getNota() > promedio) {
                vNombres[i] = estudiante[i].getNombre();
                cant++;
            }
        }
        if (cant > 0) {
            if (cant == 1) {
                System.out.println("A continuación, se muestra el estudiante que superó el promedio.");
            } else {
                System.out.println("A continuación, se muestran los alumnos que superaron el promedio.");
            }
            for (int i = 0; i < estudiante.length; i++) {
                if (vNombres[i] != null) {
                    System.out.println("[Nombre: " + vNombres[i] + "] [Nota: " + estudiante[i].getNota() + "]");
                }
            }
        } else {
            System.out.println("Ningún estudiante superó el promedio.");
        }

    }
}
