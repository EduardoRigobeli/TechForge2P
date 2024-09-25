import model.Cenas;
import model.Item;
import model.Save;
import repository.CenaDAO;
import repository.SaveDAO;
import repository.itensDAO;

import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
//            Cenas cenas = CenaDAO.findCenasById(1);
//            System.out.println(cenas.toString());
//
//            List<Item> itens = itensDAO.findItensByScene(cenas);
//            System.out.println("itens:"+ itens);

            List<Cenas> cenas = CenaDAO.findAll();
            System.out.println("Cenas antes do insert");
            System.out.println(cenas);

            Cenas novaCena = new Cenas();
            novaCena.setCenas("Nova cena que foi inserida pelo java brabíssimo");
            CenaDAO.insertCena(novaCena);

            cenas = CenaDAO.findAll();
            System.out.println("Cenas depois do insert");
            System.out.println(cenas);

            Save save = SaveDAO.novoJogo();
            System.out.println(save.getCenas().getCenas());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}