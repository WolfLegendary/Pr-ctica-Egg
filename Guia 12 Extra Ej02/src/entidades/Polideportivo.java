/*
 • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Polideportivo extends Edificio{

    public Polideportivo(String nombre, Boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getTechado() {
        return techado;
    }

    //Atributos agregados
    public void setTechado(Boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return "Tipo Polideportivo{" + "nombre=" + nombre + ", techado=" + techado + ". Dimensiones{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "}}";
    }
    private String nombre;
    private Boolean techado;
   
    @Override
    public int calcularSuperficie() {
        int superficie=this.ancho*this.largo;
        return superficie;
                
    }

    @Override
    public int calcularVolumen() {
        int volumen=this.alto*calcularSuperficie();
        return volumen;
        
    }
    
}
