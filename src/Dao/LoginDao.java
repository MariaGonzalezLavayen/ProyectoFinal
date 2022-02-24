/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import Modelo.Login;

/**
 *
 * @author Usuario
 */
public interface LoginDao {
    public int create(Login login);
    public int update(Login login);
    public int delete(String codigo);
    public Login read(String codigo);
}
