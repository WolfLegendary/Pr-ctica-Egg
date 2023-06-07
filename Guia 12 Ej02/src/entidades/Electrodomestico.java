/*
Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.

• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.

• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

***** Ponemos estos métodos en Servicio *****
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.

• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class Electrodomestico {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, String color, Character letra, Integer peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.letra = comprobarConsumoEnergetico(letra);
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Character getLetra() {
        return letra;
    }

    public void setLetra(Character letra) {
        this.letra = letra;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letra=" + letra + ", peso=" + peso + '}';
    }
    protected Integer precio;
    protected String color;
    protected Character letra; //letras entre A y F
    protected Integer peso;

    //Atributos
    //Métodos
    /*
    • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
     */
    private Character comprobarConsumoEnergetico(Character letra) {
        if (letra.toString().equalsIgnoreCase("a") || letra.toString().equalsIgnoreCase("b") || letra.toString().equalsIgnoreCase("c") || letra.toString().equalsIgnoreCase("d") || letra.toString().equalsIgnoreCase("e") || letra.toString().equalsIgnoreCase("f")) {
            return letra;
        } else {
            letra = 'F';
            return letra;
        }
    }

    /*
    • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
     */
    private String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            color = "blanco";
            return color;
        }
    }

    /*
    • Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
     */
    public void crearElectrodomestico() {
        this.precio = 1000;
        System.out.println("Ingrese color, letra de consumo energético y peso del electrodoméstico.");
        //Leemos y posteriormente comprobamos el color y el consumo eléctrico en la entidad
        color = comprobarColor(leer.next());
        letra = comprobarConsumoEnergetico(leer.next().charAt(0));
        peso = leer.nextInt();
    }

    /*
    • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:
LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
     */
    public int precioFinal() {
        switch (letra.toString().toLowerCase()) {
            case "a":
                precio +=1000;
                break;
            case "b":
                precio +=800;
                break;
            case "c":
                precio +=600;
                break;
            case "d":
                precio +=500;
                break;
            case "e":
                precio +=300;
                break;
            case "f":
                precio +=100;
                break;
            default:
                System.out.println("Fallo en el programa con respecto al consumo.");
                break;
        }
        if (1 <= peso && peso <= 19) {
            precio +=100;
        }
        if (20 <= peso && peso <= 49) {
            precio +=500;
        }
        if (50 <= peso && peso <= 79) {
            precio +=800;
        }
        if (peso > 79) {
            precio +=1000;
        }
        return precio;
    }
}
