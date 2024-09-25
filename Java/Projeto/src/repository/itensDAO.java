package repository;

import model.Cenas;
import model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class itensDAO {
    public static Item findItemById(Integer id){
        return new Item();
    }

    public static List<Item> findItensByScene(Cenas cenas) throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "SELECT * FROM itens WHERE id_item = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, cenas.getIdCenas());
        ResultSet rs = stmt.executeQuery();

        List<Item> itens = new ArrayList<>();
        while (rs.next()) {
            Item item = new Item();
            item.setIdItem(rs.getInt("id_item"));
            item.setItens(rs.getString("itens"));

            Integer idCena = rs.getInt("id_cena");

            item.setIdCena(idCena);

            itens.add(item);
        }
        return itens;
    }
}
