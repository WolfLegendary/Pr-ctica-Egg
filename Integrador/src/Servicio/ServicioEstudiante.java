/*
La escuela consta con tan solo 8 estudiantes, por lo que deberemos crear los 8 estudiantes con sus respectivas notas.
Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, 
usando ese arreglo tenemos que realizar las dos tareas que nos ha pedido la escuela.

1-Calcular y mostrar el promedio de notas de todo el curso

2-Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso

3-Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.

Nota: para crear un vector de objetos la definición es la siguiente:
Objeto nombreVector[] = new Objeto[];

 */
package Servicio;

import Entidad.Estudiante;
import java.util.Random;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioEstudiante {

    public String rellenarnombre() {
        String[] nombres = {"Pedro", "Gustavo", "Juan", "Maxi", "Fabian", "Carlos", "Martin", "Naty", "Pame", "Lucy"};
        Random r = new Random();
        int index = r.nextInt(nombres.length);
        String nombre = nombres[index];
        return nombre;
    }

    public double rellenarnota() {
        double nota = Math.random() * 10;//Notas del 0 al 10.
        return nota;
    }

    public Estudiante crearEstudiantes(Estudiante estudiantes[]) {

        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante();
            estudiantes[i].setNombre(rellenarnombre());
            estudiantes[i].setNota(rellenarnota());
        }
        return new Estudiante();
    }

    public void mostrarEstudiantes(Estudiante estudiantes[]) {
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre() + ", Nota: " + estudiante.getNota());
        }

    }

    //1-Calcular y mostrar el promedio de notas de todo el curso
    public double calcularPromedio(Estudiante estudiantes[]) {
        double suma = 0;
        double promedio = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        promedio = suma / estudiantes.length;
        return promedio;
    }

    //2-Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    public String[] arregloNombres(Estudiante estudiantes[]) {
        int contador = 0;
        double promedio = calcularPromedio(estudiantes);
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                contador++;
            }
        }
        int j = 0;
        String[] vectorNombres = new String[contador];
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio) {
                vectorNombres[j] = estudiante.getNombre();
                j++;
            }
        }
        return vectorNombres;
    }

    //3-Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.
    public void mostrarMayoresNotas(Estudiante estudiante[]) {
        String[] alumnos = arregloNombres(estudiante);
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Estudiante número: " + i + " Nombre: " + alumnos[i] + ".");
        }

    }

}
