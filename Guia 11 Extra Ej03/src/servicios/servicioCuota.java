/*
Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.

a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.
d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
Debemos realizar el diagrama de clases completo, teniendo en cuenta todos los
requerimientos arriba descriptos. Modelando clases con atributos y sus correspondientes
relaciones.
 */
package servicios;

import entidades.Cliente;
import entidades.Cuota;
import entidades.Poliza;
import entidades.Vehiculo;
import enums.Covertura;
import enums.Tipo;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author The Wolf Legendary
 */
public class servicioCuota {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /*
a.Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
     */
    public Cliente crearCliente(String nombre, String apellido, int documento, String mail, String domicilio, String telefono, ArrayList<Vehiculo> vehiculos, ArrayList<Poliza> polizas) {
        Cliente cliente = new Cliente(nombre, apellido, documento, mail, domicilio, telefono, vehiculos, polizas);
        return cliente;
    }

    public ArrayList<Cliente> fabricaClientes() {
        int cantidad;
        String nombre;
        String apellido;
        int documento;
        String mail;
        String domicilio;
        String telefono;

        ArrayList<Poliza> polizas = null;
        ArrayList<Vehiculo> vehiculos = null;

        ArrayList<Cliente> clientes = new ArrayList();
        System.out.println("Ingrese la cantidad de clientes a fabricar");
        cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            nombre = "Cliente " + (i + 1);
            apellido = "Apellido " + (i + 1);
            Random r = new Random();
            documento = r.nextInt(45000000);
            mail = "email" + (i + 1) + "@hotmail.com";
            domicilio = "domicilio " + (i + 1);
            telefono = "2657" + Integer.toString(r.nextInt(999999));
            clientes.add(crearCliente(nombre, apellido, documento, mail, domicilio, telefono, vehiculos, polizas));
        }
        return clientes;

    }

    public void mostrarClientes(ArrayList<Cliente> clientes) {

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        System.out.println("");

    }

    /*
b. Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).
     */
    public Vehiculo crearVehiculo(String Marca, Integer modelo, Integer anio, Integer numMotor, Integer chasis, String color, Tipo tipo, Cliente cliente) {
        Vehiculo vehiculo = new Vehiculo(Marca, modelo, anio, numMotor, chasis, color, tipo, cliente);
        return vehiculo;
    }

    public ArrayList<Vehiculo> fabricaVehiculos() {
        String Marca;
        int modelo;
        int anio;
        int numMotor;
        int chasis;
        String color;

        Cliente cliente = null;

        Tipo[] tipos = Tipo.values();
        Tipo tipo;
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        System.out.println("Ingrese la cantidad de vehículos a fabricar");
        int cantidad = leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
            Marca = "Marca " + (i + 1);
            color = "Color " + (i + 1);
            Random r = new Random();
            modelo = r.nextInt(2023);
            anio = r.nextInt(2023);
            numMotor = r.nextInt(999);
            chasis = r.nextInt(9999);
            tipo = tipos[r.nextInt(tipos.length)];
            vehiculos.add(crearVehiculo(Marca, modelo, anio, numMotor, chasis, color, tipo, cliente));
        }
        return vehiculos;
    }

    public void mostrarVehiculos(ArrayList<Vehiculo> vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
        }
        System.out.println("");
    }

    /*
c. Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.).
     */
    public Poliza crearPoliza(ArrayList<Cliente> clientes, ArrayList<Vehiculo> vehiculos) {

        boolean statusCliente = false;
        boolean statusVehiculo = false;
        boolean exception=false;

        Poliza poliza = new Poliza();

        int numPoliza = 0;

        Date fechaInicio = null;

        Date fechaFin = null;

        int cantidad = 0;

        String formaPago = null;

        boolean inclGranizo = false;

        int montoMaxGranizo = 0;

        poliza.setNumPoliza(numPoliza);
        poliza.setFechaInicio(fechaInicio);
        poliza.setFechaFin(fechaFin);
        poliza.setCantidad(cantidad);
        poliza.setFormaPago(formaPago);
        poliza.setInclGranizo(inclGranizo);
        poliza.setMontoMaxGranizo(montoMaxGranizo);

        Covertura[] coverturas = Covertura.values();
        Covertura covertura;

        ArrayList<Poliza> polizas = new ArrayList<>();
        ArrayList<Vehiculo> vehiculosCliente = new ArrayList<>();

        System.out.println("Seleccione el cliente al que desea asociar a la poliza: (numero de documento)");
        mostrarClientes(clientes);
        int documento = leer.nextInt();
        System.out.println("Seleccione el vehiculo al desea asociar a la poliza: (numero de motor)");
        mostrarVehiculos(vehiculos);
        int numMotor = leer.nextInt();

        for (Iterator<Vehiculo> iterator = vehiculos.iterator(); iterator.hasNext();) {
            Vehiculo vehiculo = iterator.next();
            if (vehiculo.getNumMotor() == numMotor && vehiculo.getCliente() != null && vehiculo.getCliente().getDocumento() == documento) {
                System.out.println("El vehiculo ya tiene poliza con esa persona.");
                exception=true;
            } else {
                if (vehiculo.getNumMotor() == numMotor && vehiculo.getCliente() != null) {
                    System.out.println("El vehiculo ya tiene poliza con otra personsa.");
                    exception=true;
                } else {
                    if (vehiculo.getNumMotor() == numMotor) {
                        //Comienzan intrucciones para crear la poliza y afectar los atributos cliente y vehículo
                        statusVehiculo = true;
                        poliza.setVehiculo(vehiculo);
                        for (Cliente cliente : clientes) {
                            if (cliente.getDocumento() == documento) {
                                statusCliente = true;
                                vehiculo.setCliente(cliente);
                                poliza.setCliente(cliente);

                                polizas.add(poliza);
                                vehiculosCliente.add(vehiculo);

                                cliente.setPolizas(polizas);
                                cliente.setVehiculos(vehiculos);
                            }
                        }
                    }
                }
            }
        }
        for (Cliente cliente : clientes) {
            if (cliente.getDocumento() == documento) {
                statusCliente = true;
            }
        }
        if (statusCliente && statusVehiculo) {
            System.out.println("El vehículo ha sido asigando al cliente con DNI " + documento + ".");
        }
        if (!statusCliente) {
            System.out.println("El cliente elegido no se encuentra en el listado.");
        }
        if (!statusVehiculo && !exception) {

            System.out.println("El vehículo elegido no se encuentra en el listado.");
        }
        System.out.println("");

        return poliza;
    }

    /*
 d. Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).
     */
    public ArrayList<Cuota> gestionCuotas(ArrayList<Poliza> polizas) {

        int numCuota = 0;

        String formaPago = "Efectivo";

        ArrayList<Cuota> cuotas = new ArrayList<>();

        for (Poliza poliza : polizas) {
            Cuota cuota = new Cuota();
            cuota.setPoliza(poliza);
            numCuota++;
            cuota.setNumCuota(numCuota);
            cuota.setFormaPago(formaPago);
            cuotas.add(cuota);
        }
        
        for (Cuota cuota : cuotas) {
            if (cuota.getPoliza().getCliente()!=null) {
                System.out.println(cuota);
            }
            
        }
      
        System.out.println("");
        return cuotas;

    }
}
