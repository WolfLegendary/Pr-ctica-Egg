/*
En un puerto se alquilan amarres para barcos de distinto tipo. Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.
Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.

Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).

En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.

Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases y los
métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el
precio final de su alquiler.
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Alquiler {

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, String fechaAlquilerString, String fechaDevolucionString, Integer posicionAmarre, Barco barco, Integer precioFinal) {
        this.cliente = cliente;
        this.fechaAlquilerString = fechaAlquilerString;
        this.fechaDevolucionString = fechaDevolucionString;
        this.posicionAmarre = posicionAmarre;
        this.barco = barco;
        this.precioFinal = precioFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFechaAlquilerString() {
        return fechaAlquilerString;
    }

    public void setFechaAlquilerString(String fechaAlquilerString) {
        this.fechaAlquilerString = fechaAlquilerString;
    }

    public String getFechaDevolucionString() {
        return fechaDevolucionString;
    }

    public void setFechaDevolucionString(String fechaDevolucionString) {
        this.fechaDevolucionString = fechaDevolucionString;
    }

    public Integer getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(Integer posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public Integer getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(Integer precioFinal) {
        this.precioFinal = precioFinal;
    }

  
    private Cliente cliente;
    private String fechaAlquilerString;
    private String fechaDevolucionString;
    private Integer posicionAmarre;
    private Barco barco;
    private Integer precioFinal;
    
    /*
    Para cada Alquiler se guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.
    */
    
}
