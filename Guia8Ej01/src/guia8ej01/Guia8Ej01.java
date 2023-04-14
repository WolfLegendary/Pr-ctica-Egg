/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia8ej01;

import Service.ServiceCuentaBancaria;

/**
 *
 * @author USUARIO
 */
public class Guia8Ej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    ServiceCuentaBancaria cuentaServicio=new ServiceCuentaBancaria();
    
   cuentaServicio.crearCuenta();
   cuentaServicio.ingresarCuenta(100);
   cuentaServicio.retirarCuenta(50);
   cuentaServicio.extraccionRapida();
   cuentaServicio.consultarDatos();
   
   
    
    
    
    
    }
    
}
