package service;

import model.Console;
import model.Save;
import repository.SaveDAO;

import java.sql.SQLException;

public class ComandoService {
    private String[] comando;
    private Console console;

    public ComandoService(String comandoBruto){
        Console console = new Console();
        this.console = console;
        this.comando = comandoBruto.split(" ");

    }

    public Console help() {
        Console console = new Console();
        console.setMensagem("Esse aqui é o texto de ajuda");
        return console;
    }

    public Console start() {
        try {
            Save save = SaveDAO.novoJogo();
            console.setMensagem(save.getCenas().getCenas());
            console.setIdSave(save.getIdSave());
            return console;
        } catch (Exception e) {
            e.printStackTrace();
            console.setMensagem("Erro ao iniciar o jogo");
            return console;
        }
    }

    public Console getResultadoConsole() {
        try {
            switch (comando[0].toLowerCase()) {
                case "help":
                    return help();
                case "start":
                    return start();
                default:
                    console.setMensagem("Comando Inválido");
                    return console;
            }
        } catch (Exception e) {
            console.setMensagem("Comando Inválido");
            e.printStackTrace();
            return console;
        }
    }
}
