/*
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.
 */
package servicios;

import entidades.EdificioDeOficinas;
import entidades.Oficina;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class ServicioEdificioDeOficinas {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    
    public void cantPersonas(EdificioDeOficinas edificio) {
        System.out.println("Se toma como dato que solo existe una oficina por piso.");
        ArrayList<Oficina> oficinas = edificio.getOficinas();
        int piso = 0;
        int cantPersonas;
        int totalPersonas = 0;
        for (Oficina oficina : oficinas) {
            cantPersonas = edificio.getOficinas().get(piso).getCantPersonas();
            totalPersonas += cantPersonas;
            System.out.println("En el piso " + (piso + 1) + " hay " + cantPersonas + ".");
            piso++;
        }
        System.out.println("En total hay " + totalPersonas + " personas en el edificio.");
    }
}
