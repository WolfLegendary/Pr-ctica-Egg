/*
Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos una frase (String) y su 
longitud. Agregar constructor vacío y con atributo frase solamente. Agregar getters y setters. El constructor con 
frase como atributo debe setear la longitud de la frase de manera automática.
 */
package Entidad;

/**
 * @author The Wolf Legendary
 */

public class Cadena {

    private String frase;
    private int longitud;
//Inicialización en el construtor vacio
    public Cadena() {
        this.frase = "";
        this.longitud = 0;
    }

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
