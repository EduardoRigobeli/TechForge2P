package model;

import java.util.List;

public class Cenas {
    private Integer idCenas;
    private String Cenas;
    private List<Item> itens;

    public Integer getIdCenas() {
        return idCenas;
    }

    public void setIdCenas(Integer idCenas) {
        this.idCenas = idCenas;
    }

    public String getCenas() {
        return Cenas;
    }

    public void setCenas(String cenas) {
        Cenas = cenas;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    @Override
    public String toString() {
        return "Cenas{" +
                "idCenas=" + idCenas +
                ", Cenas='" + Cenas + '\'' +
                '}';
    }
}
