/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrVendaProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrVendas_Produtos extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrVendaProdutos vendaProduto =
                (BeanRmrVendaProdutos) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_vendas_produtos ("
                    + "rmr_id_venda,"
                    + "rmr_id_produto,"
                    + "rmr_quantidade,"
                    + "rmr_preco_unitario,"
                    + "rmr_subtotal,"
                    + "rmr_desconto"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, vendaProduto.getRmr_id_venda());
            ps.setInt(2, vendaProduto.getRmr_id_produto());
            ps.setInt(3, vendaProduto.getRmr_quantidade());
            ps.setDouble(4, vendaProduto.getRmr_preco_unitario());
            ps.setDouble(5, vendaProduto.getRmr_subtotal());
            ps.setDouble(6, vendaProduto.getRmr_desconto());

            ps.execute();

            System.out.println("Venda produto salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar venda produto!");
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
