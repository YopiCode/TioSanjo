package proyecto_DAO;

import proyecto_models.Insumo;
import proyecto_models.TipoInsumo;
import proyecto_utils.Crud;

import java.util.List;

public class InsumoDao {

    Crud<Insumo> insumoCrud = new Crud<>(Insumo.class);
    public Insumo registraInsumo(Insumo obj){
        return insumoCrud.create(obj);
    }

    public Insumo actualizarInsumo(Insumo obj){
        return insumoCrud.update(obj);
    }

    public void eliminaInsumo(int id){
        insumoCrud.delete(id);
    }

    public Insumo getInsumo(int id){
        return insumoCrud.findById(id);
    }

    public List<Insumo> listaInsumo(){
        return insumoCrud.readAll();
    }

    public List<Insumo> listaInsumoOtros(){
        Insumo insumo = new Insumo();
        insumo.setIdTipoInsumo(2);
        return insumoCrud.findByAllFields(insumo, "idTipoInsumo");
    }

    public List<Insumo> listaInsumoCocina(){
        Insumo insumo = new Insumo();
        insumo.setIdTipoInsumo(1);
        return insumoCrud.findByAllFields(insumo, "idTipoInsumo");
    }

    Crud<TipoInsumo> tipoInsumoCrud = new Crud<>(TipoInsumo.class);
    public List<TipoInsumo> listaTipoInsumo(){
        return tipoInsumoCrud.readAll();
    }
}
