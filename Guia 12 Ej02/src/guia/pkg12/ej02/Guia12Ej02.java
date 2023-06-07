/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.
 */
package guia.pkg12.ej02;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;


/**
 *
 * @author The Wolf Legendary
 */
public class Guia12Ej02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*Ejercicio 2
        Lavadora lavadora=new Lavadora();
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println("El precio de la lavadora es "+lavadora.getPrecio());
        
        Televisor televisor=new Televisor();
        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println("El precio de la lavadora es "+televisor.getPrecio());
     */
     
      /*
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
        */
        int suma=0;
        ArrayList <Electrodomestico> electrodomestico=new ArrayList<>();
        
        for (int i = 0; i < 2; i++) {
            Lavadora lavadora = new Lavadora(1,1000,"",'x',1);
            //lavadora.crearLavadora();
            electrodomestico.add(lavadora);
        }
        for (int i = 0; i < 2; i++) {
            Televisor televisor = new Televisor(50, true, 1000,"", 'x', 1);
            //televisor.crearTelevisor();
            electrodomestico.add(televisor);
        }
        
        System.out.println("Recorremos el array mostrando el precio de c/electrodoméstico.");
        System.out.println("");
        for (Electrodomestico electro : electrodomestico) {
            suma+=electro.precioFinal();
            System.out.println(electro.getPrecio()+"$");
            System.out.println("");
        }

         System.out.println("La suma de todos los electrodomésticos es: "+suma+"$");
        
        
    }
    
}
