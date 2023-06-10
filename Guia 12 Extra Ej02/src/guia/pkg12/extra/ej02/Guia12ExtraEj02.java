/*
Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:

• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.
Estos métodos serán abstractos y los implementarán las siguientes clases:

• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.

• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
 */
package guia.pkg12.extra.ej02;

import entidades.Edificio;
import entidades.EdificioDeOficinas;
import entidades.Oficina;
import entidades.Polideportivo;
import java.util.ArrayList;
import servicios.ServicioEdificioDeOficinas;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia12ExtraEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont = 0;

        ArrayList<Edificio> edificios = new ArrayList<>();
        ArrayList<Oficina> oficinas = new ArrayList<>();
        ServicioEdificioDeOficinas servicioOficinas = new ServicioEdificioDeOficinas();
        /*
        Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.

Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
cantPersonas() y mostrar los resultados de cada edificio de oficinas.
        
         */
        // Entran 10 personas en cada oficina.
        for (int i = 0; i < 2; i++) {
            Oficina oficina = new Oficina(10);
            oficinas.add(oficina);
        }

        for (int i = 0; i < 2; i++) {
            Polideportivo polideportivo = new Polideportivo("Polideportivo " + (i + 1), Boolean.TRUE, 10, 10, 10);
            EdificioDeOficinas edificioDeOficinas = new EdificioDeOficinas(oficinas, 10, 10, 10);
            edificios.add(polideportivo);
            edificios.add(edificioDeOficinas);
        }
        for (Edificio edificio : edificios) {
            System.out.println("Superficie del Edificio " + (cont + 1) + ":");
            System.out.println(edificio.calcularSuperficie() + "m^2");
            System.out.println("Volumen del Edificio " + (cont + 1) + ":");
            System.out.println(edificio.calcularVolumen() + "m^3");

            if (edificio instanceof EdificioDeOficinas) {

                servicioOficinas.cantPersonas((EdificioDeOficinas) edificio);
            }
            System.out.println(edificio);
            cont++;
            System.out.println("");
        }

    }

}
