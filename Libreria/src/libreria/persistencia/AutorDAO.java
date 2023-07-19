package libreria.persistencia;

import libreria.entidades.Autor;

/**
 *
 * @author The Wolf Legendary
 */
public class AutorDAO extends DAO<Autor> {

    @Override
    public void guardar(Autor autor) {
        try {
            if (autor != null) {
                super.guardar(autor);
                System.out.println("Autor guardado con éxito!");
            } else {
                System.out.println("¡Autor sin datos!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
