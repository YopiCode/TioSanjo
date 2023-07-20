package proyecto_DAO;

import proyecto_models.Cliente;
import proyecto_models.Persona;
import proyecto_utils.Crud;

import java.util.List;

public class PersonaDao {

    Crud<Persona> personaCrud = new Crud<>(Persona.class);
    public Persona registrarPersona(Persona obj){
        return personaCrud.create(obj);
    }

    public Persona actualizarPersona(Persona obj){
        return personaCrud.update(obj);
    }

    public void eliminarPersona(int id){
        personaCrud.delete(id);
    }

    public Persona getPersona(int id){
        return personaCrud.findById(id);
    }

    public List<Persona> listaPersona(){
        return personaCrud.readAll();
    }
}
