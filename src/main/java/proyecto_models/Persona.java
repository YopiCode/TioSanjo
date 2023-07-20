package proyecto_models;

import java.util.Date;

public class Persona {

    private int id_persona;
    private String nombre;
    private String apellidos;
    private Date fecha_nacimiento;
    private int genero;
    private String direccion;
    private int telefono;
    private String correo;
    private int dni;

    public Persona(int id, String nombre, String apellido, Date fechaNacimiento, int genero, String direcion, int telefono, String correo, int dni) {
        this.id_persona = id;
        this.nombre = nombre;
        this.apellidos = apellido;
        this.fecha_nacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direcion;
        this.telefono = telefono;
        this.correo = correo;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, Date fechaNacimiento, int genero, String direcion, int telefono, String correo, int dni) {
        this.nombre = nombre;
        this.apellidos = apellido;
        this.fecha_nacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccion = direcion;
        this.telefono = telefono;
        this.correo = correo;
        this.dni = dni;
    }

    public Persona() {
    }


    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id_persona=" + id_persona +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", genero=" + genero +
                ", direccion='" + direccion + '\'' +
                ", telefono=" + telefono +
                ", correo='" + correo + '\'' +
                ", dni=" + dni +
                '}';
    }
}
