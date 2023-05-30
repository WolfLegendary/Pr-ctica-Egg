package guia.pkg11.extra.ej03;

import entidades.Cliente;
import entidades.Poliza;
import entidades.Vehiculo;
import java.util.ArrayList;
import servicios.servicioCuota;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia11ExtraEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        servicioCuota cuotas = new servicioCuota();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Poliza> polizas = new ArrayList<>();
        Poliza poliza = new Poliza();

        //Creamos x cantidad de Clientes
        clientes = cuotas.fabricaClientes();
        cuotas.mostrarClientes(clientes);
        //Creamos x cantidad de vehiculos
        vehiculos = cuotas.fabricaVehiculos();
        cuotas.mostrarVehiculos(vehiculos);

        //Creamos dos polizas y mostramos una poliza
        for (int i = 0; i < 2; i++) {
            poliza = cuotas.crearPoliza(clientes, vehiculos);
            polizas.add(poliza);
        }
        System.out.println("Se muestran las cuotas no vacías.");
        //Creamos las cuotas a partir de las polizas y las mostramos
        cuotas.gestionCuotas(polizas);

    }

}
