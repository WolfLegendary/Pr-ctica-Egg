/*
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de
Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas. 

Las características de las distintas categorías son las siguientes:
• Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.

• Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de
Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones.

Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de
acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier
cliente, pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro
será.

El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula:
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor
agregado por gimnasio) + (valor agregado por limosinas).

Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50.
Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Hotel5estrellas extends Hoteles {

    //ATRIBUTOS
    private String nombreRestaurante;
    private Integer capacidadRestaurante;
    private Integer cantSalonesConferencia;
    private Integer cantSuites;
    private Integer cantLimosinas;

    @Override
    public String toString() {
        return "Hotel de 5 estrellas {" + "Precio=" + precioHabitacion + ", Capacidad del Restaurante=" + capacidadRestaurante + ", Cant. Salas de Conferencia=" + cantSalonesConferencia + ", Cant. Suites=" + cantSuites + ", Cant. Limosinas=" + cantLimosinas + '}';
    }

    public Hotel5estrellas() {
    }

    public Hotel5estrellas(String nombreRestaurante, Integer capacidadRestaurante, Integer cantSalonesConferencia, Integer cantSuites, Integer cantLimosinas, Integer cantHabitaciones, Integer numCamas, Integer cantPisos, String nombre, String direccion, String localidad, Gerente gerente) {
        super(cantHabitaciones, numCamas, cantPisos, nombre, direccion, localidad, gerente);
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
        this.cantSalonesConferencia = cantSalonesConferencia;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
        //Llamamos al método para calcular el precio de la habitación de hotel de 4 estrellas
        this.precioHabitacion = calculoPrecioHabitacion();
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public Integer getCantSalonesConferencia() {
        return cantSalonesConferencia;
    }

    public void setCantSalonesConferencia(Integer cantSalonesConferencia) {
        this.cantSalonesConferencia = cantSalonesConferencia;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public int calculoPrecioHabitacion() {
        super.calculoPrecioHabitacion();
        //Valor agregado por capacidad del Restaurante
        if (capacidadRestaurante < 30) {
            precioHabitacion += 10;
        }
        if (capacidadRestaurante >= 30 && capacidadRestaurante <= 50) {
            precioHabitacion += 30;
        }
        if (capacidadRestaurante < 50) {
            precioHabitacion += 50;
        }
        //Valor agregado por Gimnasio N/A en Hotel de 5 estrellas
        //Valor agregado por Limosinas
        precioHabitacion += (cantLimosinas * 15);
        //Calculamos el precio de la habitación y guardamos el valor en el objeto
        return precioHabitacion;
    }
}
