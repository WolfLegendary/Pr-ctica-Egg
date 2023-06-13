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
public class Alojamiento_Extrahotelero extends Alojamiento {

    //ATRIBUTOS
    protected Boolean privado;
    protected Integer cantMetros;

    public Alojamiento_Extrahotelero(Boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, Gerente gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public Alojamiento_Extrahotelero() {
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(Integer cantMetros) {
        this.cantMetros = cantMetros;
    }

}
