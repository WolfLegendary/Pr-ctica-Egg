/*
• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.
*/
package entidades;

import java.util.Comparator;
import java.util.HashSet;

/**
 *
 * @author The Wolf Legendary
 */
public class Voto {

    public Voto() {
    }

    public Voto(Alumno alumno, HashSet<Alumno> votosRealizados) {
        this.alumno = alumno;
        this.votosRealizados = votosRealizados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public HashSet<Alumno> getVotosRealizados() {
        return votosRealizados;
    }

    public void setVotosRealizados(HashSet<Alumno> votosRealizados) {
        this.votosRealizados = votosRealizados;
    }

    @Override
    public String toString() {
        return "Voto{" + "alumno=" + alumno + ", votosRealizados=" + votosRealizados + '}';
    }
    
    
    private Alumno alumno;
    HashSet<Alumno> votosRealizados;
    //Atributos
    
     public static Comparator<Voto> compararVotos = (a2, a1) -> a1.getAlumno().getCantVotos().compareTo(a2.getAlumno().getCantVotos());
    
}
