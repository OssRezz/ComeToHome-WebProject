/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.dtoSede;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author james
 */
public class daoSede {

    dtoSede sedeIn = new dtoSede();

    Connection conexion;

    public boolean insertSede(dtoSede sedeIn) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/cometohome", "root", "");
            PreparedStatement insertSede = conexion.prepareStatement("INSERT INTO `tbl_sedes`(`id_Sede`, `Nombre`, `Direccion`, `Telefono`) VALUES (?,?,?,?)");
            insertSede.setString(1, "0");
            insertSede.setString(2, sedeIn.getNombre());
            insertSede.setString(3, sedeIn.getDireccion());
            insertSede.setString(4, sedeIn.getTelefono());
            insertSede.executeUpdate();
            conexion.close();
            return true;
            
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error; " + e);
        }
        return false;
    }
    
    
    

}
