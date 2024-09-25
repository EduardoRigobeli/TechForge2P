package Controller;

import com.google.gson.Gson;
import model.Console;
import service.ComandoService;
import spark.Request;
import spark.Response;
import spark.Route;

public class AntesDoJogoController implements Route {
    @Override
    public Object handle(Request request, Response response) throws Exception {
        String comandoBruto = request.params(":comando");

        ComandoService comandoService = new ComandoService(comandoBruto);
        Gson gson = new Gson();

        Console console = comandoService.getResultadoConsole();
        String consoleJson = gson.toJson(console);

        return gson.toJson(comandoService.getResultadoConsole());
    }
}
