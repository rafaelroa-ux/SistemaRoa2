/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrProdutos extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrProdutos produto = (BeanRmrProdutos) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_produtos ("
                    + "rmr_nome,"
                    + "rmr_preco,"
                    + "rmr_marca,"
                    + "rmr_categoria,"
                    + "rmr_descricao,"
                    + "rmr_data_cadastro"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, produto.getRmr_nome());
            ps.setDouble(2, produto.getRmr_preco());
            ps.setString(3, produto.getRmr_marca());
            ps.setString(4, produto.getRmr_categoria());
            ps.setString(5, produto.getRmr_descricao());
            ps.setString(6, produto.getRmr_data_cadastro());

            ps.execute();

            System.out.println("Produto salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar produto!");
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