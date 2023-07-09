/*
Las armaduras de Stark se encuentran definidas por un color primario y un color secundario.

Se encuentran compuestas de dos propulsores, uno en cada bota; y dos repulsores, uno en cada
guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.

La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
se mide con un número entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell). 

Todas las armaduras poseen un nivel de salud el cual se mide de 0 a 100. 

Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
parte de la armadura.

La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
consola y sintetizador) tienen un consumo de energía asociado.

En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y
leer.
 */
package Entidades;

/**
 *
 * @author TWL
 */
public class Armadura {

    public Armadura() {
    }

    public Armadura(String colorPrimario, String colorSecundario, Integer nivelResistencia, Integer nivelDeSalud, Generador generador, Propulsor[] propulsores, Repulsor[] repulsores, Casco casco) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelDeSalud = nivelDeSalud;
        this.generador = generador;
        this.propulsores = propulsores;
        this.repulsores = repulsores;
        this.casco = casco;
    }

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public Integer getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(Integer nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public Integer getNivelDeSalud() {
        return nivelDeSalud;
    }

    public void setNivelDeSalud(Integer nivelDeSalud) {
        this.nivelDeSalud = nivelDeSalud;
    }

    public Generador getGenerador() {
        return generador;
    }

    public void setGenerador(Generador generador) {
        this.generador = generador;
    }

    public Propulsor[] getPropulsores() {
        return propulsores;
    }

    public void setPropulsores(Propulsor[] propulsores) {
        this.propulsores = propulsores;
    }

    public Repulsor[] getRepulsores() {
        return repulsores;
    }

    public void setRepulsores(Repulsor[] repulsores) {
        this.repulsores = repulsores;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" 
                + colorPrimario + ", colorSecundario=" 
                + colorSecundario + ", nivelResistencia=" 
                + nivelResistencia + ", nivelDeSalud=" 
                + nivelDeSalud + ", generador=" 
                + generador + ", propulsores=" 
                + propulsores + ", repulsores=" 
                + repulsores + ", casco=" 
                + casco + '}';
    }
    
private String colorPrimario;
private String colorSecundario;
private Integer nivelResistencia;
private Integer nivelDeSalud;
private Generador generador;
private Propulsor[] propulsores;
private Repulsor[] repulsores;
private Casco casco;
//Definimos los atributos de una armadura de Stark
}
