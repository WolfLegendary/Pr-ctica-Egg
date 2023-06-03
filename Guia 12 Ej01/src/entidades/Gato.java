/*
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Gato extends Animal{
    public Gato(String nombre, String alimento, Integer edad, String raza){
    super(nombre, alimento, edad, raza);
    }
}
