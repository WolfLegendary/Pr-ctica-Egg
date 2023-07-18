package Prueba.servicios;

import Prueba.entidades.Entidad;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TWL
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final ServicioService servicio = new ServicioService();

    public void ejecucion() {
        // Declaración y asignación de valores a las variables requeridas
        // para instanciar los objetos necesarios.
        String nombre1 = "Pedro";
        // Creación y asignación de un objeto Entidad
        Entidad e1 = servicio.crearEntidad(nombre1);

    }

    public void eliminarPorId() {
        System.out.println("Ingrese el Id a eliminar: ");
        Long id = leer.nextLong();
        servicio.eliminarPorId(id);
    }

    public void altaBajaLibroPorId() {
        try {
            System.out.println("Ingrese el Id de la entidad que desea dar de baja o alta:");
            long id = leer.nextLong();
            servicio.altaBajaLibroPorId(id);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void modificarPorNombre() {
        Entidad entidad = null;
        System.out.println("Ingrese el nombre de la entidad a modificar: ");
        String nombre = leer.nextLine();
        entidad = servicio.buscarPorNombre(nombre);
        if (entidad != null) {
            System.out.println("Ingrese nuevo nombre.");
            String nombre1 = leer.nextLine();
            entidad.setNombre(nombre1);
            servicio.modificarEntidad(entidad);
        } else {
            System.out.println("No existe entidad con tal nombre.");
        }

    }

    public void listarEntidades() {
        List<Entidad> entidades = servicio.listarEntidades();
        System.out.println("");
        for (Entidad entidad : entidades) {
            System.out.println(entidad);
            System.out.println("");
        }

    }

}
