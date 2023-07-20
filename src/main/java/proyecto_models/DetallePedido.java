package proyecto_models;

public class DetallePedido {

    private int id_detallepedido;
    private int id_pedido;
    private int id_carta;
    private int cantidad;

    public DetallePedido(int id_detallepedido, int id_pedido, int id_carta, int cantidad) {
        this.id_detallepedido = id_detallepedido;
        this.id_pedido = id_pedido;
        this.id_carta = id_carta;
        this.cantidad = cantidad;
    }

    public DetallePedido() {
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "id_detallepedido=" + id_detallepedido +
                ", id_pedido=" + id_pedido +
                ", id_carta=" + id_carta +
                ", cantidad=" + cantidad +
                '}';
    }

    public int getId_detallepedido() {
        return id_detallepedido;
    }

    public void setId_detallepedido(int id_detallepedido) {
        this.id_detallepedido = id_detallepedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_carta() {
        return id_carta;
    }

    public void setId_carta(int id_carta) {
        this.id_carta = id_carta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
