/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aca2parte1;

import java.util.*;
import modelo.Cliente;
import modelo.Habitacion;
import modelo.Hotel;
import modelo.RegistroHuespedes;
import modelo.Pago;
import modelo.Reserva;
import modelo.Validacion;
import vista.Vista;

/**
 *
 * @author leonel.borja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // se instancia la clase validar
        Validacion validacion = new Validacion();
        // se inicializan las variables a utilizar 
        int opcion, numeroRepeticiones;
        // se instancia la clase Hotel y se obtiene el objeto hotel 
        Hotel hotel = new Hotel();
        // se crea una lista (hoteles) donde se almacenaran el hotel creado
        List<Hotel> hoteles = new ArrayList<>();
        // se cargan los hoteles en la lista con el m,etodo cargar 
        hoteles = hotel.cargar();
        // se asigna el hotel cargado al objeto hotel iterando la lista 
        for (Hotel hotelCargado : hoteles) {
            hotel = hotelCargado;
        }
        // se instancia la clase Scanner
        Scanner entrada = new Scanner(System.in);
        //se crean las listas que se necesitanm de cada objeto
        List<Habitacion> habitaciones = new ArrayList<>();
        List<Cliente> clientes = new ArrayList<>();
        List<Reserva> reservas = new ArrayList<>();
        List<RegistroHuespedes> huespedesRegistrados = new ArrayList<>();
        List<Pago> pagosRegistrados = new ArrayList<>();
        //se intancia la clase vista  la cual nos permitira mostrar por consola el menu
        Vista v = new Vista();
        // se crea un ciclo do- while el cual nos garantice que por lo menos el proceso de menu se ejecutara 1 vez
        do {
            // se invoca el metodo menu
            v.menu();
            // asigana la variableobcion el cual recibe de un 
            //metodo de la clace validacion que controla quie solo se pueda ingresar un numero entero
            opcion = validacion.validarEntero();
            // se crea el metodo switch-case el cual recibe la variable opcion y valida el caso que crresponde(remplaza las validaciones if) 
            switch (opcion) {
                // dependiendo el caso ejecuta los mensajes estaticos necesarios 
                case 1:
                    System.out.println("****************************");
                    System.out.println("Bienvenidos al Hotel " + hotel.getNombreHotel());
                    System.out.println("****************************" + "\n");
                    System.out.println("Indique el numero de Habitaciones que requiere crear");
                    // se asigna el numero de repeticiones controlando que solo se ingrese un valor numerico
                    numeroRepeticiones = validacion.validar();
                    // se itera pidiendo alusuario que ingrese los valores a guardar del objeto
                    for (int i = 1; i <= numeroRepeticiones; i++) {
                        Habitacion habitacion = new Habitacion();
                        System.out.println("Ingrese el codigo de la Habitacion ");
                        habitacion.setCodigo(entrada.nextLine());
                        System.out.println("ingrese las caracteristicas de la Habitacion");
                        habitacion.setCaracteristicas(entrada.nextLine());
                        System.out.println("Ingrese el tipo de Habitacion");
                        habitacion.setTipoHabitacion(entrada.nextLine());
                        System.out.println("Ingrese el Numero de la Habitacion ");
                        habitacion.setNumeroHabitacion(entrada.nextLine());
                        System.out.println("ingrese El precio de la Habitacion");
                        habitacion.setPrecio(entrada.nextLine());
                        System.out.println("Ingrese el piso de la Habitacion");
                        habitacion.setNumeroPiso(entrada.nextLine());
                        // se gyuarda el objeto a la lista previamente creada
                        habitaciones.add(habitacion);

                    }
                    // se envian mensajes estaticos decorativos 
                    System.out.println("****************************");
                    System.out.println("las habitaciones creadas son: ");
                    System.out.println("****************************");
                    // con el for-each se itera la lista y se imprime los datos del objeto con el metodo toString
                    for (Habitacion habitacion : habitaciones) {
                        System.out.println(habitacion.toString());
                        System.out.println("****************************");
                    }
                    break;
                case 2:
                    System.out.println("****************************");
                    System.out.println("Bienvenidos al Hotel " + hotel.getNombreHotel());
                    System.out.println("****************************" + "\n");
                    System.out.println("Indique el numero de Clientes que requiere crear");
                    numeroRepeticiones = validacion.validar();
                    for (int i = 1; i <= numeroRepeticiones; i++) {
                        Cliente cliente = new Cliente();
                        System.out.println("Ingrese el codigo del Cliente ");
                        cliente.setCodigoCliente(entrada.nextLine());
                        System.out.println("Ingrese el nombre del Cliente");
                        cliente.setNombre(entrada.nextLine());
                        System.out.println("Ingrese el apellido del Cliente");
                        cliente.setApellido(entrada.nextLine());
                        System.out.println("Ingrese la dirección del Cliente");
                        cliente.setDireccion(entrada.nextLine());
                        clientes.add(cliente);
                    }

                    System.out.println("****************************");
                    System.out.println("Los clientes creados son: ");
                    System.out.println("****************************");

                    for (Cliente cliente : clientes) {
                        System.out.println(cliente.toString());
                        System.out.println("****************************");
                    }
                    break;
                case 3:
                    System.out.println("****************************");
                    System.out.println("Bienvenidos al Hotel " + hotel.getNombreHotel());
                    System.out.println("****************************" + "\n");
                    System.out.println("Indique el numero de Revervas que requiere crear");
                    numeroRepeticiones = validacion.validar();
                    for (int i = 1; i <= numeroRepeticiones; i++) {
                        Reserva reserva = new Reserva();
                        System.out.println("Ingrese el código del Huésped ");
                        reserva.setCodigoHuesped(entrada.nextLine());
                        System.out.println("Ingrese el código de la Reserva ");
                        reserva.setCodigoReserva(entrada.nextLine());
                        System.out.println("Ingrese el código de la Habitación ");
                        reserva.setCodigoHabitacion(entrada.nextLine());
                        System.out.println("Ingrese el tipo de Habitación ");
                        reserva.setTipoHabitacion(entrada.nextLine());
                        System.out.println("Ingrese la fecha de ingreso (formato dd/mm/yyyy) ");
                        reserva.setFechaIngreso(entrada.nextLine());
                        System.out.println("Ingrese la fecha de salida (formato dd/mm/yyyy) ");
                        reserva.setFechaSalida(entrada.nextLine());
                        System.out.println("Ingrese el número de noches reservadas ");
                        reserva.setNochesReservadas(entrada.nextLine());
                        System.out.println("Ingrese la cantidad de personas ");
                        reserva.setCantidadPersonas(entrada.nextLine());
                        reservas.add(reserva);
                    }

                    System.out.println("****************************");
                    System.out.println("Las reservas creadas son: ");
                    System.out.println("****************************");

                    for (Reserva reserva : reservas) {
                        System.out.println(reserva.toString());
                        System.out.println("****************************");
                    }
                    break;
                case 4:
                    System.out.println("****************************");
                    System.out.println("Bienvenidos al Hotel " + hotel.getNombreHotel());
                    System.out.println("****************************" + "\n");
                    System.out.println("Indique el numero de Huespedes que requiere registrar");
                    numeroRepeticiones = validacion.validar();
                    for (int i = 1; i <= numeroRepeticiones; i++) {
                        RegistroHuespedes registroHuespedes = new RegistroHuespedes();
                        System.out.println("Ingrese el código de la Reserva ");
                        registroHuespedes.setCodigoReserva(entrada.nextLine());
                        System.out.println("Ingrese el código del Huésped ");
                        registroHuespedes.setCodigoHuesped(entrada.nextLine());
                        System.out.println("Ingrese la cantidad de personas ");
                        registroHuespedes.setCantidadPersonas(entrada.nextLine());
                        System.out.println("Ingrese el tipo de Habitación ");
                        registroHuespedes.setTipoHabitacion(entrada.nextLine());
                        System.out.println("Ingrese la fecha de llegada (formato dd/mm/yyyy) ");
                        registroHuespedes.setFechaLlegada(entrada.nextLine());
                        System.out.println("Ingrese la fecha de salida (formato dd/mm/yyyy) ");
                        registroHuespedes.setFechaSalida(entrada.nextLine());
                        huespedesRegistrados.add(registroHuespedes);
                    }

                    System.out.println("****************************");
                    System.out.println("Los Huspedes registrados son: ");
                    System.out.println("****************************");

                    for (RegistroHuespedes registroHuespedes : huespedesRegistrados) {
                        System.out.println(registroHuespedes.toString());
                        System.out.println("****************************");
                    }
                    break;
                case 5:
                    System.out.println("****************************");
                    System.out.println("Bienvenidos al Hotel " + hotel.getNombreHotel());
                    System.out.println("****************************" + "\n");
                    System.out.println("Indique el numero de Pagos que requiere registrar");
                    numeroRepeticiones = validacion.validar();
                    for (int i = 1; i <= numeroRepeticiones; i++) {

                        Pago pago = new Pago();
                        System.out.println("Ingrese el número del ticket de pago ");
                        pago.setNumeroTicketPago(validacion.validar());
                        System.out.println("Ingrese el código de la Reserva ");
                        pago.setCodigoReserva(entrada.nextLine());
                        System.out.println("Ingrese el código del Huésped ");
                        pago.setCodigoHuesped(entrada.nextLine());
                        System.out.println("Ingrese el nombre del Cliente ");
                        pago.setNombreCliente(entrada.nextLine());
                        System.out.println("Ingrese el apellido del Cliente ");
                        pago.setApellidoCliente(entrada.nextLine());
                        System.out.println("Ingrese la dirección del Cliente ");
                        pago.setDireccionCliente(entrada.nextLine());
                        System.out.println("Ingrese el Telefono del Cliente ");
                        pago.setTelefonoCliente(entrada.nextLine());
                        System.out.println("Ingrese el concepto ");
                        pago.setConcepto(entrada.nextLine());
                        System.out.println("Ingrese el valor por noche ");
                        pago.setValorNoche(validacion.validarDouble());
                        System.out.println("Ingrese el número de noches reservadas (deben ser mayor a 0)");
                        pago.setNochesReservadas(validacion.validar());
                        pago.setSubtotal(pago.getValorNoche() * pago.getNochesReservadas());
                        pago.setCostoIva(pago.getSubtotal() * pago.getValorIva());
                        pago.setCostoTotal(pago.getSubtotal() + pago.getCostoIva());
                        pagosRegistrados.add(pago);
                    }

                    System.out.println("****************************");
                    System.out.println("Los Pagos registrados son: ");
                    System.out.println("****************************");

                    for (Pago pago : pagosRegistrados) {

                        System.out.println(pago.toString());
                        System.out.println("****************************");
                    }
                    break;
                // se dejo un caso de control por si se presiona una opcion fuewra del menu y se mantiene en el ciclo hasta que no ingrese una opcion valida y se ejecuten plos pasos 
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion != 5);
    }

}
