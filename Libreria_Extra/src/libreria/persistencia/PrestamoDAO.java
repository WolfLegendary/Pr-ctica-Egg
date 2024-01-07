package libreria.persistencia;

import libreria.entidades.Prestamo;

/**
 *
 * @author TWL
 */
public class PrestamoDAO extends DAO<Prestamo>{
    
    @Override
    public void persistir(Prestamo prestamo){
        try {
            if (prestamo != null) {
                super.persistir(prestamo);
                System.out.println("Préstamo guardado con éxito!");
            } else {
                System.out.println("¡Préstamo sin datos!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
}
