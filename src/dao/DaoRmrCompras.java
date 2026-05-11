/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrCompras extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrCompras compra =
                (BeanRmrCompras) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_compras ("
                    + "rmr_id_fornecedor,"
                    + "rmr_data_compra,"
                    + "rmr_valor_total,"
                    + "rmr_forma_pagamento,"
                    + "rmr_status_compra,"
                    + "rmr_observacao"
                    + ") VALUES (?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, compra.getRmr_id_fornecedor());
            ps.setString(2, compra.getRmr_data_compra());
            ps.setDouble(3, compra.getRmr_valor_total());
            ps.setString(4, compra.getRmr_forma_pagamento());
            ps.setString(5, compra.getRmr_status_compra());
            ps.setString(6, compra.getRmr_observacao());

            ps.execute();

            System.out.println("Compra salva!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar compra!");
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
