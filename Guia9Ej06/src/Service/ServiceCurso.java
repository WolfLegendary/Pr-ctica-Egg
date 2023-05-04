/*
Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando 
en cada repetición que se ingrese el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se 
le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método 
cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
y la cantidad de días a la semana que se repite el encuentro.
 */
package Service;

import Entidad.Curso;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServiceCurso {

    Scanner leer = new Scanner(System.in);

    public String nombresAleatorios() {
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Carla", "Pepito", "Tulex", "Juancito"};
        Random rand = new Random();
        int index = rand.nextInt(nombres.length);
        String nombreAleatorio = nombres[index];
        return nombreAleatorio;
    }

    public String[] cargarAlumnos() {
/*Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos que asisten a las clases. 
Nosotros nos encargaremos de almacenar esta información en un arreglo e iterar con un bucle, solicitando 
en cada repetición que se ingrese el nombre de cada alumno.*/
        String nombre[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de alumno número " + (i + 1) + ".");
            //nombre[i]=leer.nextLine();
            nombre[i] = nombresAleatorios();
            System.out.println(nombre[i]);
        }
        return nombre;
    }

    public Curso crearCurso() {
/*Método crearCurso(): el método crear curso, le pide los valores de los atributos al usuario y después se 
le asignan a sus respectivos atributos para llenar el objeto Curso. En este método invocamos al método 
cargarAlumnos() para asignarle valor al atributo alumnos*/
        Curso curso = new Curso();
        System.out.println("Ingrese el nombre del curso.");
        curso.setNombreCurso(leer.nextLine());
        System.out.println("Ingrese la cantidad de horas por dia.");
        curso.setCantidadHorasPorDia(leer.nextDouble());
        System.out.println("Ingrese la cantidad de dias por semana.");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("Ingrese M o T, según el turno tarde o mañana.");
        //Lee el caracter y lo guarda en mayúscula.
        curso.setTurno(Character.toUpperCase(leer.next().charAt(0)));

        while (curso.getTurno() != 'M' && curso.getTurno() != 'T') {
            System.out.println("Usted ingreso un caracter no valido.");
            System.out.println("Ingrese nuevamente.");
            //Lee el caracter y lo guarda en mayúscula.
            curso.setTurno(Character.toUpperCase(leer.next().charAt(0)));
        }

        System.out.println("Ingrese el precio por hora.");
        curso.setPrecioPorHora(leer.nextDouble());
        curso.setAlumnos(cargarAlumnos());
        return curso;
    }

    public double calcularGananciaSemanal(Curso curso) {
/*Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia en una semana por curso. 
Para ello, se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos 
y la cantidad de días a la semana que se repite el encuentro.*/
        double ganancia = 0;
        ganancia = 5 * curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana() * curso.getPrecioPorHora();
        return ganancia;
    }

}
