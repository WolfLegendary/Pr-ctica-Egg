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

    //El código siguiente nos permite tener todos los servicios juntos en un solo menú/servicio
    //Atributos
    private final AutorServicio autorServicio = new AutorServicio();
    private final EditorealServicio editorealServicio = new EditorealServicio();
    private final LibroServicio libroServicio = new LibroServicio();
    private final ClienteServicio clienteServicio = new ClienteServicio();

    public Menu() {
        libroServicio.setServicios(autorServicio, editorealServicio);
        autorServicio.setServicios(libroServicio, editorealServicio);
        editorealServicio.setServicios(autorServicio, libroServicio);
        clienteServicio.setServicios(autorServicio, editorealServicio, libroServicio);
    }
    //Métodos generales
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro crearLibro() {
        System.out.println("A continuación, ingrese los datos del nuevo libro.");
        System.out.println("Ingrese el título del libro.");
        leer.nextLine();
        String titulo = leer.nextLine();
        //Crear una búsqueda del título, que no prosiga.
        if (libroServicio.buscarPorTitulo(titulo) != null) {
            System.out.println("El libro ya existe o ingresó datos erróneos.");
            return null;
        } else {
            //El resto de los datos se completan de manera automática, porque se torna aburrido ingresar por teclado.
            Integer anio = 1992;
            Integer ejemplares = 10;
            Integer ejemplatesPrestados = 0;
            Integer ejemplaresRestantes = 10;
            String nombreAutor = "Madre Man";
            Autor autor = autorServicio.crearAutor(nombreAutor);
            String nombreEditoreal = "Editoreal genérica";
            Editoreal editoreal = editorealServicio.crearEditoreal(nombreEditoreal);
            //Creamos y asigamos el libro
            Libro libro = libroServicio.crearLibro(titulo, anio, ejemplares, ejemplatesPrestados, ejemplaresRestantes, autor, editoreal);
            return libro;
        }
    }

    public void crearCliente() {
        leer.nextLine();
        System.out.println("Ingrese el nombre del cliente.");
        String nombre = leer.nextLine();
        clienteServicio.crearCliente(nombre);
    }

    public void imprimirLibros() {
        libroServicio.listarLibros();
    }

    public void altaBajaLibro() {
        System.out.println("Ingrese el ISBN para dar baja o de alta un libro.");
        Long isbn = leer.nextLong();
        libroServicio.bajaAltaLibro(isbn);
    }

    public void modificarLibro() {
        System.out.println("A continuación, ingrese el isbn del libro a modificar.");
        Long isbn = leer.nextLong();
        Libro libro = libroServicio.buscarPorISBN(isbn);
        if (libro != null) {
            System.out.println("Elija nuevo título del libro: ");//Se hace solo con el título como ejemplo.
            leer.nextLine();
            String titulo = leer.nextLine();
            libro.setTitulo(titulo);
            //Luego de setear los valores nuevos, se modifica y guarda el libro en la base de datos.
            libroServicio.modificarLibro(libro);
        } else {
            System.out.println("No se econtro el libro con ISBN: " + isbn);
        }
    }

    public Libro buscarLibroPorNombreDeAutor() {
        leer.nextLine();
        System.out.println("Ingrese el nombre del Autor, del libro a consultar.");
        String autor = leer.nextLine();
        Libro libro = libroServicio.buscarPorNombreDeAutor(autor);
        if (libro != null) {
            System.out.println("El libro con el nombre " + autor + " de Autor es:");
            System.out.println(libro);
            return libro;
        } else {
            System.out.println("No se ha encontrado libro con el nombre " + autor + " de Autor.");
            return null;
        }
    }

    public Libro buscarLibroPorNombreDeEditoreal() {
        leer.nextLine();
        System.out.println("Ingrese el nombre de Editoreal, del libro a consultar.");
        String nombre = leer.nextLine();
        Libro libro = libroServicio.buscarPorNombreDeEditoreal(nombre);
        if (libro != null) {
            System.out.println("El libro con el nombre " + nombre + " de Editoreal es:");
            System.out.println(libro);
            return libro;
        } else {
            System.out.println("No se ha encontrado libro con el nombre " + nombre + " de Editoreal.");
            return null;
        }
    }

    public Libro buscarLibroPorNombre() {
        leer.nextLine();
        System.out.println("Ingrese el nombre del libro a consultar.");
        String nombre = leer.nextLine();
        Libro libro = libroServicio.buscarPorTitulo(nombre);
        if (libro != null) {
            System.out.println("El libro con el nombre " + nombre + " es:");
            System.out.println(libro);
            return libro;
        } else {
            System.out.println("No se ha encontrado libro con el nombre " + nombre + ".");
            return null;
        }
    }

    public Libro buscarLibroPorISBN() {
        System.out.println("Ingrese el ISBN del libro a consultar.");
        Long isbn = leer.nextLong();
        Libro libro = libroServicio.buscarPorISBN(isbn);
        if (libro != null) {
            System.out.println("El libro con el ISBN " + isbn + " es:");
            System.out.println(libro);
            return libro;
        } else {
            System.out.println("No se ha encontrado libro con el ISBN " + isbn + ".");
            return null;
        }
    }

    public Autor buscarAutorPorNombre() {
        leer.nextLine();
        System.out.println("Ingrese el nombre del autor a consultar.");
        String nombre = leer.nextLine();
        Autor autor = autorServicio.buscarPorNombre(nombre);
        if (autor != null) {
            System.out.println("El libro con el nombre " + nombre + " de autor es:");
            System.out.println(autor);
            return autor;
        } else {
            System.out.println("No se ha encontrado el autor con el nombre " + nombre + ".");
            return null;
        }
    }

    public void modificarAutorDeLibro() {
        System.out.println("A continuación, ingrese el isbn del libro a modificar.");
        Long isbn = leer.nextLong();
        Libro libro = libroServicio.buscarPorISBN(isbn);
        if (libro != null) {
            System.out.println("Escriba el ID del nuevo autor: ");
            Integer id = leer.nextInt();
            Autor autor = autorServicio.buscarPorID(id);
            if (autor != null) {
                libro.setAutor(autor);
                //Luego de setear los valores nuevos, se modifica y guarda el libro en la base de datos.
                libroServicio.modificarLibro(libro);
            } else {
                System.out.println("No existe autor con número " + id + " de ID.");
            }
        } else {
            System.out.println("No se econtró el libro con ISBN: " + isbn);
        }
    }

    public void menu() {
        System.out.println("¡Bienvenido!");
        int opcion;
        do {
            System.out.println("Escoja una opción del menú.");
            System.out.println("1- Listamos todos los libros.");
            System.out.println("2- Buscamos un libro por nombre de Autor.");
            System.out.println("3- Dar de baja/alta un libro.");
            System.out.println("4- Buscar un autor por nombre.");
            System.out.println("5- Buscamos un libro por código ISBN.");
            System.out.println("6- Buscamos un libro por nombre de título.");
            System.out.println("7- Buscamos un libro por nombre de Editoreal.");
            System.out.println("8- Modificamos el nombre del título de un libro.");
            System.out.println("9- Creamos un libro nuevo.");
            System.out.println("10- Cambiamos el autor de un libro.");
            System.out.println("11- Crear cliente.");
            System.out.println("12- Registrar el préstamo de un libro.");
            System.out.println("13- Devolver un libro.");
            System.out.println("14- Salir.");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        // Listamos todos los libros
                        imprimirLibros();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        // Buscamos un libro por nombre de Autor.
                        buscarLibroPorNombreDeAutor();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        // Dar de baja/alta un libro.
                        altaBajaLibro();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 4:
                    try {
                        // Buscar un autor por nombre
                        buscarAutorPorNombre();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        // Buscamos un libro por código ISBN.
                        buscarLibroPorISBN();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 6:
                    try {
                        // Buscamos un libro por nombre de título.
                        buscarLibroPorNombre();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 7:
                    try {
                        // Buscamos un libro por nombre de Editoreal.
                        buscarLibroPorNombreDeEditoreal();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 8:
                    try {
                        // Modificamos el nombre del título de un libro.
                        modificarLibro();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 9:
                    try {
                        // Creamos un libro nuevo.
                        crearLibro();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 10:
                    try {
                        // Cambiamos el autor de un libro..
                        modificarAutorDeLibro();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 11:
                    try {
                        // Crear cliente.
                        crearCliente();
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 12:
                    try {
                        // Registrar el préstamo de un libro.
                        
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 13:
                    try {
                        // 
                        
                    } catch (Exception e) {
                        System.out.println("Error del sistema por \n" + e.getMessage());
                    }
                    break;
                case 14:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Ha ingresado una opción no válida.");
                    break;
            }
        } while (opcion != 14);
        leer.close(); // Cierra el objeto Scanner al final del método.
    }
}
/*
    public void eliminarLibro() {
        try {
            System.out.println("Ingrese el isbn del libro a eliminar.");
            Long isbn = leer.nextLong();
            libroServicio.eliminarPorISBN(isbn);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
 */
