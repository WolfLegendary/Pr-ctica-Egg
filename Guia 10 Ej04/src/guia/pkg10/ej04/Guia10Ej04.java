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
package guia.pkg10.ej04;

import Entidad.Pelicula;
import Servicio.ServicioPelicula;
import java.util.ArrayList;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia10Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPelicula spelicula=new ServicioPelicula();
        ArrayList<Pelicula> peliculas=new ArrayList();
        
        peliculas=spelicula.fabricaAleatoriaPeliculas();
 
        //spelicula.crearPelicula(peliculas);
        System.out.println("A continuación, se muestran todas las películas ingresadas.");
        spelicula.mostrarPeliculas(peliculas);
        System.out.println("");
        System.out.println("A continuación se muestran las películas con más de una hora de duración.");
        spelicula.mostrarPeliculasMayorAunaHora(peliculas);
        System.out.println("");
        System.out.println("A continuación se muestran las películas ordenadas de mayor a menor duración.");
        spelicula.ordenarPeliculasMayorMenor(peliculas);
        System.out.println("");
        System.out.println("A continuación se muestran las películas ordenadas de menor a mayor duración.");
        spelicula.ordenarPeliculasMenorMayor(peliculas);
        System.out.println("");
        System.out.println("A continuación se muestran las películas ordenadas por Título.");
        spelicula.ordenarPeliculasPorTitulo(peliculas);
        System.out.println("");
        System.out.println("A continuación se muestran las películas ordenadas por Director.");
        spelicula.ordenarPeliculasPorDirector(peliculas);
        System.out.println(""); 
    }
    
}
