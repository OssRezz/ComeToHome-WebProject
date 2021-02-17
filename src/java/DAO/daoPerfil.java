/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.dtoPerfil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author james
 */
public class daoPerfil {

    public List<dtoPerfil> listarPerfil() {
        Connection conexion;
        PreparedStatement listarPerfil;
        ResultSet resultadoPerfil;
        List<dtoPerfil> listPerfil = new ArrayList<dtoPerfil>();
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost/cometohome", "root", "");
            String sql = "SELECT * FROM `tbl_perfiles`";
            listarPerfil = conexion.prepareStatement(sql);
            resultadoPerfil = listarPerfil.executeQuery();
            while (resultadoPerfil.next()) {
                dtoPerfil perfilIn = new dtoPerfil();
                perfilIn.setId_Perfil(resultadoPerfil.getInt("id_Perfil"));
                perfilIn.setTipoPerfil(resultadoPerfil.getString("tipoPerfil"));
                listPerfil.add(perfilIn);
            }
        } catch (SQLException e) {
            System.err.println("Error; " + e);
        }
        return listPerfil;
        
    }

}
