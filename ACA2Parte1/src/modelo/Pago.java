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
public class Pago {

    Conexion ch = new Conexion();

    private int numeroTicketPago;
    private String codigoReserva;
    private String codigoHuesped;
    private String nombreCliente;
    private String apellidoCliente;
    private String direccionCliente;
    private String telefonoCliente;
    private String concepto;
    private double valorNoche;
    private int nochesReservadas;
    private double costoTotal;
    private double subtotal;
    private double costoIva;
    private final double valorIva;

    public Pago() {
        this.valorIva = 0.19;
    }

    public Pago(int numeroTicketPago, String codigoReserva, String codigoHuesped, String nombreCliente, String apellidoCliente, String direccionCliente, String telefonoCliente, String concepto, double valorNoche, int nochesReservadas, double costoTotal, double subtotal, double costoIva) {
        this.numeroTicketPago = numeroTicketPago;
        this.codigoReserva = codigoReserva;
        this.codigoHuesped = codigoHuesped;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.concepto = concepto;
        this.valorNoche = valorNoche;
        this.nochesReservadas = nochesReservadas;
        this.costoTotal = costoTotal;
        this.subtotal = subtotal;
        this.costoIva = costoIva;
        this.valorIva = 0.19;
    }

    public Pago(int numeroTicketPago, String codigoReserva, String codigoHuesped, String nombreCliente, String apellidoCliente, String direccionCliente, String telefonoCliente, String concepto, double valorNoche, int nochesReservadas, double costoTotal) {
        this.numeroTicketPago = numeroTicketPago;
        this.codigoReserva = codigoReserva;
        this.codigoHuesped = codigoHuesped;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.direccionCliente = direccionCliente;
        this.telefonoCliente = telefonoCliente;
        this.concepto = concepto;
        this.valorNoche = valorNoche;
        this.nochesReservadas = nochesReservadas;
        this.costoTotal = costoTotal;
        this.valorIva = 0.19;
    }

    public int getNumeroTicketPago() {
        return numeroTicketPago;
    }

    public void setNumeroTicketPago(int numeroTicketPago) {
        this.numeroTicketPago = numeroTicketPago;
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

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApellidoCliente() {
        return apellidoCliente;
    }

    public void setApellidoCliente(String apellidoCliente) {
        this.apellidoCliente = apellidoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(double valorNoche) {
        this.valorNoche = valorNoche;
    }

    public int getNochesReservadas() {
        return nochesReservadas;
    }

    public void setNochesReservadas(int nochesReservadas) {
        this.nochesReservadas = nochesReservadas;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getCostoIva() {
        return costoIva;
    }

    public void setCostoIva(double costoIva) {
        this.costoIva = costoIva;
    }

    public double getValorIva() {
        return valorIva;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        sb.append("Numero del Ticket de Pago: ").append(numeroTicketPago).append("\n");
        sb.append("Codigo de la Reserva: ").append(codigoReserva).append("\n");
        sb.append("Codigo del Huesped: ").append(codigoHuesped).append("\n");
        sb.append("Nombre del Cliente: ").append(nombreCliente).append("\n");
        sb.append("Apellido del Cliente: ").append(apellidoCliente).append("\n");
        sb.append("Direccion del Cliente: ").append(direccionCliente).append("\n");
        sb.append("Telefono del Cliente: ").append(telefonoCliente).append("\n");
        sb.append("Concepto: ").append(concepto).append("\n");
        sb.append("Valor de la Noche: ").append(valorNoche).append("\n");
        sb.append("Noches Reservadas: ").append(nochesReservadas).append("\n");
        sb.append("Costo subtotal: ").append(subtotal).append("\n");
        sb.append("Costo del Iva: ").append(costoIva).append("\n");
        sb.append("Costo Total: ").append(costoTotal).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    public void guardar(List<Pago> pagos) {
        ch.guardarPagosCSV(pagos);
    }

    public List<Pago> cargar() {
        return ch.cargarPagosCSV();
    }

}
