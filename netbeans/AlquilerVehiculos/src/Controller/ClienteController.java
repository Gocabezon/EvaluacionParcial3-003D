/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bd.Conexion;
import Models.Cliente;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
/**
 *
 * @author Cetecom
 */
public class ClienteController {
    Conexion cx;
    HelperController helper;
    private List<Cliente> clientes;
    
    public void agregarCliente(int rut, int numContacto, String nombre, String direccion, String tipoCliente){
        
        String query = "INSERT INTO CLIENTE (`rut`, `numContacto`, `nombre`, `direccion`, `tipoCliente``) "
                + "VALUES (" + rut + ", " + numContacto + ", " +  nombre + ", " + direccion + ", " +  tipoCliente + ")";
        try {
            cx.EjecutarUpdate(query);
            
        } catch (Exception e) {
            System.out.println("ola");
        }
        
        
        
        
    }
    
    public void listarClientes(){
        String query = "SELECT * FROM CLIENTE";
        
        
       
        
        
        
    }
    
}
