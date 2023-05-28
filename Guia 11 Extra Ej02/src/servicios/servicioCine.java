/*
Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.

8 A X | 8 B X | 8 C X | 8 D   | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E   | 7 F X
6 A X | 6 B X | 6 C   | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D   | 3 E X | 3 F X
2 A X | 2 B   | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X

Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.
 */
package servicios;

import entidades.Asiento;
import entidades.Cine;
import entidades.Espectador;
import entidades.Pelicula;
import enums.Columnas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class servicioCine {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Vamos a crear la sala del cine con sus respectivos asientos libres.
    public Cine crearSala() {
        Cine cine = new Cine();
        Pelicula pelicula = new Pelicula("El cubo zero", 60, 18, "Desconocido");
        cine.setPrecio(100);
        cine.setPelicula(pelicula);

        Asiento asientos[][] = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Integer a = 8 - i;
                String b = a.toString();
                switch (j) {
                    case 0:
                        b = b.concat(" A");
                        break;
                    case 1:
                        b = b.concat(" B");
                        break;
                    case 2:
                        b = b.concat(" C");
                        break;
                    case 3:
                        b = b.concat(" D");
                        break;
                    case 4:
                        b = b.concat(" E");
                        break;
                    case 5:
                        b = b.concat(" F");
                        break;
                    default:
                        throw new AssertionError();

                }
                asientos[i][j] = new Asiento(b, null);
            }
        }
        List<String> asientosLibres = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (Columnas aux : Columnas.values()) {
                String asiento = (8 - i) + " " + aux.toString();
                asientosLibres.add(asiento);

            }
        }

        cine.setAsientosLibres(asientosLibres);
        cine.setSala(asientos);

        //MERAMENTE PARA VISULIZAR
        System.out.println("Sala creada.");
        Asiento visual[][] = cine.getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(visual[i][j].toString());
            }
            System.out.println("");
        }
        /*  System.out.println("");

        System.out.println("Asientos Libres");
        for (String aux : asientosLibres) {
            System.out.println(aux);
        }
         */
        return cine;
    }

    /*
    Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
     */
    public static int generarNumeroAleatorio() {
        Random random = new Random();
        return random.nextInt(11); // Genera un número aleatorio entre 0 y 10 (ambos inclusive)
    }

    public ArrayList<Espectador> espectadores() {
        ArrayList<Espectador> espectadores = new ArrayList();
        System.out.println("Ingrese cantidad de espectadores a crear.");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Espectador espectador = new Espectador();
            String nombre = "Espectador " + (i + 1);//Genera nombres iguales con ID ordenado
            espectador.setNombre(nombre);
            int dinero = generarNumeroAleatorio() * 100;//Genera de 0 a 1000 pesos.
            espectador.setDinero(dinero);
            espectador.setEdad(generarNumeroAleatorio() * 5);//Genera de 0 a 50 años.
            espectadores.add(espectador);
        }
        return espectadores;
    }

    /*
    Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
     */
    // SE CONTROLAN LOS INTERESADOS Y SE COBRA Y ASIGNA UN ASIENTO DE CORRESPONDER
    public Cine recibirPosiblesEspectadores(Cine cine, ArrayList<Espectador> espectadores) {
        int rechazos = 0;
        int recibidos = 0;
        for (Espectador aux : espectadores) {
            if (aux.getEdad() >= cine.getPelicula().getEdadMinima() && aux.getDinero() >= cine.getPrecio() && cine.getAsientosLibres().size() > 0) {
                //Resta dinero al visitante
                aux.setDinero(aux.getDinero() - cine.getPrecio());
                //Selecciona un lugar para ubicarlo
                int posicionLista = (int) (Math.random() * cine.getAsientosLibres().size());
                String ubicacion = cine.getAsientosLibres().get(posicionLista);
                cine.getAsientosLibres().remove(posicionLista);

                Asiento visual[][] = cine.getSala();
                for (int i = 0; i < 8; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (visual[i][j].getUbicacion().equalsIgnoreCase(ubicacion)) {
                            visual[i][j].setE(aux);
                        }
                    }
                }
                recibidos++;
            } else {
                rechazos++;
            }
        }
        System.out.println("Espectadores recibidos: " + recibidos);
        System.out.println("Recaudación de la funcion: " + recibidos * cine.getPrecio());
        System.out.println("Ingresos rechazados por falta de edad, dinero o capacidad de sala agotada: " + rechazos);
        return cine;
    }

    public void mostrarSala(Cine cine) {
        //MERAMENTE PARA VISULIZAR
        System.out.println("Sala creada.");
        Asiento visual[][] = cine.getSala();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(visual[i][j].toString());
            }
            System.out.println("");
        }
    }

}
