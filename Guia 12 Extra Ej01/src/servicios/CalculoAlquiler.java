
package servicios;

import entidades.Alquiler;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author The Wolf Legendary
 */
public class CalculoAlquiler {
   
    /*
    Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).
    */
    
    public int calculoAlquiler(Alquiler alquiler) {
        String fechaAlquilerString = alquiler.getFechaAlquilerString();
        String fechaDevolucionString = alquiler.getFechaDevolucionString();
        // Formatear la cadena de fecha según el formato deseado
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaAlquiler = LocalDate.parse(fechaAlquilerString, formatter);
        LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionString, formatter);
        // Calcular la diferencia de días entre la fecha de alquiler y la fecha devolución
        int diasOcupacion = (int)(fechaDevolucion.toEpochDay() - fechaAlquiler.toEpochDay());
        alquiler.setPrecioFinal(diasOcupacion*10*alquiler.getBarco().getEslora());
        return alquiler.getPrecioFinal();
    }

}
