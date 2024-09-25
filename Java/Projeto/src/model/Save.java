package model;

public class Save {
    private Integer idSave;
    private Cenas Cenas;
    private Integer idCena;

    public Integer getIdSave() {
        return idSave;
    }

    public void setIdSave(Integer idSave) {
        this.idSave = idSave;
    }

    public model.Cenas getCenas() {
        return Cenas;
    }

    public void setCenas(model.Cenas cenas) {
        Cenas = cenas;
    }

    public Integer getIdCena() {
        return idCena;
    }

    public void setIdCena(Integer idCena) {
        this.idCena = idCena;
    }

    @Override
    public String toString() {
        return "Save{" +
                "idSave=" + idSave +
                ", Cenas=" + Cenas +
                ", idCena=" + idCena +
                '}';
    }
}
