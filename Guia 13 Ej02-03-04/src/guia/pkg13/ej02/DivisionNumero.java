/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
 */
package guia.pkg13.ej02;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;

/**
 *
 * @author The Wolf Legendary
 */
public class DivisionNumero {

    public void divisionNumero(String a, String b) throws ExcepcionDivisionNumero {
        try {
            int numB = parseInt(b);
/*          if (numB == 0) {
                throw new ExcepcionDivisionNumero("¡El denominador no puede ser cero!");
           }*/

            int numA = parseInt(a);

            System.out.println("El resultado de la división es " + (numA / numB));
/*        } catch (ExcepcionDivisionNumero e) {//Atrapamos la excepcion y lanzamos el mensaje contenido en ella
            throw e;*/
        } catch (InputMismatchException e) {
            throw new ExcepcionDivisionNumero("Error de ingreso por teclado.");
        } catch (NumberFormatException e) {
            throw new ExcepcionDivisionNumero("La cadena no puede convertirse a entero.");
        } catch (ArithmeticException e) {
            throw new ExcepcionDivisionNumero("¡El denominador no puede ser cero!");
        } catch (Exception e) {
            throw new ExcepcionDivisionNumero("Error del sistema.");
        }

    }

}
