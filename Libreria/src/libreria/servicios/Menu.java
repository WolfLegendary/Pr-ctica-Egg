package libreria.servicios;

import java.util.Scanner;
import libreria.entidades.Autor;
import libreria.entidades.Editoreal;
import libreria.entidades.Libro;

/**
 *
 * @author The Wolf Legendary
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    //Atributos
    private final AutorServicio autorServicio = new AutorServicio();
    private final EditorealServicio editorealServicio = new EditorealServicio();
    private final LibroServicio libroServicio = new LibroServicio();

    public Menu() {
        libroServicio.setServicios(autorServicio, editorealServicio);
        autorServicio.setServicios(libroServicio, editorealServicio);
        editorealServicio.setServicios(autorServicio, libroServicio);
    }

    //El código desde la línea 13 al 21 nos permite tener todos los servicios juntos en un solo menú
    public Libro crearLibro() {
        System.out.println("A continuación, ingrese los datos de la nueva película.");
        System.out.println("Ingrese el título de la película.");
        String titulo = leer.nextLine();
        //Crear una búsqueda de titulo y nombre de autor, si hay coincidencia, que no prosiga.
        //El resto de los datos se completan de manera automática, porque se torna aburrido ingresar por teclado.
        Integer anio = 1992;
        Integer ejemplares = 10;
        Integer ejemplatesPrestados = 0;
        Integer ejemplaresRestantes = 10;
        String nombreAutor = "Autor genérico";
        Autor autor = autorServicio.crearAutor(nombreAutor);
        String nombreEditoreal = "Editoreal genérica";
        Editoreal editoreal = editorealServicio.crearEditoreal(nombreEditoreal);
        //Creamos y asigamos el libro
        Libro libro = libroServicio.crearLibro(titulo, anio, ejemplares, ejemplatesPrestados, ejemplaresRestantes, autor, editoreal);
        return libro;

    }

}
