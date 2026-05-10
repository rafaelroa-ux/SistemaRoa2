/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrUsuarios extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrUsuarios usuario = (BeanRmrUsuarios) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistemaroger?useTimezone=true&serverTimezone=UTC",
                "root",
                "75821021rR!2020"
            );

            String sql = "INSERT INTO rmr_usuarios ("
                    + "rmr_ativo,"
                    + "rmr_email,"
                    + "rmr_login,"
                    + "rmr_nivel,"
                    + "rmr_nome,"
                    + "rmr_senha"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, usuario.getRmr_ativo());
            ps.setString(2, usuario.getRmr_email());
            ps.setString(3, usuario.getRmr_login());
            ps.setString(4, usuario.getRmr_nivel());
            ps.setString(5, usuario.getRmr_nome());
            ps.setString(6, usuario.getRmr_senha());

            ps.execute();

            System.out.println("Usuário salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar usuário!");
            System.out.println(erro);

        }
    }

    @Override
    public void update(Object object) {
    }

    @Override
    public void delete(Object object) {
    }

    @Override
    public Object list(int id) {
        return null;
    }

    @Override
    public Object listAll() {
        return null;
    }
}