/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Resources.Conexion;
import DTO.dtoLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author james
 */
public class daoLogin {

    dtoLogin dtoValidation = new dtoLogin();
    int r = 0;
    Connection conexion;
    Conexion cn= new Conexion();
    ResultSet rs;
    PreparedStatement ps;

    public int validarUsuario(dtoLogin dtoValidacion) {  //recibe los parametros y los iguala.
        String sql = "SELECT * FROM `tbl_usuario` WHERE Nombre=? AND password=?";

        try {
            conexion=cn.getConnection();
            ps=conexion.prepareStatement(sql);
            ps.setString(1, dtoValidacion.getUsuario());
            ps.setString(2, dtoValidacion.getPassword());
            rs=ps.executeQuery();
            
            while (rs.next()) {
                r = r + 1;
                dtoValidacion.setUsuario(rs.getString("Nombre"));
                dtoValidacion.setPassword(rs.getString("password"));

            } //Si el usuario ingreso, retorna 1. Si fallo retorna 0.
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            System.err.println("Error; " + e);
            return 0;
        }

    }
}
