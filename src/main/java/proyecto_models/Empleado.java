package proyecto_models;

public class Empleado{
    private int id_empleado;
    private int id_persona;
    private int id_tipoempleado;
    private String usuario;
    private String clave;

    public Empleado(String usuario, String clave, int id_tipo) {
        this.usuario = usuario;
        this.clave = clave;
        this.id_tipoempleado = id_tipo;
    }

    public Empleado() {
    }

    public int getId_persona() {
        return id_persona;
    }



    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_tipoempleado() {
        return id_tipoempleado;
    }

    public void setId_tipoempleado(int id_tipoempleado) {
        this.id_tipoempleado = id_tipoempleado;
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
        return "Empleado{" +
                "id_empleado=" + id_empleado +
                ", id_persona=" + id_persona +
                ", id_tipoempleado=" + id_tipoempleado +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                '}';
    }
}
