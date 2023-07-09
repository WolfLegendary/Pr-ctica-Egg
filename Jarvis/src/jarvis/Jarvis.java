/*
ARMADURA IRON MAN:
J.A.R.V.I.S. es una inteligencia artificial desarrollada por Tony Stark. Está programado para hablar
con voz masculina y acento británico. Actualmente se encarga de todo lo relacionado con la
información doméstica de su casa, desde los sistemas de calefacción y refrigeración hasta los Hot
Rod que Stark tiene en su garage.

Tony Stark quiere adaptar a J.A.R.V.I.S. para que lo asista en el uso de sus armaduras, por lo tanto,
serás el responsable de llevar adelante algunas de estas tareas.

El objetivo de JARVIS es que analice intensivamente toda la información de la armadura y del
entorno y en base a esto tome decisiones inteligentes.

En este trabajo se deberá crear en el proyecto una clase llamada Armadura que modele toda la
información y las acciones que pueden efectuarse con la Armadura de Iron Man. La armadura de
Iron Man es un exoesqueleto mecánico ficticio usado por Tony Stark cuando asume la identidad
de Iron Man. La primera armadura fue creada por Stark y Ho Yinsen, mientras estuvieron
prisioneros.

Las armaduras de Stark se encuentran definidas por un color primario y un color secundario. Se
encuentran compuestas de dos propulsores, uno en cada bota; y dos repulsores, uno en cada
guante (los repulsores se utilizan también como armas). Tony los utiliza en su conjunto para volar.

La armadura tiene un nivel de resistencia, que depende del material con el que está fabricada, y
se mide con un número entero cuya unidad de medida de dureza es Rockwell
(https://es.wikipedia.org/wiki/Dureza_Rockwell). Todas las armaduras poseen un nivel de salud el
cual se mide de 0 a 100. Además, Tony tiene un generador, el cual le sirve para salvarle la vida en
cada instante de tiempo alejando las metrallas de metal de su corazón y también para alimentar
de energía a la armadura. La batería a pesar de estar en el pecho de Tony, es considerada como
parte de la armadura.

La armadura también posee una consola en el casco, a través de la cual JARVIS le escribe
información a Iron Man. En el casco también se encuentra un sintetizador por donde JARVIS
susurra cosas al oído de Tony. Cada dispositivo de la armadura de Iron Man (botas, guantes,
consola y sintetizador) tienen un consumo de energía asociado.

En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y
leer.

• Al caminar la armadura hará un uso básico de las botas y se consumirá la energía
establecida como consumo en la bota por el tiempo en el que se camine.

• Al correr la armadura hará un uso normal de las botas y se consumirá el doble de la
energía establecida como consumo en la bota por el tiempo en el que se corra.

• Al propulsarse la armadura hará un uso intensivo de las botas utilizando el triple de la
energía por el tiempo que dure la propulsión.

• Al volar la armadura hará un uso intensivo de las botas y de los guantes un uso normal
consumiendo el triple de la energía establecida para las botas y el doble para los guantes.

• Al utilizar los guantes como armas el consumo se triplica durante el tiempo del disparo.

• Al utilizar las botas para caminar o correr el consumo es normal durante el tiempo que se
camina o se corra.

• Cada vez que se escribe en la consola o se habla a través del sintetizador se consume lo
establecido en estos dispositivos. Solo se usa en nivel básico.

• Cada vez que se efectúa una acción se llama a los métodos usar del dispositivo se le pasa
el nivel de intensidad y el tiempo. El dispositivo debe retornar la energía consumida y la
armadura deberá informar al generador se ha consumido esa cantidad de energía.

Modele las clases, los atributos y los métodos necesarios para poder obtener un modelo real de la
armadura y del estado de la misma.
 */
package jarvis;

/**
 *
 * @author TWL
 */
public class Jarvis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
