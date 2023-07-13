package proyecto_models;

import java.util.Date;

public class Persona {

    private int id_persona;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private int genero;
    private String direcion;
    private int telefono;
    private String correo;
    private int dni;

    public Persona(int id, String nombre, String apellido, Date fechaNacimiento, int genero, String direcion, int telefono, String correo, int dni) {
        this.id_persona = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direcion = direcion;
        this.telefono = telefono;
        this.correo = correo;
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, Date fechaNacimiento, int genero, String direcion, int telefono, String correo, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direcion = direcion;
        this.telefono = telefono;
        this.correo = correo;
        this.dni = dni;
    }

    public Persona() {
    }
    
    

    public int getId() {
        return id_persona;
    }

    public void setId(int id) {
        this.id_persona = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getDirecion() {
        return direcion;
    }

    public void setDirecion(String direcion) {
        this.direcion = direcion;
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
        return "Persona{" + "id=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", direcion=" + direcion + ", telefono=" + telefono + ", correo=" + correo + ", dni=" + dni + '}';
    }

}
