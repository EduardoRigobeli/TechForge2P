
import Controller.AntesDoJogoController;
import com.google.gson.Gson;
import model.Console;
import model.Save;
import repository.CenaDAO;
import repository.SaveDAO;
import spark.Spark;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final Gson Gson = new Gson();
    public static void main(String[] args) {
        try {
            Save save = SaveDAO.novoJogo();
            Console console = new Console();
            String saveJson = Gson.toJson(save);
            Spark.get("/", (req,res) -> saveJson);

            Spark.get("cena/:id", (req,res) -> {
                Integer idCena = Integer.parseInt(req.params(":id"));
                return Gson.toJson(CenaDAO.findCenasById(idCena));
            });

            Spark.get("/:comando", new AntesDoJogoController());


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}