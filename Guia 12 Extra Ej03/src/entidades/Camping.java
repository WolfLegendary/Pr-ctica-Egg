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
public class Camping extends Alojamiento_Extrahotelero {

    @Override
    public String toString() {
        return "Camping {" + "Capacidad máx. de carpas=" + capacidadMaxCarpas + ", Cant. de Baños=" + cantBañosDisp + ", Posee restaurante=" + restaurante + '}';
    }

    //ATRIBUTOS
    private Integer capacidadMaxCarpas;
    private Integer cantBañosDisp;
    private Boolean restaurante;

    public Camping(Integer capacidadMaxCarpas, Integer cantBañosDisp, Boolean restaurante, Boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, Gerente gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.capacidadMaxCarpas = capacidadMaxCarpas;
        this.cantBañosDisp = cantBañosDisp;
        this.restaurante = restaurante;
    }

    public Camping() {
    }

    public Integer getCapacidadMaxCarpas() {
        return capacidadMaxCarpas;
    }

    public void setCapacidadMaxCarpas(Integer capacidadMaxCarpas) {
        this.capacidadMaxCarpas = capacidadMaxCarpas;
    }

    public Integer getCantBañosDisp() {
        return cantBañosDisp;
    }

    public void setCantBañosDisp(Integer cantBañosDisp) {
        this.cantBañosDisp = cantBañosDisp;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

}
