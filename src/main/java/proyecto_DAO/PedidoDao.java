package proyecto_DAO;

import proyecto_models.Pedido;
import proyecto_models.Platillo;
import proyecto_utils.Crud;

import java.util.List;

public class PedidoDao {
    Crud<Pedido> pedidoCrudlatilloCrud = new Crud<>(Pedido.class);
    public Pedido registrarPedido(Pedido obj){
        return pedidoCrudlatilloCrud.create(obj);
    }

    public Pedido actualizarPedido(Pedido obj){
        return pedidoCrudlatilloCrud.update(obj);
    }

    public void eliminarPedido(int id){
        pedidoCrudlatilloCrud.delete(id);
    }

    public Pedido getPedido(int id){
        return pedidoCrudlatilloCrud.findById(id);
    }

    public List<Pedido> listaPedido(){
        return pedidoCrudlatilloCrud.readAll();
    }
}
