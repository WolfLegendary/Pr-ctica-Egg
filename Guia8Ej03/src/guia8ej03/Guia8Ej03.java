/*
Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos: nombre, edad, 
sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. Si desea añadir algún otro atributo, puede 
hacerlo. Agregar constructores, getters y setters.
En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario y después se le 
asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba que el sexo introducido sea 
correcto, es decir, H, M o O. Si no es correcto se deberá mostrar un mensaje

Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)). Si esta fórmula 
da por resultado un valor menor que 20, significa que la persona está por debajo de su peso ideal y la función devuelve 
un -1. Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona está en su peso 
ideal y la función devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que 
la persona tiene sobrepeso, y la función devuelve un 1.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos para cada objeto, 
deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por debajo de su peso ideal e indicar 
para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas variables(arrays), 
para después calcular un porcentaje de esas 4 personas cuantas están por debajo de su peso, cuantas en su peso ideal 
y cuantos, por encima, y también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. Para esto,
podemos crear unos métodos adicionales.
 */
package guia8ej03;

import Entidad.Personas;
import Service.ServicePersona;

public class Guia8Ej03 {

    public static void main(String[] args) {
        //Definimos la cantidad de personas.
        int cantPersonas = 2;
        //Creamos objeto servicio persona
        ServicePersona persona = new ServicePersona();
        //Creamos vector tipo personas de 4 elementos
        Personas[] personas = new Personas[cantPersonas];
        //Variable que guarda si es mayor de edad del tipo booleana.
        boolean[] mayorDeEdad = new boolean[cantPersonas];
        //Variable de tipo entero que guarda la conclusión del cálculo IMC.
        int[] resultadosIMC = new int[cantPersonas];
        //Creamos personas.
        persona.crearPersona(personas);

        mayorDeEdad = persona.mayorDeEdad(personas);
        resultadosIMC = persona.metodoCalcularIMC(personas);

        //Llamamos método para calcular porcentajes de peso de ideal por debajo, por arriba e ideal.
        porcentajeIMC(resultadosIMC);
        //LLamamos método para calcular porcentaje de mayor de edad
        double porcentaje = porcentajeMayorEdad(mayorDeEdad);
        // Imprimir el resultado
        System.out.println("El porcentaje de mayores de edad es " + porcentaje + "%");

    }

    //Método de porcentaje de mayor de edad
    public static double porcentajeMayorEdad(boolean[] edad) {
        int mayoresDeEdad = 0;
        for (int i = 0; i < edad.length; i++) {
            if (edad[i] == true) {
                mayoresDeEdad++;
            }
        }
        return (double) mayoresDeEdad / edad.length * 100;
    }

    //Método de conclusión de cálculo IMC
    public static void porcentajeIMC(int[] calculoIMC) {
        int sobrepeso = 0;
        int bajopeso = 0;
        int pesoideal = 0;
        for (int i = 0; i < calculoIMC.length; i++) {
            switch (calculoIMC[i]) {
                case 1:
                    sobrepeso++;
                    break;
                case 0:
                    pesoideal++;
                    break;
                case -1:
                    bajopeso++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El porcentaje de personas con sobrepeso es " + (double) sobrepeso / calculoIMC.length * 100 + "%");
        System.out.println("El porcentaje de personas con peso ideal es " + (double) pesoideal / calculoIMC.length * 100 + "%");
        System.out.println("El porcentaje de personas con bajopeso es " + (double) bajopeso / calculoIMC.length * 100 + "%");
    }

}
