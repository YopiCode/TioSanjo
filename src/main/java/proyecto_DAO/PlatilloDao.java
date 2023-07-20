
package proyecto_DAO;


import proyecto_models.Persona;
import proyecto_models.Platillo;
import proyecto_utils.Crud;

import java.util.List;

public class PlatilloDao {
    Crud<Platillo> platilloCrud = new Crud<>(Platillo.class);
    public Platillo registrarPlatillo(Platillo obj){
        return platilloCrud.create(obj);
    }

    public Platillo actualizarPlatillo(Platillo obj){
        return platilloCrud.update(obj);
    }

    public void eliminarPlatillo(int id){
        platilloCrud.delete(id);
    }

    public Platillo getPlatillo(int id){
        return platilloCrud.findById(id);
    }

    public List<Platillo> listaPlatillo(){
        return platilloCrud.readAll();
    }
}
