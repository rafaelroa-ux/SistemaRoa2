/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrComprasProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrCompras_produtos extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrComprasProdutos compraProdutos =
                (BeanRmrComprasProdutos) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_compras_produtos ("
                    + "rmr_id_compra,"
                    + "rmr_id_produto,"
                    + "rmr_quantidade,"
                    + "rmr_preco_custo,"
                    + "rmr_subtotal,"
                    + "rmr_data_entrada"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    
            con.prepareStatement(sql);

             ps.setInt(1, compraProdutos.getRmr_id_compra());
             ps.setInt(2, compraProdutos.getRmr_id_produto());
             ps.setInt(3, compraProdutos.getRmr_quantidade());
             ps.setDouble(4, compraProdutos.getRmr_preco_custo());
             ps.setDouble(5, compraProdutos.getRmr_subtotal());
             ps.setString(6, compraProdutos.getRmr_data_entrada());

             ps.execute();

            System.out.println("Compra produto salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar compra produto!");
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