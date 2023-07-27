package proyecto.proyecto_DAO;

import java.util.List;

import proyecto.proyecto_models.Empleado;
import proyecto.proyecto_models.TipoEmpleado;
import proyecto.proyecto_utils.Crud;

public class EmpleadoDao {
    Crud<Empleado> empleadoCrud = new Crud<>(Empleado.class);
    Empleado empleado = new Empleado();

    public Empleado verificarCredenciales(Empleado empleado) {
        return empleadoCrud.findByFields(empleado, "usuario", "clave", "idTipoEmpleado");
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
        empleado.setIdTipoEmpleado(1);
        return empleadoCrud.findByAllFields(empleado, "idTipoEmpleado");
    }

    public Empleado getEmpleado(int id){
        return empleadoCrud.findById(id);
    }

    public List<Empleado> listaEmpleados(){
        return empleadoCrud.readAll();
    }


    Crud<TipoEmpleado> tipoEmpleadoCrud = new Crud<>(TipoEmpleado.class);
    public List<TipoEmpleado> listatIPOEmpleados(){
        return tipoEmpleadoCrud.readAll();
    }
}
