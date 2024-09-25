package model;

public class Item {
    private Integer idItem;
    private String Itens;
    private Cenas idCena;

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public String getItens() {
        return Itens;
    }

    public void setItens(String itens) {
        Itens = itens;
    }

    public Cenas getIdCena() {
        return idCena;
    }

    public void setIdCena(Cenas idCena) {
        this.idCena = idCena;
    }

    @Override
    public String toString() {
        return "Item{" +
                "idItem=" + idItem +
                ", Itens='" + Itens + '\'' +
                ", idCena=" + idCena +
                '}';
    }
}
