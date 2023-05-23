/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package entidades;

import java.util.Random;

/**
 *
 * @author The Wolf Legendary
 */
public class revolver {

    //Atributos
    private Integer pactual;
    private Integer pagua;

    public revolver() {
    }

    public revolver(Integer pactual, Integer pagua) {
        this.pactual = pactual;
        this.pagua = pagua;
    }

    public Integer getPactual() {
        return pactual;
    }

    public void setPactual(Integer pactual) {
        this.pactual = pactual;
    }

    public Integer getPagua() {
        return pagua;
    }

    public void setPagua(Integer pagua) {
        this.pagua = pagua;
    }

    @Override
    public String toString() {
        return "revolver{" + "pactual=" + pactual + ", pagua=" + pagua + '}';
    }

    public void llenarRevolver() {
        /*
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
         */
        Random random1 = new Random();
        pactual = random1.nextInt(6); // Genera un número aleatorio entre 0 y 5 (ambos inclusive)
        Random random2 = new Random();
        pagua = random2.nextInt(6); // Genera un número aleatorio entre 0 y 5 (ambos inclusive)
    }

    public boolean mojar() {
        /*
• mojar(): devuelve true si la posición del agua coincide con la posición actual
         */
        return (pactual.equals(pagua));
    }

    public void siguienteChorro() {
        /*
• siguienteChorro(): cambia a la siguiente posición del tambor  
         */
        pactual = pactual + 1;
        if (pactual == 6) {
            pactual = 0;
        }
    }

}
