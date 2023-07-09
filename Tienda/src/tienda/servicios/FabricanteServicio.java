/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.Collection;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author The Wolf Legendary
 */
public class FabricanteServicio {
    
     private FabricanteDAO dao;

    public FabricanteServicio() {
        this.dao = new FabricanteDAO();
    }
    
    
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
      
    public void imprimirProductos() throws Exception {
        try {
            //Listamos los fabricantes
            Collection<Fabricante> fabricantes = dao.listarProductos();
            //Imprimimos los productos
            if (fabricantes.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                System.out.println("Código   Nombre");
                for (Fabricante f : fabricantes) {
                    System.out.println(f.toString());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    public void isertarFabricanteNuevo() throws Exception {
        try {
            //Listamos los fabricantes y pedimos los datos del fabricante nuevo a insertar.
            int codigo;
            String nombre = null;
            System.out.println("Inserte el código y nombre del fabricante.");
            codigo = leer.nextInt();
            leer.nextLine(); // Consumir el carácter de nueva línea pendiente
            nombre = leer.nextLine();
            //Validamos nombre
            if (nombre.trim().isEmpty()) {
                throw new Exception("Debe ingresar un nombre válido para el fabricante.");
            }
            dao.insertarFabricanteNuevo(codigo, nombre);
        } catch (Exception e) {
            throw e;
        } finally {
            imprimirProductos();
        }
    }


}
