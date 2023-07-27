package proyecto.proyecto_DAO;

import proyecto.proyecto_models.Cliente;
import proyecto.proyecto_utils.Crud;

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
