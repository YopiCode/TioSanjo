package proyecto_models;

public class Empleado{
    private int id;
    private String usuario;
    private String clave;
    private int idTipoEmpleado;

    public Empleado(int id, String usuario, String clave, int idTipoEmpleado) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public Empleado(String usuario, String clave, int idTipoEmpleado) {
        this.usuario = usuario;
        this.clave = clave;
        this.idTipoEmpleado = idTipoEmpleado;
    }

    public Empleado() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getIdTipoEmpleado() {
        return idTipoEmpleado;
    }

    public void setIdTipoEmpleado(int idTipoEmpleado) {
        this.idTipoEmpleado = idTipoEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", idTipoEmpleado=" + idTipoEmpleado +
                '}';
    }
}

