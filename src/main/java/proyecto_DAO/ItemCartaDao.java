package proyecto_DAO;

import proyecto_models.Insumo;
import proyecto_models.ItemCarta;
import proyecto_models.Preparacion;
import proyecto_models.TipoInsumo;
import proyecto_utils.Crud;

import java.util.List;

public class ItemCartaDao {

    Crud<ItemCarta> itemCartaCrud = new Crud<>(ItemCarta.class);
    public ItemCarta registraItemCarta(ItemCarta obj){
        return itemCartaCrud.create(obj);
    }

    public ItemCarta actualizarItemCarta(ItemCarta obj){
        return itemCartaCrud.update(obj);
    }

    public void eliminaItemCarta(int id){
        itemCartaCrud.delete(id);
    }

    public ItemCarta getItemCarta(int id){
        return itemCartaCrud.findById(id);
    }

    public List<ItemCarta> listaItemCarta(){
        return itemCartaCrud.readAll();
    }

    Crud<Preparacion> preparacionCrud = new Crud<>(Preparacion.class);
    public Preparacion registrarPreparacion(Preparacion obj){
        return preparacionCrud.create(obj);
    }
    public List<Preparacion> getPreparacionByIdItem(ItemCarta itemCarta){
        Preparacion preparacion = new Preparacion();
        preparacion.setIdItem(itemCarta.getId());
        return preparacionCrud.findByAllFields(preparacion, "idItem");
    }

}
