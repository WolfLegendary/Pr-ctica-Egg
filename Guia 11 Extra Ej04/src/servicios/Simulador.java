/*
Desarrollar un simulador del sistema de votación de facilitadores en Egg-
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador que va a
tener los métodos para manejar los alumnos y sus votaciones. Estos métodos serán llamados
desde el main.
• La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
• Ahora tendremos un método que, usando las dos listas generadas, cree una cantidad de
objetos Alumno, elegidos por el usuario, y le asigne los nombres y los dnis de las dos
listas a cada objeto Alumno. No puede haber dos alumnos con el mismo dni, pero si con el
mismo nombre.
• Se debe imprimir por pantalla el listado de alumnos.

• Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos,
un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó.

• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.

• Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.

• Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.

• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
 */
package servicios;

import entidades.Alumno;
import entidades.Facilitadores;
import entidades.Voto;
import enums.Apellidos;
import enums.Nombres;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class Simulador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
    • La clase Simulador debe tener un método que genere un listado de alumnos manera
aleatoria y lo retorne. Las combinaciones de nombre y apellido deben ser generadas de
manera aleatoria. Nota: usar listas de tipo String para generar los nombres y los apellidos.
     */
    public ArrayList<Alumno> generaListaAlumnos() {
        ArrayList<Integer> dniAleatorios = new ArrayList<>();
        int dni;
        Boolean status = false;
        int control = 0;
        ArrayList<Alumno> alumnos = new ArrayList();
        Nombres[] nombres = Nombres.values();
        Nombres nombreAlumno;
        Apellidos[] apellidos = Apellidos.values();
        Apellidos apellidoAlumno;
        String nombreCompleto;
        String nombre;
        String apellido;
        int cantidad;
        do {
        System.out.println("Ingrese la cantidad de alumnos que desea generar.");
        System.out.println("Mínimo deberán ser 5.");
        cantidad = leer.nextInt();}
        while(cantidad<5);
        
        for (int i = 0; i < cantidad; i++) {
            Alumno alumno = new Alumno();
            Random r = new Random();
            //Generamos indice y seleccionamos nombre de manera aleatoria
            int indice = r.nextInt(nombres.length);
            nombreAlumno = nombres[indice];
            //Pasamos nombre a String
            nombre = nombreAlumno.toString();
            //Generamos indice y seleccionamos apellido de manera aleatoria
            indice = r.nextInt(apellidos.length);
            apellidoAlumno = apellidos[indice];
            //Pasamos apellido a String
            apellido = apellidoAlumno.toString();
            //Generamos el nombre completo
            nombreCompleto = nombre.concat(" " + apellido);
            //Guardamos el nombre completo
            alumno.setNombreCompleto(nombreCompleto);
            //LLamamos funcion para generar DNI aleatorio, formato Argentino
            //Creamos el siguiente While para que no se repita el DNI generado.
            while (!status) {
                dni = generarDNIAleatorio();
                for (int aux : dniAleatorios) {
                    if (aux == dni) {
                        status = true;
                    }
                }
                if (status) {
                    control++;
                    if (control == 5) {
                        System.out.println("Se detuvo el programa porque se generaron 5 DNI idénticos.");
                        System.exit(0); // Detiene la ejecución del programa por completo
                    }
                    status = false;
                } else {
                    dniAleatorios.add(dni);
                    break;
                }
            }
            alumno.setDNI(generarDNIAleatorio());
            //Por defecto la cantidad de votos es cero.
            alumno.setCantVotos(0);
            alumnos.add(alumno);
        }
        return alumnos;
    }

    /*
• Ahora hacer un generador de combinaciones de DNI posibles, deben estar dentro de un
rango real de números de documentos. Y agregar a los alumnos su DNI. Este método
debe retornar la lista de dnis.
     */
    public int GeneradorDNIArgentino() {
        // Generar un número de DNI aleatorio
        int dni = generarDNIAleatorio();
        return dni;
    }

    public static int generarDNIAleatorio() {
        Random random = new Random();

        // Generar los 7 dígitos del DNI
        int dniBase = random.nextInt(9999999) + 1;

        // Calcular el dígito verificador
        int digitoVerificador = calcularDigitoVerificador(dniBase);

        // Combinar el número base y el dígito verificador
        int dniCompleto = dniBase * 10 + digitoVerificador;

        return dniCompleto;
    }

    public static int calcularDigitoVerificador(int dniBase) {
        int[] coeficientes = {2, 3, 4, 5, 6, 7};
        int suma = 0;

        for (int i = 0; i < coeficientes.length; i++) {
            int digito = dniBase % 10;
            suma += digito * coeficientes[i];
            dniBase /= 10;
        }

        int resto = suma % 11;
        int digitoVerificador;

        if (resto == 0) {
            digitoVerificador = 0;
        } else {
            digitoVerificador = 11 - resto;
        }
        return digitoVerificador;
    }
    
    /*
• Crearemos un método votación en la clase Simulador que, recibe el listado de alumnos y
para cada alumno genera tres votos de manera aleatoria. En este método debemos
guardar a el alumno que vota, a los alumnos a los que votó y sumarle uno a la cantidad de
votos a cada alumno que reciba un voto, que es un atributo de la clase Alumno.
Tener en cuenta que un alumno no puede votarse a sí mismo o votar más de una vez al
mismo alumno. Utilizar un hashset para resolver esto.
*/
    
    public ArrayList<Voto> votacion(ArrayList<Alumno> alumnos, Facilitadores facilitadores) {
        
        HashSet<Alumno> facilitadoresPrincipales = new HashSet<>();
        HashSet<Alumno> facilitadoresSuplentes = new HashSet<>();
        ArrayList<Voto> votos = new ArrayList<>();
        Random random = new Random();

        for (Alumno alumno : alumnos) {
            Voto voto = new Voto();
            HashSet<Alumno> votosRealizados = new HashSet<>();

            for (int i = 0; i < 3; i++) {
                Alumno alumnoVotado;
                //Implementamos el do while para que no se vote a sí mismo u repita su voto.
                do {
                    alumnoVotado = alumnos.get(random.nextInt(alumnos.size()));
                } while (alumnoVotado == alumno || votosRealizados.contains(alumnoVotado));

                votosRealizados.add(alumnoVotado);
                alumnoVotado.setCantVotos(alumnoVotado.getCantVotos() + 1);
                if (facilitadoresPrincipales.size() < 5 && !facilitadoresPrincipales.contains(alumnoVotado)) {
                    facilitadoresPrincipales.add(alumnoVotado);
                }
            }
            //Completamos el objeto voto para cada alumno
            voto.setAlumno(alumno);
            voto.setVotosRealizados(votosRealizados);
            votos.add(voto);
        }
        facilitadores.setFacilitadoresPrincipales(facilitadoresPrincipales);
        
        ordenarVotosMayorMenor(votos);
        
       
        for (Voto voto : votos) {
            if (facilitadoresSuplentes.size() < 5) {
                facilitadoresSuplentes.add(voto.getAlumno());
            } else {
                break;
            }

        }
             
        facilitadores.setFacilitadoresSuplentes(facilitadoresSuplentes);
        
        return votos;
    }
  
      
        public void ordenarVotosMayorMenor(ArrayList<Voto> votos) {
        votos.sort(Voto.compararVotos);
    }
        
    
    
    
    /*
    • Se debe crear un método que muestre a cada Alumno con su cantidad de votos y cuales
fueron sus 3 votos.
     */
    public void mostrarVotosAlumnos(ArrayList<Voto> votos) {
        for (Voto voto : votos) {
            System.out.println("La cantidad de votos de " + voto.getAlumno().getNombreCompleto() + " es de " + voto.getAlumno().getCantVotos() + ".");
            System.out.println(voto.getAlumno().getNombreCompleto() + " votó a " + voto.getVotosRealizados());
            System.out.println("");
        }
    }

    /*
    • Se debe crear un método que haga el recuento de votos, este recibe la lista de Alumnos y
comienza a hacer el recuento de votos.
     */
    public int recuentoVotos(ArrayList<Alumno> alumnos) {
        int sumaVotos=0;
        for (Alumno alumno : alumnos) {
            sumaVotos=+alumno.getCantVotos();
        }
        System.out.println("La cantidad de votos emitidos fue de "+sumaVotos+".");
        return sumaVotos;
    }

  /*
• Se deben crear 5 facilitadores con los 5 primeros alumnos votados y se deben crear 5
facilitadores suplentes con los 5 segundos alumnos más votados. A continuación, mostrar
los 5 facilitadores y los 5 facilitadores suplentes.
    */
    public void mostrarFacilitadores(Facilitadores facilitadores){
        System.out.println("Los facilitadores principales son: ");
        System.out.println(facilitadores.getFacilitadoresPrincipales());
        System.out.println("Los facilitadores suplentes son: ");
        System.out.println(facilitadores.getFacilitadoresSuplentes());
    }
    
    
}

