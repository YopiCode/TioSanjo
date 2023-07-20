package proyecto_models;

public class Producto {

    private int id_producto;
    private String nombreproducto;
    private int precio;
    private int id_categoriaproducto;
    private int stock;

    public Producto(int id_producto, String nombreproducto, int precio, int id_categoriaproducto, int stock) {
        this.id_producto = id_producto;
        this.nombreproducto = nombreproducto;
        this.precio = precio;
        this.id_categoriaproducto = id_categoriaproducto;
        this.stock = stock;
    }

    public Producto() {
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id_producto=" + id_producto +
                ", nombreproducto='" + nombreproducto + '\'' +
                ", precio=" + precio +
                ", id_categoriaproducto=" + id_categoriaproducto +
                ", stock=" + stock +
                '}';
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getId_categoriaproducto() {
        return id_categoriaproducto;
    }

    public void setId_categoriaproducto(int id_categoriaproducto) {
        this.id_categoriaproducto = id_categoriaproducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
