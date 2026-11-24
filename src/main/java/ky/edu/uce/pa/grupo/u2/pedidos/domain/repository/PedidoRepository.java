package ky.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;

public interface PedidoRepository {

    //Create
    public void create(Pedido pedido);

    //Read por Id
    public Pedido read(Integer id);

    //Update
    public void update(Pedido pedido);

    //Delete
    public void delete(Integer id);

}
