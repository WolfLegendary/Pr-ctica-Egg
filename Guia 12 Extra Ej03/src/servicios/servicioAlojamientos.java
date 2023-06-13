/*
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package servicios;

import entidades.Alojamiento;
import entidades.Camping;
import entidades.Hoteles;
import entidades.Residencia;
import java.util.ArrayList;

/**
 *
 * @author The Wolf Legendary
 */
public class servicioAlojamientos {

    public void mostrarAlojamientos(ArrayList<Alojamiento> alojamientos) {
        int numero = 1;
        System.out.println("A continuación, se muestran todos los alojamientos disponibles.");
        System.out.println("");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println("Alojamiento " + numero + ".");
            System.out.println(alojamiento);
            System.out.println("");
            numero++;
        }
        System.out.println("------------------------------------------------------------------");
    }

    public void hotelesOrdenadosAlMayor(ArrayList<Alojamiento> alojamientos) {
        int cant = 0;
        if (!alojamientos.isEmpty()) {
            ArrayList<Hoteles> hoteles = new ArrayList<>();

            for (Alojamiento alojamiento : alojamientos) {
                if (alojamiento instanceof Hoteles) {
                    Hoteles hotel = (Hoteles) alojamiento;
                    hoteles.add(hotel);
                    cant++;
                }
            }
            if (cant == 0) {
                System.out.println("No existen hoteles en los alojamientos disponibles.");
                System.out.println("------------------------------------------------------------------");
            } else {
                hoteles.sort(Hoteles.compararPrecio);
                System.out.println("Se muestran los hoteles ordenados de mayor a menor precio: ");
                System.out.println("");
                for (Hoteles hotel : hoteles) {
                    System.out.println(hotel);
                    System.out.println("");
                }
                System.out.println("------------------------------------------------------------------");
            }
        } else {
            System.out.println("No queda ningún alojamiento disponible.");
            System.out.println("------------------------------------------------------------------");
        }
    }

    public void residenciasCondescuento(ArrayList<Alojamiento> alojamientos) {
        int cant = 0;
        if (!alojamientos.isEmpty()) {
            ArrayList<Residencia> residencias = new ArrayList<>();
            //Buscamos un alojamiento específico dentro de los alojamientos.
            for (Alojamiento alojamiento : alojamientos) {
                if (alojamiento instanceof Residencia) {
                    Residencia residencia = (Residencia) alojamiento;
                    residencias.add(residencia);
                    cant++;
                }
            }
            if (cant == 0) {
                System.out.println("No existen residencias en los alojamientos disponibles.");
                System.out.println("------------------------------------------------------------------");
            } else {
                System.out.println("Se muestran las residencias que poseen descuento.");
                System.out.println("");
                for (Residencia residencia : residencias) {
                    if (residencia.getDescuentoGremios()) {
                        System.out.println(residencia);
                        System.out.println("");
                    }
                }
                System.out.println("------------------------------------------------------------------");
            }
        } else {
            System.out.println("No queda ningún alojamiento disponible.");
            System.out.println("------------------------------------------------------------------");
        }

    }

    public void campingConRestaurantes(ArrayList<Alojamiento> alojamientos) {
        int cant = 0;
        if (!alojamientos.isEmpty()) {
            ArrayList<Camping> campings = new ArrayList<>();
            //Buscamos un alojamiento específico dentro de los alojamientos.
            for (Alojamiento alojamiento : alojamientos) {
                if (alojamiento instanceof Camping) {
                    Camping camping = (Camping) alojamiento;
                    campings.add(camping);
                    cant++;
                }
            }
            if (cant == 0) {
                System.out.println("No existen campings en los alojamientos disponibles.");
                System.out.println("------------------------------------------------------------------");
            } else {
                System.out.println("Se muestran los campings que poseen restaurante.");
                System.out.println("");
                for (Camping camping : campings) {
                    if (camping.getRestaurante()) {
                        System.out.println(camping);
                        System.out.println("");
                    }
                }
                System.out.println("------------------------------------------------------------------");
            }
        } else {
            System.out.println("No queda ningún alojamiento disponible.");
            System.out.println("------------------------------------------------------------------");
        }

    }

}
