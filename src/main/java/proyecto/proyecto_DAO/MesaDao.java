package proyecto.proyecto_DAO;

import proyecto.proyecto_models.Mesa;
import proyecto.proyecto_utils.Crud;

import java.util.List;

public class MesaDao {

    Crud<Mesa> mesaCrud = new Crud<>(Mesa.class);
    public Mesa registrarMesa(Mesa obj){
        return mesaCrud.create(obj);
    }

    public Mesa actualizarMesa(Mesa obj){
        return mesaCrud.update(obj);
    }

    public void eliminarMesa(int id){
        mesaCrud.delete(id);
    }

    public Mesa getMesa(int id){
        return mesaCrud.findById(id);
    }

    public List<Mesa> listaMesa(){
        return mesaCrud.readAll();
    }

}
