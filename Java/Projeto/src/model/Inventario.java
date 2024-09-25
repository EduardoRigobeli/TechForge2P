package model;

public class Inventario {
    private Integer idInventario;
    private String idItem;
    private int idSave;

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public String getIdItem() {
        return idItem;
    }

    public void setIdItem(String idItem) {
        this.idItem = idItem;
    }

    public int getIdSave() {
        return idSave;
    }

    public void setIdSave(int idSave) {
        this.idSave = idSave;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "idInventario=" + idInventario +
                ", idItem='" + idItem + '\'' +
                ", idSave=" + idSave +
                '}';
    }
}
