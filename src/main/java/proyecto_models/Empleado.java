package proyecto_models;

public class Empleado{
    private int id_empleado;
    private int idPersona;
    private int id_tipo;
    private String usuario;
    private String clave;

    public Empleado(String usuario, String clave, int id_tipo) {
        this.usuario = usuario;
        this.clave = clave;
        this.id_tipo = id_tipo;
    }

    public Empleado() {
    }
    
    

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(int id_tipo) {
        this.id_tipo = id_tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id_empleado=" + id_empleado + ", id_tipo=" + id_tipo + ", usuario=" + usuario + ", clave=" + clave + '}';
    }

    

        
    
}
