/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class Conexion {
  private static Connection cn =null;
    
    private static void conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            String url = "jdbc:oracle:thin:@localhost:1521:XE";  //@equipo>puerto>Servicio
            cn = DriverManager.getConnection(url,"ot","OT");
            System.out.println("conectando");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }

    public static Connection getConnection() {
        if (cn==null){
            conectar();   
        }
        return cn;
    }
    
    public static void desconectar() {
        if (cn!=null) {
            try {
                if (cn.isClosed()==false) {
                    cn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }    
    }    
}
    





   

