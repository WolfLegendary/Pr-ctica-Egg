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
package Entidad;

import java.util.Comparator;

/**
 *
 * @author The Wolf Legendary
 */
public class Pelicula {

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }
    //Atributos; título, director y duración de la película (en horas)
    private String titulo;
    private String director;
    private Integer duracion;

    /*
• El método crea un objeto estático de la interfaz Comparator. Este nos va a permitir utilizar
a través de un sobrescribir (Override) el método compare, el mismo nos deja comparar dos
objetos para poder ordenarlos. Este objeto se crea static para poder llamar al método solo
llamando a la clase, sin tener que crear otro objeto Comparator, en este caso la clase
Pelicula.
• Dentro de la creación de objeto se crea un método de la clase Comparator llamado
compare, arriba del método se puede ver la palabra Override. Override, se usa cuando
desde una subclase (Pelicula), queremos utilizar un método de otra clase (Comparator) en
nuestra subclase.
• El método recibe dos objetos de la clase Perro y retorna una comparación entre los dos
usando los get para traer el atributo que queríamos comparar y usa la función compareTo,
que devuelve 0 si los atributos son lo mismo, 1 si el atributo uno es mayor al segundo y -1 si el
atributo dos es menor al segundo.
• Si quisiéramos cambiar el atributo que usa para ordenar, pondríamos otro atributo en el
get del return.
     */
 /*public static Comparator<Pelicula> compararDuracion = new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula p1, Pelicula p2) {
        return p1.getDuracion().compareTo(p2.getDuracion());
    }
};*/
    public static Comparator<Pelicula> compararDuracion = (p1, p2) -> p2.getDuracion().compareTo(p1.getDuracion());

    public static Comparator<Pelicula> compararDuracionInver = (p1, p2) -> p1.getDuracion().compareTo(p2.getDuracion());

    public static Comparator<Pelicula> compararDuracionTitulo = (p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo());

    public static Comparator<Pelicula> compararDuracionDirector = (p1, p2) -> p1.getDirector().compareTo(p2.getDirector());

}
