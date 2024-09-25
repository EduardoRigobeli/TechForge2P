package repository;

import model.Cenas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CenaDAO {
    public static Cenas findCenasById(Integer id) throws SQLException {//throws SQLExeption seria passar adiante, ou seja, jogar o "problem" pra frente
        Connection conn = Mysql.getConnection();//recebeu a conexão com o SQL
        String sql = "SELECT * FROM cenas WHERE id_cena = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);//basicamente substitui os pontos de interrogação(?)
        stmt.setInt(1, id);//vai inserir o valor 1 no ?
        ResultSet rs = stmt.executeQuery();//RS é o reponsável por trazer os dados do Banco de Dados
        Cenas cena = new Cenas();

        if(rs.next()) {//next passa para próxima linha do Banco de Dados resultando em VERDADEIRO
            cena.setIdCenas(rs.getInt("id_cena"));//vai retornar o id da cena
            cena.setCenas(rs.getString("cenas"));
            cena.setItens(itensDAO.findItensByScene(cena));
        }
        return cena;
    }

    public static void insertCena (Cenas cena) throws SQLException {
        Connection conn = Mysql.getConnection();
        String insert = "INSERT INTO cenas(cenas) VALUES (?);";
        PreparedStatement stmt = conn.prepareStatement(insert);
        stmt.setString(1, cena.getCenas());
        stmt.execute();
    }

    public static List<Cenas> findAll() throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "select * from cenas;";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        List<Cenas> cenas = new ArrayList<>();
        while (rs.next()) {
            Cenas cena = new Cenas();
            cena.setIdCenas(rs.getInt("id_cena"));
            cena.setCenas(rs.getString("cenas"));

            cenas.add(cena);
        }
        return cenas;
    }

}
