package entidades;

import java.util.List;

/**
 *
 * @author The Wolf Legendary
 */
public class Cine {

    /*
    De Cine nos interesa conocer la película que se está reproduciendo, la
    sala con los espectadores y el precio de la entrada.
    Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
    etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
    la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
    ocupado se muestra una X, sino un espacio vacío.
    8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X
    7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
    6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F
    5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
    4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
    3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X
    2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
    1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
     */
    //Atributos
    private Asiento sala[][];
    private List<String> asientosLibres;
    private Pelicula pelicula;
    private Integer precio;

    public Cine() {
    }

    public Cine(Asiento[][] sala, List<String> asientosLibres, Pelicula pelicula, Integer precio) {
        this.sala = sala;
        this.asientosLibres = asientosLibres;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Asiento[][] getSala() {
        return sala;
    }

    public void setSala(Asiento[][] sala) {
        this.sala = sala;
    }

    public List<String> getAsientosLibres() {
        return asientosLibres;
    }

    public void setAsientosLibres(List<String> asientosLibres) {
        this.asientosLibres = asientosLibres;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", asientosLibres=" + asientosLibres + ", pelicula=" + pelicula + ", precio=" + precio + '}';
    }

}
