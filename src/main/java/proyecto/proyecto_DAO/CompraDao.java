package proyecto.proyecto_DAO;

import proyecto.proyecto_models.Compra;
import proyecto.proyecto_utils.Crud;

import java.util.List;

public class CompraDao {

    Crud<Compra> compra = new Crud<>(Compra.class);
    public Compra registraCompra(Compra obj){
        return compra.create(obj);
    }

    public Compra actualizarCompra(Compra obj){
        return compra.update(obj);
    }

    public void eliminaCompra(int id){
        compra.delete(id);
    }

    public Compra getCompra(int id){
        return compra.findById(id);
    }

    public List<Compra> listaCompra(){
        return compra.readAll();
    }

}
