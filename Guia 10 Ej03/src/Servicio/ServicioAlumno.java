/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.

Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);

    public void creaAlumno(ArrayList<Alumno> alumnos) {
        String respuesta = "";
        do {
            //Se crea el objeto alumno
            Alumno alumno = new Alumno();
            //Se crea la colección de notas
            ArrayList<Integer> notas = new ArrayList();
            System.out.println("Ingrese su nombre:");
            alumno.setNombre(leer.nextLine());
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese su nota número " + (i + 1) + ":");
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            //Se terminan de llenar los valores de los atributos del objeto alumno
            //Se guarda el alumno en la colección alumnos
            alumnos.add(alumno);
            System.out.println("¿Quiere crear otro Alumno? S/N");
            leer.next();// Siguiente entrada
            respuesta=leer.nextLine();
        } while ("S".equals(respuesta.toUpperCase()));
    }

    public double notaFinal(ArrayList<Alumno> alumnos) {
        boolean status = false;
        int suma = 0;
        double promedio = 0;
        System.out.println("Ingrese el nombre del alumno que desea conocer su nota final:");
        String nombre = leer.nextLine();
        for (Alumno aux : alumnos) { //Recorremos la lista
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                status = true;
                suma = aux.getNotas().get(0) + aux.getNotas().get(1) + aux.getNotas().get(2);
            }
        }
        if (status) {
            promedio = (suma / 3);
            System.out.println("El promedio de nota final del alumno " + nombre + " es " + promedio);
        } else {
            System.out.println("El alumno ingresado no se encuentra en la lista de alumnos.");
        }
        return promedio;
    }
}
