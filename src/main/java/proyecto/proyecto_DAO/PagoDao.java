package proyecto.proyecto_DAO;

import proyecto.proyecto_models.MetodoPago;
import proyecto.proyecto_models.Pago;
import proyecto.proyecto_utils.Crud;

import java.util.List;

public class PagoDao {

    Crud<Pago> pagoCrud = new Crud<>(Pago.class);
    public Pago registrarPago(Pago obj){
        return pagoCrud.create(obj);
    }

    public Pago actualizarPago(Pago obj){
        return pagoCrud.update(obj);
    }

    public void eliminarPago(int id){
        pagoCrud.delete(id);
    }

    public Pago getPago(int id){
        return pagoCrud.findById(id);
    }

    public Pago getPagoByIdPedido(int id){
        Pago pago = new Pago();
        pago.setIdPedido(id);
        return pagoCrud.findByFields(pago, "idPedido");
    }
    public List<Pago> listaPago(){
        return pagoCrud.readAll();
    }


    Crud<MetodoPago> metodoPagoCrud = new Crud<>(MetodoPago.class);
    public List<MetodoPago> listaMetodoPago(){
        return metodoPagoCrud.readAll();
    }
}
