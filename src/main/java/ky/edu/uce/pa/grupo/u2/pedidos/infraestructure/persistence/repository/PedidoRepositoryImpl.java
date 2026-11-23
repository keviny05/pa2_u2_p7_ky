package ky.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pedido;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.repository.PedidoRepository;

@ApplicationScoped
public class PedidoRepositoryImpl implements PedidoRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public void create(Pedido pedido) {
        this.entityManager.persist(pedido);
    }

    @Override
    public Pedido read(Integer id) {
        return this.entityManager.find(Pedido.class, id);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Pedido pedido = this.read(id);
        this.entityManager.remove(pedido);
    }

}
