package proyecto_models;

public class Pago {

    private int id_pago;
    private int id_pedido;
    private int costo_extra;

    public Pago(int id_pago, int id_pedido, int costo_extra) {
        this.id_pago = id_pago;
        this.id_pedido = id_pedido;
        this.costo_extra = costo_extra;
    }

    public Pago() {
    }

    @Override
    public String toString() {
        return "Pago{" +
                "id_pago=" + id_pago +
                ", id_pedido=" + id_pedido +
                ", costo_extra=" + costo_extra +
                '}';
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getCosto_extra() {
        return costo_extra;
    }

    public void setCosto_extra(int costo_extra) {
        this.costo_extra = costo_extra;
    }
}
