/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leonel.borja
 */
public class Hotel {

    Conexion ch = new Conexion();

    private String nombreHotel;
    private String nit;
    private String paginaWeb;
    private String correo;
    private String ciudad;
    private String sucursal;
    private String direccion;
    private String telefono;
    private String capacidad;

    public Hotel() {
    }

    public Hotel(String nombreHotel, String nit, String paginaWeb, String correo, String ciudad, String sucursal, String direccion, String telefono, String capacidad) {
        this.nombreHotel = nombreHotel;
        this.nit = nit;
        this.paginaWeb = paginaWeb;
        this.correo = correo;
        this.ciudad = ciudad;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;

    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Hotel: ").append(nombreHotel).append("\n");
        sb.append("nit: ").append(nit).append("\n");
        sb.append("pagina Web: ").append(paginaWeb).append("\n");
        sb.append("correo: ").append(correo).append("\n");
        sb.append("ciudad: ").append(ciudad).append("\n");
        sb.append("sucursal: ").append(sucursal).append("\n");
        sb.append("direccion: ").append(direccion).append("\n");
        sb.append("telefono: ").append(telefono).append("\n");
        sb.append("capacidad=: ").append(capacidad).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    public void guardar(List<Hotel> hoteles) {
        ch.guardarHotelesCSV(hoteles);
    }

    public List<Hotel> cargar() {
        return ch.cargarHotelesCSV();
    }

}
