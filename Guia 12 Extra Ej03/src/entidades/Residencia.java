/*
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los
hoteles, estando más orientados a la vida al aire libre y al turista de bajos recursos. Por cada
Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros
cuadrados que ocupa. 

Existen dos tipos de alojamientos extrahoteleros: los Camping y las
Residencias. 

Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños
disponibles y si posee o no un restaurante dentro de las instalaciones. 

Para las residencias se
indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no
campo deportivo. 

Realizar un programa en el que se representen todas las relaciones
descriptas.

Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento.
 */
package entidades;

/**
 *
 * @author The Wolf Legendary
 */
public class Residencia extends Alojamiento_Extrahotelero {

    @Override
    public String toString() {
        return "Residencia {" + "Cant. de habitaciones=" + cantHabitaciones + ", Posee descuento a Gremios=" + descuentoGremios + ", Tiene campo Deportivo=" + campoDeportivo + '}';
    }

    //ATRIBUTOS
    private Integer cantHabitaciones;
    private Boolean descuentoGremios;
    private Boolean campoDeportivo;

    public Residencia() {
    }

    public Residencia(Integer cantHabitaciones, Boolean descuentoGremios, Boolean campoDeportivo, Boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, Gerente gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Boolean getDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(Boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

}
