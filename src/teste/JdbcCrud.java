/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author u07785254141
 */

public class JdbcCrud {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_marcos_vilhanueva";
            user = "marcos_vilhanueva";
            password = "marcos_vilhanueva";
            //url = "jdbc://mysql/localhost/db_marcos_vilhanueva";
            //user = "marcos_vilhanueva";
            //password = "marcos_vilhanueva";
            Connection cnt;
            cnt = DriverManager.getConnection(url, user, password);
//             117
//            String sql = "UPDATE mpv_usuarios SET mpv_nome=?, mpv_apelido=?, mpv_cpf=? WHERE mpv_idusuarios=?";
             String sql = "DELETE FROM mpv_usuarios WHERE mpv_idusuarios=?";
              
            PreparedStatement pst = cnt.prepareStatement(sql);

//            pst.setString(1, "Rafael teste");
//            pst.setString(2, "r 2026");
//            pst.setString(3, "98498465");
              pst.setInt(1, 117);

            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("rodou");
    }
}