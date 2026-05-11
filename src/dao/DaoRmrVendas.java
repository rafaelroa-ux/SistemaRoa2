/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrVendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrVendas extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrVendas venda =
                (BeanRmrVendas) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_vendas ("
                    + "rmr_id_cliente,"
                    + "rmr_data_venda,"
                    + "rmr_valor_total,"
                    + "rmr_forma_pagamento,"
                    + "rmr_status_venda,"
                    + "rmr_observacao"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, venda.getRmr_id_cliente());
            ps.setString(2, venda.getRmr_data_venda());
            ps.setDouble(3, venda.getRmr_valor_total());
            ps.setString(4, venda.getRmr_forma_pagamento());
            ps.setString(5, venda.getRmr_status_venda());
            ps.setString(6, venda.getRmr_observacao());

            ps.execute();

            System.out.println("Venda salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar venda!");
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