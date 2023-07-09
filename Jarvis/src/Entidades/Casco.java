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
public class Casco {

    public Casco() {
    }

    public Casco(Consola consola, Sintetizador sintetizador) {
        this.consola = consola;
        this.sintetizador = sintetizador;
    }

    public Consola getConsola() {
        return consola;
    }

    public void setConsola(Consola consola) {
        this.consola = consola;
    }

    public Sintetizador getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(Sintetizador sintetizador) {
        this.sintetizador = sintetizador;
    }
    
    private Consola consola;
    private Sintetizador sintetizador;
    
}
