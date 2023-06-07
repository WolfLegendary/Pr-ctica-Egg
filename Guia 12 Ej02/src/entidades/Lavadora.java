/*
A continuación, se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.

Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.

Los métodos que se implementara serán:
• Método get y set del atributo carga.

• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.

• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Lavadora extends Electrodomestico {

    public Lavadora(Integer carga, Integer precio, String color, Character letra, Integer peso) {
        super(precio, color, letra, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }

    private Integer carga;
    
    
    
    /*
    • Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
    */
    public void crearLavadora() {
        super.crearElectrodomestico();//Se rellenan los atributos del padre heredados
        System.out.println("Inserte carga de lavadora.");
        this.carga = leer.nextInt();
    }
/*
    • Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.
    */   
    
    
    
    @Override
    public int precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            precio +=500;
        }
        return precio;
    }
}
