package entidades;

import enums.Tipo;

public class Vehiculo {

    public Vehiculo() {
    }

    public Vehiculo(String Marca, Integer modelo, Integer anio, Integer numMotor, Integer chasis, String color, Tipo tipo, Cliente cliente) {
        this.Marca = Marca;
        this.modelo = modelo;
        this.anio = anio;
        this.numMotor = numMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(Integer numMotor) {
        this.numMotor = numMotor;
    }

    public Integer getChasis() {
        return chasis;
    }

    public void setChasis(Integer chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Marca=" + Marca + ", modelo=" + modelo + ", anio=" + anio + ", numMotor=" + numMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

    

    private String Marca;

    private Integer modelo;

    private Integer anio;

    private Integer numMotor;

    private Integer chasis;

    private String color;

    private Tipo tipo;
    
    private Cliente cliente;
}
