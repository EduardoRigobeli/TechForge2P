package repository;

import model.Save;

import java.sql.*;

public class SaveDAO {
    public static Save novoJogo() throws SQLException {
        Connection conn = Mysql.getConnection();
        String sql = "INSERT INTO save (id_save,save_atual,id_cena) VALUES (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.execute(sql, Statement.RETURN_GENERATED_KEYS);
        ResultSet generatedKeys = stmt.getGeneratedKeys();
        Save save = new Save();
        if(generatedKeys.next()) {
            save.setIdSave(generatedKeys.getInt(1));
            save.setCenas(CenaDAO.findCenasById(1));
        }
        return save;
    }
}
