/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Transaccion {
    
    private int id, montoTotal, idVehiculo, rutCliente;
    private Date fecha;
    private String tipoTransaccion;

    public Transaccion() {
    }

    public Transaccion(int id, int montoTotal, int idVehiculo, int rutCliente, Date fecha, String tiopTransaccion) {
        this.id = id;
        this.montoTotal = montoTotal;
        this.idVehiculo = idVehiculo;
        this.rutCliente = rutCliente;
        this.fecha = fecha;
        this.tipoTransaccion = tiopTransaccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(int rutCliente) {
        this.rutCliente = rutCliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }
    
    
    
}
