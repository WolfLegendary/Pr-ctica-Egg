package entidades;



import java.util.Date;

public class Cuota {

    public Cuota() {
    }

    public Cuota(Integer numCuota, Integer montoTotalCuota, Boolean statusPago, Date fechaVencimiento, String formaPago, Poliza poliza) {
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.statusPago = statusPago;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.poliza = poliza;
    }

    public Integer getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(Integer numCuota) {
        this.numCuota = numCuota;
    }

    public Integer getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(Integer montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public Boolean getStatusPago() {
        return statusPago;
    }

    public void setStatusPago(Boolean statusPago) {
        this.statusPago = statusPago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numCuota=" + numCuota + ", montoTotalCuota=" + montoTotalCuota + ", statusPago=" + statusPago + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + ", poliza=" + poliza + '}';
    }

    

    private Integer numCuota;

    private Integer montoTotalCuota;

    private Boolean statusPago;

    private Date fechaVencimiento;

    private String formaPago;

    private Poliza poliza;
}
