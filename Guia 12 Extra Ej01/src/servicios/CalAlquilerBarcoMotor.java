/*
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.
 */
package servicios;

import entidades.Alquiler;
import entidades.BarcoMotor;

/**
 *
 * @author The Wolf Legendary
 */
public class CalAlquilerBarcoMotor extends CalculoAlquiler {

    @Override
    public int calculoAlquiler(Alquiler alquiler) {
        //Introducimos obj alquiler por parametro
        alquiler.setPrecioFinal(super.calculoAlquiler(alquiler));    
        BarcoMotor barcoMotor = (BarcoMotor) alquiler.getBarco();
        alquiler.setPrecioFinal(alquiler.getPrecioFinal() + barcoMotor.getPotenciaCV());
        
        return alquiler.getPrecioFinal();
    }
}
