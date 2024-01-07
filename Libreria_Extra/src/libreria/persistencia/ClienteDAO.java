package libreria.persistencia;

import libreria.entidades.Cliente;

/**
 *
 * @author TWL
 */
public class ClienteDAO extends DAO<Cliente>{
    
   @Override
   public void persistir(Cliente cliente) {
        try {
            if (cliente != null) {
                super.persistir(cliente);
                System.out.println("Cliente guardado con éxito!");
            } else {
                System.out.println("¡Cliente sin datos!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
   
}
