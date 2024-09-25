package repository;

import model.Save;

import java.sql.*;

public class updateDAO {

    public static Save atualizarCena() throws SQLException {
        Connection conn = Mysql.getConnection();
        String update = "UPDATE save SET save_atual = ? WHERE id_cena = save_atual;";
        PreparedStatement stmt = conn.prepareStatement(update);
        stmt.execute(update, Statement.RETURN_GENERATED_KEYS);
        ResultSet generatedKeys = stmt.getGeneratedKeys();
        Save save = new Save();
        if(generatedKeys.next()) {
            save.setIdSave(generatedKeys.getInt(1));
            save.setCenas(CenaDAO.findCenasById(1));
        }
        return save;
    }
}
