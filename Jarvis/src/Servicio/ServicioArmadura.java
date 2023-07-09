    /*
    En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y
leer.
    */
package Servicio;

import Entidades.Armadura;
import Entidades.Generador;

/**
 *
 * @author TWL
 */
public class ServicioArmadura {
    
//CREAMOS LA ARMADURA
public void crearArmadura(){
Armadura armadura=new Armadura();
armadura.setColorPrimario("Rojo");
armadura.setColorSecundario("Negro");
armadura.setNivelDeSalud(100);
armadura.setNivelResistencia(100);//Anexar función que calcule según tabla...
Generador generador=new Generador(100);
armadura.setGenerador(generador);

}
}
