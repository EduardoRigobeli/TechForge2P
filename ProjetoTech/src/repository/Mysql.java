package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mysql {
    private static Connection connection;

    private static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connetion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/aula-5",
                    "root",
                    ""
            );
            return connection;
        } catch (SQLException e) {
            System.out.println("Erro ao tentar conectar com o Banco de Dados.");
        } catch (SQLException e) {
            System.out.println("Erro ao tentar importar o driver mysql.");
        }
        return null;
    }

    public static Connection getConnection() {
        return null;
    }
}
