package proyecto.proyecto_models;

public class ItemCarta {

    private int id;
    private String nombre;
    private double precioUnit;

    public ItemCarta(int id, String nombre, double precioUnit) {
        this.id = id;
        this.nombre = nombre;
        this.precioUnit = precioUnit;
    }

    public ItemCarta() {
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

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    @Override
    public String toString() {
        return "ItemCarta{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precioUnit=" + precioUnit +
                '}';
    }
}
