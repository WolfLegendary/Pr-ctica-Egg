/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg12.ej01;

import entidades.Animal;
import entidades.Caballo;
import entidades.Gato;
import entidades.Perro;

/**
 *
 * @author The Wolf Legendary
 */
public class Guia12Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal perro1=new Perro("Strich","Carnivoro",15,"Doberman");
        perro1.mostrarAlimento();
        Animal perro2=new Perro("Teddy","Croquetas",10,"Chihuahua");
        perro2.mostrarAlimento();
        Animal gato1=new Gato("Pelusa","Galletas",15,"Siamés");
        gato1.mostrarAlimento();
        Animal caballo1=new Caballo("Spark","Pasto",15,"Fino");
        caballo1.mostrarAlimento();
    }
    
}
