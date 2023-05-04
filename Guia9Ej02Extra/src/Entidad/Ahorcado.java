/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un 
vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que puede
realizar el usuario. 
 */
package Entidad;

/**
 * @author The Wolf Legendary
 */
public class Ahorcado {
    //Atributos
    int longitud;
    char[] letras = new char[longitud];
    private int cantLetrasEncontradas;
    private int cantJugadasMaximas;    
    
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char[] getLetras() {
        return letras;
    }

    public void setLetras(char[] letras) {
        this.letras = letras;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public Ahorcado(int longitud, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.longitud = longitud;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }
   
    public Ahorcado() {
    }
    
}
