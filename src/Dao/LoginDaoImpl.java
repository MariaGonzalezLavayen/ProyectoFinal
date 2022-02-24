/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Conexion.Conexion;
import Modelo.Login;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class LoginDaoImpl implements LoginDao{
    @Override
    public int create (Login login){
        
        Statement st = null;
        int filas = 0;
        try {
            Connection con = Conexion.getConnection();
            st = con.createStatement();
            String sql = "insert into countries values ('"+ login.getUsuario() + "','" +
                                                        login.getContraseña() + "','" + ")";
            filas = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if (st!=null) {
                    st.close();
                }
            } catch (SQLException ex) {
                    Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        return filas;
    }
/*
    @Override
    public int update(Login login) {
         
        Connection con = null;
        Statement st = null;
        int filas = 0;
        ResultSet rs = null;
        
        try {
            
            con = Conexion.getConnection();
            con.setAutoCommit(false);
            con.createStatement();
            String sql = "update  countries set counntry_name ='" + 
                                            pais.getNombre()+ "',region_id=" + 
                                            pais.getRegion().getCodRegion()+ "where country_id='"+
                                            pais.getCodigo()+"'";
            filas = st.executeUpdate(sql);

        } catch (SQLException ex) {
            try {
                Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                con.rollback();
            } catch (SQLException ex1) {
                 Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally{
            try {
                
                if(st != null){
                    st.close();
                }
                if(rs != null){
                    rs.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          return filas;
    }

    @Override
    public int delete(String codigo) {
        Connection con = null;
        Statement st = null;
        int filas = 0;
        ResultSet rs = null;
        
        try {
            
            con = Conexion.getConnection();
            con.setAutoCommit(false);
            con.createStatement();
            String sql = "delete  countries set counntry_id ='" + codigo  +"'";
            filas = st.executeUpdate(sql);

        } catch (SQLException ex) {
            try {
                Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
                con.rollback();
            } catch (SQLException ex1) {
                 Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex1);
            }
        } finally{
            try {
                
                if(st != null){
                    st.close();
                }
                if(rs != null){
                    rs.close();
                }

            } catch (SQLException ex) {
                Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          return filas;
    }
 
    @Override
    public Login read(String codigo) {
        Statement st = null;
        ResultSet rs=null;
        Pais pais = null;
        Region region = null;
        
        try {
            Connection con = Conexion.getConnection();
            st = con.createStatement();
            String sql = "Select c.*,r.region_name from countries c, regions r " +
                         "where c.region_id =r.region_idorder by country_id";
            
            rs=st.executeQuery(sql);
            if (rs.next()) {
                region = new Region();
                region.setCodRegion(rs.getInt("REGION_ID"));
                region.setNomRegion(rs.getString("REGION_NAME"));
                pais = new Pais();
                pais.setCodigo(rs.getString("COUNTRY_ID"));
                pais.setNombre(rs.getString("COUNTRY_NAME"));
                pais.setRegion(region);    
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                   if (rs!=null) {
                       rs.close();
                   }
                   if (st!=null) {
                       st.close();
                   }            
            } catch (SQLException ex) {
                   Logger.getLogger(LoginDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
        return login;
    }*/

    @Override
    public int update(Login login) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Login read(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
