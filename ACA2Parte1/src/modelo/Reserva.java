/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author leonel.borja
 */
public class Reserva {

    Conexion ch = new Conexion();

    private String codigoHuesped;
    private String codigoReserva;
    private String codigoHabitacion;
    private String tipoHabitacion;
    private String fechaIngreso;
    private String fechaSalida;
    private String nochesReservadas;
    private String cantidadPersonas;

    public Reserva() {
    }

    public Reserva(String codigoHuesped, String codigoReserva, String codigoHabitacion, String tipoHabitacion, String fechaIngreso, String fechaSalida, String nochesReservadas, String cantidadPersonas) {
        this.codigoHuesped = codigoHuesped;
        this.codigoReserva = codigoReserva;
        this.codigoHabitacion = codigoHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.nochesReservadas = nochesReservadas;
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getCodigoHuesped() {
        return codigoHuesped;
    }

    public void setCodigoHuesped(String codigoHuesped) {
        this.codigoHuesped = codigoHuesped;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(String codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNochesReservadas() {
        return nochesReservadas;
    }

    public void setNochesReservadas(String nochesReservadas) {
        this.nochesReservadas = nochesReservadas;
    }

    public String getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(String cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Codigo del Huesped: ").append(codigoHuesped).append("\n");
        sb.append("Codigo de la Reserva: ").append(codigoReserva).append("\n");
        sb.append("Codigo de la Habitacion: ").append(codigoHabitacion).append("\n");
        sb.append("Tipo de Habitacion: ").append(tipoHabitacion).append("\n");
        sb.append("fecha de Ingreso: ").append(fechaIngreso).append("\n");
        sb.append("Fecha de Salida: ").append(fechaSalida).append("\n");
        sb.append("Noches Reservadas: ").append(nochesReservadas).append("\n");
        sb.append("Cantidad de Personas: ").append(cantidadPersonas).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    public void guardar(List<Reserva> reservas) {
        ch.guardarReservasCSV(reservas);
    }

    public List<Reserva> cargar() {
        return ch.cargarReservasCSV();
    }

}
