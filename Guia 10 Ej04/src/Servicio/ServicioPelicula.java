/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioPelicula {

    Scanner leer = new Scanner(System.in);

    public void crearPelicula(ArrayList<Pelicula> peliculas) {
        String respuesta = "";
        do {
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese el título de la película.");
            pelicula.setTitulo(leer.nextLine());
            System.out.println("Ingrese el director de la película.");
            pelicula.setDirector(leer.nextLine());
            System.out.println("Ingrese la duración de la película.");
            pelicula.setDuracion(leer.nextInt());
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente
            //Se guarda el objeto creado en la colección "peliculas"
            peliculas.add(pelicula);
            System.out.println("¿Desea cargar otra película? S/N");
            respuesta = leer.nextLine();

        } while ("S".equals(respuesta.toUpperCase()));

    }

    public void mostrarPeliculas(ArrayList<Pelicula> peliculas) {
        //Muestra todas las peliculas creadas
        for (Pelicula aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void mostrarPeliculasMayorAunaHora(ArrayList<Pelicula> peliculas) {
        Iterator<Pelicula> it = peliculas.iterator();
        while (it.hasNext()) {
            Pelicula pelicula = it.next();//Se crea objeto temporal para acceder a sus atributos dentro del bucle
            if (pelicula.getDuracion() > 1.0) {
                System.out.println(pelicula.getTitulo() + " - Duración: " + pelicula.getDuracion() + " horas");
            }
        }
    }

    public void ordenarPeliculasMayorMenor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracion);
        mostrarPeliculas(peliculas);
    }

    public void ordenarPeliculasMenorMayor(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracionInver);
        mostrarPeliculas(peliculas);
    }

    public void ordenarPeliculasPorTitulo(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracionTitulo);
        mostrarPeliculas(peliculas);
    }

    public void ordenarPeliculasPorDirector(ArrayList<Pelicula> peliculas) {
        peliculas.sort(Pelicula.compararDuracionDirector);
        mostrarPeliculas(peliculas);
    }

    //Para automatizar el ingreso por teclado
    public static String generarLetraAleatoria() {
        Random random = new Random();
        char letra = (char) (random.nextInt(26) + 'a');
        return String.valueOf(letra);
    }

    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(11); // Genera un número aleatorio entre 0 y 10 (ambos inclusive)
    }

    public ArrayList<Pelicula> fabricaAleatoriaPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        System.out.println("Ingrese cantidad de peliculas a fabricar:");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Pelicula pelicula = new Pelicula();
            pelicula.setDirector(generarLetraAleatoria());
            pelicula.setTitulo(generarLetraAleatoria());
            pelicula.setDuracion(generarNumeroAleatorio());
            peliculas.add(pelicula);
        }
        return peliculas;
    }

}
    
    
