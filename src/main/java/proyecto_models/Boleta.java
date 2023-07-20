package proyecto_models;

public class Boleta {

    private int id_boleta;
    private String serieboleta;
    private float igv;
    private int id_pago;

    public Boleta(int id_boleta, String serieboleta, float igv, int id_pago) {
        this.id_boleta = id_boleta;
        this.serieboleta = serieboleta;
        this.igv = igv;
        this.id_pago = id_pago;
    }

    public Boleta() {
    }

    public int getId_boleta() {
        return id_boleta;
    }

    public void setId_boleta(int id_boleta) {
        this.id_boleta = id_boleta;
    }

    public String getSerieboleta() {
        return serieboleta;
    }

    public void setSerieboleta(String serieboleta) {
        this.serieboleta = serieboleta;
    }

    public float getIgv() {
        return igv;
    }

    public void setIgv(float igv) {
        this.igv = igv;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    @Override
    public String toString() {
        return "Boleta{" +
                "id_boleta=" + id_boleta +
                ", serieboleta='" + serieboleta + '\'' +
                ", igv=" + igv +
                ", id_pago=" + id_pago +
                '}';
    }
}
