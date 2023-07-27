package proyecto_DAO;

import proyecto_models.DetallePedido;
import proyecto_models.Pedido;
import proyecto_models.TipoPedido;
import proyecto_utils.Crud;

import java.util.List;

public class PedidoDao {

    Crud<Pedido> pedidoCrud = new Crud<>(Pedido.class);
    public Pedido registraPedido(Pedido obj){
        return pedidoCrud.create(obj);
    }

    public Pedido actualizarIPedido(Pedido obj){
        return pedidoCrud.update(obj);
    }

    public void eliminaPedido(int id){
        pedidoCrud.delete(id);
    }

    public Pedido getPedido(int id){
        return pedidoCrud.findById(id);
    }

    public List<Pedido> listaPedido(){
        return pedidoCrud.readAll();
    }

    public List<Pedido> listaPedidoByDespacho(){
        Pedido pedido = new Pedido();
        pedido.setDespachado(false);
        return pedidoCrud.findByAllFields(pedido, "despachado");
    }

    Crud<TipoPedido> tipoPedidoCrud = new Crud<>(TipoPedido.class);
    public List<TipoPedido> listaTipoPedido(){
        return tipoPedidoCrud.readAll();
    }

    Crud<DetallePedido> detallePedidoCrud = new Crud<>(DetallePedido.class);
    public List<DetallePedido> listaDetallePedidoByIdPedido(int id){
        DetallePedido detallePedido = new DetallePedido();
        detallePedido.setIdPedido(id);
        return detallePedidoCrud.findByAllFields(detallePedido, "idPedido");
    }
    public DetallePedido registraDetallePedido(DetallePedido obj){
        return detallePedidoCrud.create(obj);
    }
}
