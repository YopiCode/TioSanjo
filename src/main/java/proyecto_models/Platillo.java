
package proyecto_models;


public class Platillo {
    private int id_platillo;
    private String nombrePlatillo;
    private int precio;
    private int stock;
    private int id_categoria;

    public Platillo(int id_platillo, String nombrePlatillo, int precio, int stock, int id_categoria) {
        this.id_platillo = id_platillo;
        this.nombrePlatillo = nombrePlatillo;
        this.precio = precio;
        this.stock = stock;
        this.id_categoria = id_categoria;
    }

    public int getId_platillo() {
        return id_platillo;
    }

    public void setId_platillo(int id_platillo) {
        this.id_platillo = id_platillo;
    }

    public String getNombrePlatillo() {
        return nombrePlatillo;
    }

    public void setNombrePlatillo(String nombrePlatillo) {
        this.nombrePlatillo = nombrePlatillo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }
    @Override
    public String toString(){
        return "Platillo{"+"id" +id_platillo + ", nombre" + nombrePlatillo +", precio" + precio + "stock" + stock + "idcat" + id_categoria + '}';
    }
    
    
}
