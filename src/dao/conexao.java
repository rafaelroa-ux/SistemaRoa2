package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

    public static Connection conectar() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

       String url = "jdbc:mysql://localhost:3306/db_rafael_roa";
String usuario = "root";
String senha = "rafaxit";

            con = DriverManager.getConnection(url, usuario, senha);

            System.out.println("Conectado com sucesso!");

        } catch (Exception e) {

            System.out.println("Erro na conexão: " + e.getMessage());
        }

        return con;
    }
}