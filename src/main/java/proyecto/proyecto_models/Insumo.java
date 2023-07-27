package proyecto.proyecto_models;

public class Insumo {

    private int id;
    private String nombre;
    private int stock;
    private int idTipoInsumo;


    public Insumo(int id, String nombre, int stock, int idTipoInsumo) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.idTipoInsumo = idTipoInsumo;
    }

    public Insumo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdTipoInsumo() {
        return idTipoInsumo;
    }

    public void setIdTipoInsumo(int idTipoInsumo) {
        this.idTipoInsumo = idTipoInsumo;
    }

    @Override
    public String toString() {
        return "Insumo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", stock=" + stock +
                ", idTipoInsumo=" + idTipoInsumo +
                '}';
    }
}
