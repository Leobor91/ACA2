/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonel.borja
 */
public class Conexion {

    private static final String ARCHIVO_HOTELES_CSV = "hoteles.csv";
    private static final String ARCHIVO_HABITACIONES_CSV = "habitaciones.csv";
    private static final String ARCHIVO_CLIENTES_CSV = "clientes.csv";
    private static final String ARCHIVO_RESERVAS_CSV = "reservas.csv";
    private static final String ARCHIVO_PAGOS_CSV = "pagos.csv";
    private static final String ARCHIVO_REGISTRO_HUESPEDES_CSV = "registro_huespedes.csv";

    // Método para guardar hoteles en un archivo CSV
    public void guardarHotelesCSV(List<Hotel> hoteles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_HOTELES_CSV))) {
            // Escribir encabezados CSV
            writer.write("NombreHotel,NIT,PaginaWeb,Correo,Ciudad,Sucursal,Direccion,Telefono,Capacidad");
            writer.newLine();

            // Escribir datos de hoteles
            for (Hotel hotel : hoteles) {
                writer.write(
                        hotel.getNombreHotel() + ","
                        + hotel.getNit() + ","
                        + hotel.getPaginaWeb() + ","
                        + hotel.getCorreo() + ","
                        + hotel.getCiudad() + ","
                        + hotel.getSucursal() + ","
                        + hotel.getDireccion() + ","
                        + hotel.getTelefono() + ","
                        + hotel.getCapacidad()
                );
                writer.newLine();
            }

            System.out.println("Hoteles guardados en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar hoteles desde un archivo CSV
    public List<Hotel> cargarHotelesCSV() {
        List<Hotel> hoteles = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_HOTELES_CSV))) {
            // Leer la primera línea que contiene los encabezados (opcional)
            String linea;
            reader.readLine();

            // Leer el resto de las líneas con datos de hoteles
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 9) {
                    // Suponiendo que la estructura es "NombreHotel,NIT,PaginaWeb,Correo,Ciudad,Sucursal,Direccion,Telefono,Capacidad"
                    String nombreHotel = datos[0];
                    String nit = datos[1];
                    String paginaWeb = datos[2];
                    String correo = datos[3];
                    String ciudad = datos[4];
                    String sucursal = datos[5];
                    String direccion = datos[6];
                    String telefono = datos[7];
                    String capacidad = datos[8];

                    // Crear objeto Hotel y agregarlo a la lista
                    Hotel hotel = new Hotel(nombreHotel, nit, paginaWeb, correo, ciudad, sucursal, direccion, telefono, capacidad);
                    hoteles.add(hotel);
                }
            }

            // System.out.println("Hoteles cargados desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hoteles;
    }

    // Método para guardar clientes en un archivo CSV
    public void guardarClientesCSV(List<Cliente> clientes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_CLIENTES_CSV))) {
            // Escribir encabezados CSV
            writer.write("CodigoCliente,Nombre,Apellido,Direccion");
            writer.newLine();

            // Escribir datos de clientes
            for (Cliente cliente : clientes) {
                writer.write(
                        cliente.getCodigoCliente() + ","
                        + cliente.getNombre() + ","
                        + cliente.getApellido() + ","
                        + cliente.getDireccion()
                );
                writer.newLine();
            }

            System.out.println("Clientes guardados en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar clientes desde un archivo CSV
    public List<Cliente> cargarClientesCSV() {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_CLIENTES_CSV))) {
            // Leer la primera línea que contiene los encabezados (opcional)
            String linea;
            reader.readLine();

            // Leer el resto de las líneas con datos de clientes
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 4) {
                    // Suponiendo que la estructura es "CodigoCliente,Nombre,Apellido,Direccion"
                    String codigoCliente = datos[0];
                    String nombre = datos[1];
                    String apellido = datos[2];
                    String direccion = datos[3];

                    // Crear objeto Cliente y agregarlo a la lista
                    Cliente cliente = new Cliente(codigoCliente, nombre, apellido, direccion);
                    clientes.add(cliente);
                }
            }

            //System.out.println("Clientes cargados desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }

    // Método para guardar reservas en un archivo CSV
    public void guardarReservasCSV(List<Reserva> reservas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_RESERVAS_CSV))) {
            // Escribir encabezados CSV
            writer.write("CodigoHuesped,CodigoReserva,CodigoHabitacion,TipoHabitacion,FechaIngreso,FechaSalida,NochesReservadas,CantidadPersonas");
            writer.newLine();

            // Escribir datos de reservas
            for (Reserva reserva : reservas) {
                writer.write(
                        reserva.getCodigoHuesped() + ","
                        + reserva.getCodigoReserva() + ","
                        + reserva.getCodigoHabitacion() + ","
                        + reserva.getTipoHabitacion() + ","
                        + reserva.getFechaIngreso() + ","
                        + reserva.getFechaSalida() + ","
                        + reserva.getNochesReservadas() + ","
                        + reserva.getCantidadPersonas()
                );
                writer.newLine();
            }

            //System.out.println("Reservas guardadas en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar reservas desde un archivo CSV
    public List<Reserva> cargarReservasCSV() {
        List<Reserva> reservas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_RESERVAS_CSV))) {
            // Leer la primera línea que contiene los encabezados (opcional)
            String linea;
            reader.readLine();

            // Leer el resto de las líneas con datos de reservas
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 8) {
                    // Suponiendo que la estructura es "CodigoHuesped,CodigoReserva,CodigoHabitacion,TipoHabitacion,FechaIngreso,FechaSalida,NochesReservadas,CantidadPersonas"
                    String codigoHuesped = datos[0];
                    String codigoReserva = datos[1];
                    String codigoHabitacion = datos[2];
                    String tipoHabitacion = datos[3];
                    String fechaIngreso = datos[4];
                    String fechaSalida = datos[5];
                    String nochesReservadas = datos[6];
                    String cantidadPersonas = datos[7];

                    // Crear objeto Reserva y agregarlo a la lista
                    Reserva reserva = new Reserva(codigoHuesped, codigoReserva, codigoHabitacion, tipoHabitacion, fechaIngreso, fechaSalida, nochesReservadas, cantidadPersonas);
                    reservas.add(reserva);
                }
            }

            // System.out.println("Reservas cargadas desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return reservas;
    }

    // Método para guardar pagos en un archivo CSV
    public void guardarPagosCSV(List<Pago> pagos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_PAGOS_CSV))) {
            // Escribir encabezados CSV
            writer.write("NumeroTicketPago,CodigoReserva,CodigoHuesped,NombreCliente,ApellidoCliente,DireccionCliente,TelefonoCliente,Concepto,ValorNoche,NochesReservadas,CostoTotal,Subtotal,CostoIva,ValorIva");
            writer.newLine();

            // Escribir datos de pagos
            for (Pago pago : pagos) {
                writer.write(
                        pago.getNumeroTicketPago() + ","
                        + pago.getCodigoReserva() + ","
                        + pago.getCodigoHuesped() + ","
                        + pago.getNombreCliente() + ","
                        + pago.getApellidoCliente() + ","
                        + pago.getDireccionCliente() + ","
                        + pago.getTelefonoCliente() + ","
                        + pago.getConcepto() + ","
                        + pago.getValorNoche() + ","
                        + pago.getNochesReservadas() + ","
                        + pago.getCostoTotal() + ","
                        + pago.getSubtotal() + ","
                        + pago.getCostoIva() + ","
                        + pago.getValorIva()
                );
                writer.newLine();
            }

            //System.out.println("Pagos guardados en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar pagos desde un archivo CSV
    public List<Pago> cargarPagosCSV() {
        List<Pago> pagos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_PAGOS_CSV))) {
            // Leer la primera línea que contiene los encabezados (opcional)
            String linea;
            reader.readLine();

            // Leer el resto de las líneas con datos de pagos
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 14) {
                    // Suponiendo que la estructura es "NumeroTicketPago,CodigoReserva,CodigoHuesped,NombreCliente,ApellidoCliente,DireccionCliente,TelefonoCliente,Concepto,ValorNoche,NochesReservadas,CostoTotal,Subtotal,CostoIva,ValorIva"
                    int numeroTicketPago = Integer.parseInt(datos[0]);
                    String codigoReserva = datos[1];
                    String codigoHuesped = datos[2];
                    String nombreCliente = datos[3];
                    String apellidoCliente = datos[4];
                    String direccionCliente = datos[5];
                    String telefonoCliente = datos[6];
                    String concepto = datos[7];
                    double valorNoche = Double.parseDouble(datos[8]);
                    int nochesReservadas = Integer.parseInt(datos[9]);
                    double costoTotal = Double.parseDouble(datos[10]);
                    double subtotal = Double.parseDouble(datos[11]);
                    double costoIva = Double.parseDouble(datos[12]);

                    // Crear objeto Pago y agregarlo a la lista
                    Pago pago = new Pago(numeroTicketPago, codigoReserva, codigoHuesped, nombreCliente, apellidoCliente, direccionCliente, telefonoCliente, concepto, valorNoche, nochesReservadas, costoTotal, subtotal, costoIva);
                    pagos.add(pago);
                }
            }

            //System.out.println("Pagos cargados desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pagos;
    }

    public void guardarRegistroHuespedesCSV(List<RegistroHuespedes> registrosHuespedes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_REGISTRO_HUESPEDES_CSV))) {
            // Escribir encabezados CSV
            writer.write("CodigoReserva,CodigoHuesped,CantidadPersonas,TipoHabitacion,FechaLlegada,FechaSalida");
            writer.newLine();

            // Escribir datos de registros de huéspedes
            for (RegistroHuespedes registro : registrosHuespedes) {
                writer.write(
                        registro.getCodigoReserva() + ","
                        + registro.getCodigoHuesped() + ","
                        + registro.getCantidadPersonas() + ","
                        + registro.getTipoHabitacion() + ","
                        + registro.getFechaLlegada() + ","
                        + registro.getFechaSalida()
                );
                writer.newLine();
            }

            System.out.println("Registros de huéspedes guardados en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar registros de huéspedes desde un archivo CSV
    public List<RegistroHuespedes> cargarRegistroHuespedesCSV() {
        List<RegistroHuespedes> registrosHuespedes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_REGISTRO_HUESPEDES_CSV))) {
            // Leer la primera línea que contiene los encabezados (opcional)
            String linea;
            reader.readLine();

            // Leer el resto de las líneas con datos de registros de huéspedes
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 6) {
                    // Suponiendo que la estructura es "CodigoReserva,CodigoHuesped,CantidadPersonas,TipoHabitacion,FechaLlegada,FechaSalida"
                    String codigoReserva = datos[0];
                    String codigoHuesped = datos[1];
                    String cantidadPersonas = datos[2];
                    String tipoHabitacion = datos[3];
                    String fechaLlegada = datos[4];
                    String fechaSalida = datos[5];

                    // Crear objeto RegistroHuespedes y agregarlo a la lista
                    RegistroHuespedes registro = new RegistroHuespedes(codigoReserva, codigoHuesped, cantidadPersonas, tipoHabitacion, fechaLlegada, fechaSalida);
                    registrosHuespedes.add(registro);
                }
            }

            //System.out.println("Registros de huéspedes cargados desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return registrosHuespedes;
    }

    // Método para guardar habitaciones en un archivo CSV
    public void guardarHabitacionesCSV(List<Habitacion> habitaciones) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_HABITACIONES_CSV))) {
            // Escribir encabezados CSV
            writer.write("Codigo;Caracteristicas;TipoHabitacion;NumeroHabitacion;Precio;NumeroPiso");
            writer.newLine();

            // Escribir datos de habitaciones
            for (Habitacion habitacion : habitaciones) {
                writer.write(
                        habitacion.getCodigo() + ";"
                        + habitacion.getCaracteristicas() + ";"
                        + habitacion.getTipoHabitacion() + ";"
                        + habitacion.getNumeroHabitacion() + ";"
                        + habitacion.getPrecio() + ";"
                        + habitacion.getNumeroPiso()
                );
                writer.newLine();
            }

            System.out.println("Habitaciones guardadas en el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cargar habitaciones desde un archivo CSV
    public List<Habitacion> cargarHabitacionesCSV() {
        List<Habitacion> habitaciones = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_HABITACIONES_CSV))) {
            // Leer la primera línea que contiene los encabezados (opcional)
            String linea;
            reader.readLine();

            // Leer el resto de las líneas con datos de habitaciones
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(";");
                if (datos.length == 6) {
                    // Suponiendo que la estructura es "Codigo,Caracteristicas,TipoHabitacion,NumeroHabitacion,Precio,NumeroPiso"
                    String codigo = datos[0];
                    String caracteristicas = datos[1];
                    String tipoHabitacion = datos[2];
                    String numeroHabitacion = datos[3];
                    String precio = datos[4];
                    String numeroPiso = datos[5];

                    // Crear objeto Habitacion y agregarlo a la lista
                    Habitacion habitacion = new Habitacion(codigo, caracteristicas, tipoHabitacion, numeroHabitacion, precio, numeroPiso);
                    habitaciones.add(habitacion);
                }
            }

            //  System.out.println("Habitaciones cargadas desde el archivo CSV.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return habitaciones;
    }

}
