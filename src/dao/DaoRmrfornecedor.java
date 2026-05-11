/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrFornecedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrFornecedor extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrFornecedor fornecedor =
                (BeanRmrFornecedor) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_fornecedor ("
                    + "rmr_nome,"
                    + "rmr_telefone,"
                    + "rmr_email,"
                    + "rmr_endereco,"
                    + "rmr_cnpj,"
                    + "rmr_status,"
                    + "rmr_inscricao_estadual,"
                    + "rmr_inscricao_municipal,"
                    + "rmr_tipo_fornecedor,"
                    + "rmr_limite_credito,"
                    + "rmr_condicao_pagamento,"
                    + "rmr_banco,"
                    + "rmr_agencia,"
                    + "rmr_conta,"
                    + "rmr_fornecedorcol"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, fornecedor.getRmr_nome());
            ps.setString(2, fornecedor.getRmr_telefone());
            ps.setString(3, fornecedor.getRmr_email());
            ps.setString(4, fornecedor.getRmr_endereco());
            ps.setString(5, fornecedor.getRmr_cnpj());
            ps.setString(6, fornecedor.getRmr_status());
            ps.setString(7, fornecedor.getRmr_inscricao_estadual());
            ps.setString(8, fornecedor.getRmr_inscricao_municipal());
            ps.setString(9, fornecedor.getRmr_tipo_fornecedor());
            ps.setDouble(10, fornecedor.getRmr_limite_credito());
            ps.setString(11, fornecedor.getRmr_condicao_pagamento());
            ps.setString(12, fornecedor.getRmr_banco());
            ps.setString(13, fornecedor.getRmr_agencia());
            ps.setString(14, fornecedor.getRmr_conta());
            ps.setString(15, fornecedor.getRmr_fornecedorcol());

            ps.execute();

            System.out.println("Fornecedor salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar fornecedor!");
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