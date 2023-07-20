package proyecto_DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto_models.Empleado;
import proyecto_utils.Crud;

import static proyecto_utils.Conexion.conectar;

public class EmpleadoDao {
    Crud<Empleado> empleadoCrud = new Crud<>(Empleado.class);
    Empleado empleado = new Empleado();

    public boolean verificarCredenciales(Empleado empleado) {
        return empleadoCrud.findByFields(empleado, "usuario", "clave") != null;
    }

    public Empleado registrarEmpleado(Empleado empleado){
        return empleadoCrud.create(empleado);
    }

    public Empleado actualizarEmpleado(Empleado empleado){
        return empleadoCrud.update(empleado);
    }

    public void eliminarEmpleado(int id){
        empleadoCrud.delete(id);
    }

    public List<Empleado> listaMozos(){
        empleado.setId_tipoempleado(1);
        return empleadoCrud.findByAllFields(empleado, "id_tipoempleado");
    }

    public Empleado getEmpleado(int id){
        return empleadoCrud.findById(id);
    }

    public List<Empleado> listaEmpleados(){
        return empleadoCrud.readAll();
    }

}
