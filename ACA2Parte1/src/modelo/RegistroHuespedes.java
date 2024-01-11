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
public class RegistroHuespedes {

    Conexion ch = new Conexion();

    private String codigoReserva;
    private String codigoHuesped;
    private String cantidadPersonas;
    private String tipoHabitacion;
    private String fechaLlegada;
    private String fechaSalida;

    public RegistroHuespedes() {
    }

    public RegistroHuespedes(String codigoReserva, String codigoHuesped, String cantidadPersonas, String tipoHabitacion, String fechaLlegada, String fechaSalida) {
        this.codigoReserva = codigoReserva;
        this.codigoHuesped = codigoHuesped;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoHabitacion = tipoHabitacion;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }

    public String getCodigoHuesped() {
        return codigoHuesped;
    }

    public void setCodigoHuesped(String codigoHuesped) {
        this.codigoHuesped = codigoHuesped;
    }

    public String getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(String cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Codigo de la Reserva: ").append(codigoReserva).append("\n");
        sb.append("Codigo del Huesped: ").append(codigoHuesped).append("\n");
        sb.append("Cantidad de Personas: ").append(cantidadPersonas).append("\n");
        sb.append("Tipo de Habitacion: ").append(tipoHabitacion).append("\n");
        sb.append("Fecha de Llegada: ").append(fechaLlegada).append("\n");
        sb.append("Fecha de Salida: ").append(fechaSalida).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    public void guardar(List<RegistroHuespedes> registrosHuespedes) {
        ch.guardarRegistroHuespedesCSV(registrosHuespedes);
    }

    public List<RegistroHuespedes> cargar() {
        return ch.cargarRegistroHuespedesCSV();
    }

}
