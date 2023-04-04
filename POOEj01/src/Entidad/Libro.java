/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para 
cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, 
el autor del libro y el número de páginas.
 */
package Entidad;

import java.util.Scanner;

public class Libro {
    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroDePagina;

    public Libro() {}

    public Libro(int ISBN, String titulo, String autor, int numeroDePagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePagina = numeroDePagina;
    }

    public void cargarDatos() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese ISBN:");
        this.ISBN = leer.nextInt();
        System.out.println("Ingrese Título:");
        this.titulo = leer.next();
        System.out.println("Ingrese Autor:");
        this.autor = leer.next();
        System.out.println("Ingrese Número de Página:");
        this.numeroDePagina = leer.nextInt();
    }

    public void mostrarDatos() {
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Número de Página: " + this.getNumeroDePagina());
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePagina() {
        return numeroDePagina;
    }

    public void setNumeroDePagina(int numeroDePagina) {
        this.numeroDePagina = numeroDePagina;
    }
}
