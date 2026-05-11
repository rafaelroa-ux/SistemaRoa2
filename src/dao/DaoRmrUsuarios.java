/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrUsuarios1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrUsuarios extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrUsuarios1 usuario = (BeanRmrUsuarios1) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_usuarios ("
                    + "rmr_id_usuarios,"
                    + "rmr_nomel,"
                    + "rmr_apelido,"
                    + "rmr_cpf,"
                    + "rmr_dataNascimento,"
                    + "rmr_nivel,"
                    + "rmr_senha,"
                    + "rmr_ativo"
                    + ") VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, usuario.getRmr_id_usuarios());
            ps.setString(2, usuario.getRmr_nomel());
            ps.setString(3, usuario.getRmr_apelido());
            ps.setString(4, usuario.getRmr_cpf());
            ps.setString(5, usuario.getRmr_dataNascimento());
            ps.setInt(6, usuario.getRmr_nivel());
            ps.setString(7, usuario.getRmr_senha());
            ps.setString(8, usuario.getRmr_ativo());

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