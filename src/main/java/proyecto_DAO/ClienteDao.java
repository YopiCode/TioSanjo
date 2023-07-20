package proyecto_DAO;

import proyecto_models.Cliente;
import proyecto_models.Empleado;
import proyecto_utils.Crud;

import java.util.List;

public class ClienteDao {
    Crud<Cliente> clienteCrud = new Crud<>(Cliente.class);
    public Cliente registrarCliente(Cliente obj){
        return clienteCrud.create(obj);
    }

    public Cliente actualizarCliente(Cliente obj){
        return clienteCrud.update(obj);
    }

    public void eliminarCliente(int id){
        clienteCrud.delete(id);
    }

    public Cliente getCliente(int id){
        return clienteCrud.findById(id);
    }

    public List<Cliente> listaCliente(){
        return clienteCrud.readAll();
    }

}
