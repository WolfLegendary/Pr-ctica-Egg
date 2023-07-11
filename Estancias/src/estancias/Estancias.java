package estancias;

import estancias.servicios.FamiliaServicio;

/**
 *
 * @author TWL
 */
public class Estancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       FamiliaServicio Sfamilia=new FamiliaServicio();
        //PRUEBAS
        try {
            Sfamilia.imprimirCond1();
        } catch (Exception e) {
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
        System.out.println("------------------------------------------------------------------");
        try {
            Sfamilia.imprimirCond3();
        } catch (Exception e) {
            System.out.println("Error del sistema por \n" + e.getMessage());
        }
       
    }
    
}
