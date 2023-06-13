/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package guia.pkg12.extra.ej03;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Gerente;
import entidades.Hotel4estrellas;
import entidades.Hotel5estrellas;
import entidades.Residencia;
import static java.lang.Boolean.TRUE;
import java.util.ArrayList;
import java.util.Scanner;
import servicios.servicioAlojamientos;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia12ExtraEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //LLamamos a servicio
        servicioAlojamientos servicioAlojamientos = new servicioAlojamientos();
        //Creamos el arraylist padre de todos los alojamientos.
        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        Gerente gerente = new Gerente("Gerente", 36046941);
        //Creamos alojamientos 
        Hotel4estrellas hotel4estrellas1 = new Hotel4estrellas('A', "Resto", 10, 10, 10, 10, "Hotel 4 estrellas", "Un lugar 1", "San Luis", gerente);
        Hotel5estrellas hotel5estrellas1 = new Hotel5estrellas("Resto", 10, 10, 10, 10, 10, 10, 10, "Hotel 5 estrellas", "Un lugar 2", "San Luis", gerente);
        Camping camping1 = new Camping(10, 10, TRUE, TRUE, 10, "Hotel 5 estrellas", "Un lugar 2", "San Luis", gerente);
        Residencia residencia1 = new Residencia(10, TRUE, TRUE, TRUE, 10, "Hotel 5 estrellas", "Un lugar 2", "San Luis", gerente);
        //Guardamos en el arraylist 4 tipos de alojamietos.
        alojamientos.add(hotel4estrellas1);
        alojamientos.add(hotel5estrellas1);
        alojamientos.add(camping1);
        alojamientos.add(residencia1);
        /*/COMIENZO DE PRUEBAS
        System.out.println("Precio de Hotel 4 estrellas:");
        System.out.println(hotel4estrellas1.getPrecioHabitacion() + "$");
        System.out.println(hotel4estrellas1);
        System.out.println("");
        System.out.println("Precio de Hotel 5 estrellas:");
        System.out.println(hotel5estrellas1.getPrecioHabitacion() + "$");
        System.out.println(hotel5estrellas1);
        System.out.println("");
        System.out.println("Descripción de Camping:");
        System.out.println(camping1);
        System.out.println("");
        System.out.println("Descripción de Residencia:");
        System.out.println(residencia1);
        //FIN DE PRUEBAS/*/
        System.out.println("Elija una opción del menú.");

        int menu = 0;
        do {
            System.out.println("1.Mostrar todos los alojamientos.");
            System.out.println("2.Ver hoteles ordenados de mayor a menor precio.");
            System.out.println("3.Ver campings con restaurante.");
            System.out.println("4.Ver residencias con descuento a gremios.");
            System.out.println("5.Salir.");
            menu = leer.nextInt();
            switch (menu) {
                case 1:
                    servicioAlojamientos.mostrarAlojamientos(alojamientos);
                    break;
                case 2:
                    servicioAlojamientos.hotelesOrdenadosAlMayor(alojamientos);
                    break;
                case 3:
                    servicioAlojamientos.campingConRestaurantes(alojamientos);
                    break;
                case 4:
                    servicioAlojamientos.residenciasCondescuento(alojamientos);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    menu = 0;
                    break;
                default:
                    System.out.println("Eligió una opción no válida.");
                    break;
            }
        } while (menu != 0);
    }

}
