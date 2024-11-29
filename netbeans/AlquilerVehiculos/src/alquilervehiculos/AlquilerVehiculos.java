/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alquilervehiculos;

import Bd.Conexion;
import Views.MenuPrincipal;
import java.sql.ResultSet;

/**
 *
 * @author Cetecom
 */
public class AlquilerVehiculos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         MenuPrincipal m = new MenuPrincipal();
         Conexion cx = new Conexion();
         cx.conectar();
            }
    
}
