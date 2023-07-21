package libreria.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author The Wolf Legendary
 */
@Entity
public class Libro implements Serializable {

    //Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long isbn;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "anio")
    private Integer anio;
    @Column(name = "ejemplares")
    private Integer ejemplares;
    @Column(name = "ejemplaresPrestados")
    private Integer ejemplaresPrestados;
    @Column(name = "ejemplaresRestantes")
    private Integer ejemplaresRestantes;
    @Column(name = "alta")
    private Boolean alta = true;
    @OneToOne
    @JoinColumn(name = "autor_id")
    private Autor autor;
    @OneToOne
    @JoinColumn(name = "editoreal_id")
    private Editoreal editoreal;
    //Métodos
    public Libro() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(Integer ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public Integer getEjemplaresRestantes() {
        return ejemplaresRestantes;
    }

    public void setEjemplaresRestantes(Integer ejemplaresRestantes) {
        this.ejemplaresRestantes = ejemplaresRestantes;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editoreal getEditoreal() {
        return editoreal;
    }

    public void setEditoreal(Editoreal editoreal) {
        this.editoreal = editoreal;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn
                + ", titulo=" + titulo
                + ", anio=" + anio
                + ", ejemplares=" + ejemplares
                + ", ejemplaresPrestados=" + ejemplaresPrestados
                + ", ejemplaresRestantes=" + ejemplaresRestantes
                + ", alta=" + alta
                + ", autor=" + autor
                + ", editoreal=" + editoreal + '}';
    }

}
