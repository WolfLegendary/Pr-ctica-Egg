package libreria.persistencia;

import libreria.entidades.Editoreal;

/**
 *
 * @author The Wolf Legendary
 */
public class EditorealDAO extends DAO<Editoreal> {

    @Override
    public void persistir(Editoreal editoreal) {
        try {
            if (editoreal != null) {
                super.persistir(editoreal);
                System.out.println("Editoreal guardado con éxito!");
            } else {
                System.out.println("¡Editoreal sin datos!");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
