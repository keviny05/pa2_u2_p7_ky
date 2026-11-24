package ky.edu.uce.pa.grupo.u2.pedidos.application;

import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;

@ApplicationScoped 
@Transactional 
public class PedidoService {

    @Inject 
    private PedidoRepository pedidoRepoitory;

    public void guardar(Pedido pedido){
        this.pedidoRepoitory.create(pedido);
    }

    public Optional<Pedido> buscarPorId(Integer id){
        return this.pedidoRepoitory.read(id);
    }

    public Optional<Pedido> buscarPorNumero(String numero){
        return this.pedidoRepoitory.readByNumer(numero);
    }

    public void actualizar(Pedido pedido){
        this.pedidoRepoitory.update(pedido);
    }

    public void eliminar(Integer id){
        this.pedidoRepoitory.delete(id);
    }

}