/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cetecom
 */
public class Cliente {
    private int rut, numContacto;
    private String nombre, direccion, tipoCliente;

    public Cliente() {
    }

    public Cliente(int rut, int numContacto, String nombre, String direccion, String tipoCliente) {
        this.rut = rut;
        this.numContacto = numContacto;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCliente = tipoCliente;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getNumContacto() {
        return numContacto;
    }

    public void setNumContacto(int numContacto) {
        this.numContacto = numContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "rut=" + rut + ", numContacto=" + numContacto + ", nombre=" + nombre + ", direccion=" + direccion + ", tipoCliente=" + tipoCliente + '}';
    }
    
    
    
}
