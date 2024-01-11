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
public class Habitacion {

    Conexion ch = new Conexion();

    private String codigo;
    private String caracteristicas;
    private String tipoHabitacion;
    private String numeroHabitacion;
    private String precio;
    private String numeroPiso;

    public Habitacion() {
    }

    public Habitacion(String codigo, String caracteristicas, String tipoHabitacion, String numeroHabitacion, String precio, String numeroPiso) {
        this.codigo = codigo;
        this.caracteristicas = caracteristicas;
        this.tipoHabitacion = tipoHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.precio = precio;
        this.numeroPiso = numeroPiso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(String numeroPiso) {
        this.numeroPiso = numeroPiso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Codigo de la  Habitacion: ").append(codigo).append("\n");
        sb.append("Caracteristicas de la Habitacion: ").append(caracteristicas).append("\n");
        sb.append("Tipo de Habitacion: ").append(tipoHabitacion).append("\n");
        sb.append("Numero de la Habitacion: ").append(numeroHabitacion).append("\n");
        sb.append("Precio de la Habitacion: ").append(precio).append("\n");
        sb.append("Numero del Piso  de la Habitacion: ").append(numeroPiso).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    public void guardar(List<Habitacion> habitaciones) {
        ch.guardarHabitacionesCSV(habitaciones);
    }

    public List<Habitacion> cargar() {
        return ch.cargarHabitacionesCSV();
    }

}
