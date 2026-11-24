package ky.edu.uce.pa.grupo.u2.pedidos.infraestructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
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
    public Optional<Pedido> read(Integer id) {
        Pedido pedido = this.entityManager.find(Pedido.class, id);
        return Optional.ofNullable(pedido);
    }

    @Override
    public void update(Pedido pedido) {
        this.entityManager.merge(pedido);
    }

    @Override
    public void delete(Integer id) {
        Optional<Pedido> pedido = this.read(id);
        pedido.ifPresent(this.entityManager::remove);
    }

    @Override
    public Optional<Pedido> readByNumer(String numero) {
        TypedQuery<Pedido> query = this.entityManager.createQuery("SELECT p FROM Pedido p WHERE p.numero = :numeroVariable", Pedido.class);
        query.setParameter("numeroVariable", numero);
        return Optional.ofNullable(query.getSingleResult());
    
    }

    @Override
    public List<Pedido> readAll() {
        return null;
    }

}
