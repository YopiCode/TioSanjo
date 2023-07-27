package proyecto.proyecto_utils;

public class Boleta {
    private String img;
    private String dni;
    private String cliente;
    private String total;

    public Boleta(String img, String dni, String cliente, String total) {
        this.img = img;
        this.dni = dni;
        this.cliente = cliente;
        this.total = total;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
