package proyecto_DAO;

import proyecto_models.Mesa;
import proyecto_models.Platillo;
import proyecto_utils.Crud;

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
