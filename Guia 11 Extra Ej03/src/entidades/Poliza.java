package entidades;

import enums.Covertura;
import java.util.Date;

public class Poliza {

    public Poliza() {
    }

    public Poliza(Integer numPoliza, Date fechaInicio, Date fechaFin, Integer cantidad, String formaPago, Integer montoTotalAseg, Boolean inclGranizo, Integer montoMaxGranizo, Cliente cliente, Vehiculo vehiculo, Covertura covertura) {
        this.numPoliza = numPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cantidad = cantidad;
        this.formaPago = formaPago;
        this.montoTotalAseg = montoTotalAseg;
        this.inclGranizo = inclGranizo;
        this.montoMaxGranizo = montoMaxGranizo;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.covertura = covertura;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Integer getMontoTotalAseg() {
        return montoTotalAseg;
    }

    public void setMontoTotalAseg(Integer montoTotalAseg) {
        this.montoTotalAseg = montoTotalAseg;
    }

    public Boolean getInclGranizo() {
        return inclGranizo;
    }

    public void setInclGranizo(Boolean inclGranizo) {
        this.inclGranizo = inclGranizo;
    }

    public Integer getMontoMaxGranizo() {
        return montoMaxGranizo;
    }

    public void setMontoMaxGranizo(Integer montoMaxGranizo) {
        this.montoMaxGranizo = montoMaxGranizo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Covertura getCovertura() {
        return covertura;
    }

    public void setCovertura(Covertura covertura) {
        this.covertura = covertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "numPoliza=" + numPoliza + ", cantidad=" + cantidad + ", montoMaxGranizo=" + montoMaxGranizo + ", cliente=" + cliente + ", vehiculo=" + vehiculo + ", covertura=" + covertura + '}';
    }

    private Integer numPoliza;

    private Date fechaInicio;

    private Date fechaFin;

    private Integer cantidad;

    private String formaPago;

    private Integer montoTotalAseg;

    private Boolean inclGranizo;

    private Integer montoMaxGranizo;

    private Cliente cliente;

    private Vehiculo vehiculo;

    private Covertura covertura;
}
