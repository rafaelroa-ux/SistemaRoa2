/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bean.BeanRmrClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoRmrClientes extends DaoAbstract {

    Connection con;

    @Override
    public void insert(Object object) {

        BeanRmrClientes cliente = (BeanRmrClientes) object;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rafael_roa?useTimezone=true&serverTimezone=UTC",
                    "root",
                    "rafaxit"
            );

            String sql = "INSERT INTO rmr_clientes ("
                    + "rmr_nome,"
                    + "rmr_telefone,"
                    + "rmr_email,"
                    + "rmr_endereco,"
                    + "rmr_numero,"
                    + "rmr_bairro,"
                    + "rmr_cidade,"
                    + "rmr_estado,"
                    + "rmr_cep,"
                    + "rmr_cpf,"
                    + "rmr_data_nascimento,"
                    + "rmr_genero,"
                    + "rmr_data_cadastro,"
                    + "rmr_status"
                    + ") VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, cliente.getRmr_nome());
            ps.setString(2, cliente.getRmr_telefone());
            ps.setString(3, cliente.getRmr_email());
            ps.setString(4, cliente.getRmr_endereco());
            ps.setString(5, cliente.getRmr_numero());
            ps.setString(6, cliente.getRmr_bairro());
            ps.setString(7, cliente.getRmr_cidade());
            ps.setString(8, cliente.getRmr_estado());
            ps.setString(9, cliente.getRmr_cep());
            ps.setString(10, cliente.getRmr_cpf());
            ps.setString(11, cliente.getRmr_data_nascimento());
            ps.setString(12, cliente.getRmr_genero());
            ps.setString(13, cliente.getRmr_data_cadastro());
            ps.setString(14, cliente.getRmr_status());

            ps.execute();

            System.out.println("Cliente salvo!");

        } catch (Exception erro) {

            System.out.println("Erro ao salvar cliente!");
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