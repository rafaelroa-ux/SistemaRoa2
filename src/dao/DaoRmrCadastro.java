/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrCadastro;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrCadastro extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrCadastro cadastro =
                (BeanRmrCadastro) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_cadastro ("
                    + "usuario,"
                    + "fornecedor,"
                    + "licencas,"
                    + "clientes"
                    + ") VALUES (?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, cadastro.getUsuario());
            ps.setString(2, cadastro.getFornecedor());
            ps.setString(3, cadastro.getLicencas());
            ps.setString(4, cadastro.getClientes());

            ps.execute();

            System.out.println("Cadastro salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar cadastro!");
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