/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author The Wolf Legendary
 */
public class EdificioDeOficinas extends Edificio{

    public EdificioDeOficinas(ArrayList<Oficina> oficinas, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = oficinas.size();
        this.oficinas = oficinas;
        this.numPisos = numOficinas;
    }

    public Integer getNumOficinas() {
        return numOficinas;
    }

    public void setNumOficinas(Integer numOficinas) {
        this.numOficinas = numOficinas;
    }

    public ArrayList<Oficina> getOficinas() {
        return oficinas;
    }

    public void setOficinas(ArrayList<Oficina> oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getNumPisos() {
        return numPisos;
    }

    //Atributos agregados
    @Override
    public String toString() {
        return "Tipo Edificio de Oficinas{" + "Cantidad de oficinas=" + numOficinas +", Cantidad de pisos=" + numPisos + ". Dimensiones{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + "}}";
    }
    private Integer numOficinas;
    private ArrayList<Oficina>oficinas;
    private Integer numPisos;

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
