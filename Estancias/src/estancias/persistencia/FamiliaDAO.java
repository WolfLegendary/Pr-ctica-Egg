package estancias.persistencia;

import estancias.entidades.Familia;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author TWL
 */
public final class FamiliaDAO extends DAO {

    public Collection<Familia> listarFamiliasCond1() throws Exception {
        try {//Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años
            String sql = "SELECT *\n"
                    + "FROM familias\n"
                    + "WHERE num_hijos >= 3 AND edad_maxima < 10;";
            consultarBase(sql);
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                Familia familia = new Familia();
                //Llenamos los datos desde la base de datos
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public Collection<Familia> listarFamiliasCond3() throws Exception {
        try {//Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
            String sql = "SELECT *\n"
                    + "FROM familias\n"
                    + "WHERE email LIKE '%@hotmail.%';";
            consultarBase(sql);
            Collection<Familia> familias = new ArrayList();
            while (resultado.next()) {
                Familia familia = new Familia();
                //Llenamos los datos desde la base de datos
                familia.setId(resultado.getInt(1));
                familia.setNombre(resultado.getString(2));
                familia.setEdad_minima(resultado.getInt(3));
                familia.setEdad_maxima(resultado.getInt(4));
                familia.setNum_hijos(resultado.getInt(5));
                familia.setEmail(resultado.getString(6));
                familias.add(familia);
            }
            desconectarBase();
            return familias;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }

}
/*
a) Listar aquellas familias que tienen al menos 3 hijos, y con edad máxima inferior a 10 años.
b) Buscar y listar las casas disponibles para el periodo comprendido entre el 1 de agosto de
2020 y el 31 de agosto de 2020 en Reino Unido.
c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail.
d) Consulta la BD para que te devuelva aquellas casas disponibles a partir de una fecha dada
y un número de días específico.
e) Listar los datos de todos los clientes que en algún momento realizaron una estancia y la
descripción de la casa donde la realizaron.
f) Listar todas las estancias que han sido reservadas por un cliente, mostrar el nombre, país y
ciudad del cliente y además la información de la casa que reservó. La que reemplazaría a
la anterior
g) Debido a la devaluación de la libra esterlina con respecto al euro se desea incrementar el
precio por día en un 5% de todas las casas del Reino Unido. Mostar los precios
actualizados.
h) Obtener el número de casas que existen para cada uno de los países diferentes.
i) Busca y listar aquellas casas del Reino Unido de las que se ha dicho de ellas (comentarios)
que están ‘limpias’.
j) Insertar nuevos datos en la tabla estancias verificando la disponibilidad de las fechas.
*/