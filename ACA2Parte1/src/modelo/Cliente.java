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
public class Cliente {

    Conexion ch = new Conexion();

    private String codigoCliente;
    private String nombre;
    private String apellido;
    private String direccion;

    public Cliente() {
    }

    public Cliente(String codigoCliente, String nombre, String apellido, String direccion) {
        this.codigoCliente = codigoCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Codigo del Cliente: ").append(codigoCliente).append("\n");
        sb.append("Nombre del Cliente: ").append(nombre).append("\n");
        sb.append("Apellido del Cliente: ").append(apellido).append("\n");
        sb.append("Direccion del Cliente: ").append(direccion).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    public void guardar(List<Cliente> clientes) {
        ch.guardarClientesCSV(clientes);
    }

    public List<Cliente> cargar() {
        return ch.cargarClientesCSV();
    }
}
