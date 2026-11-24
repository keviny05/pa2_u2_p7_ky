package ky.edu.uce.pa.grupo.u2.pedidos.application;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.repository.PagoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PagoService {

    @Inject
    private PagoRepository pagoRepository;

    public void guardar(Pago pago){
        this.pagoRepository.create(pago);
    }

    public Pago buscarPorId(Integer id){
        return this.pagoRepository.read(id);
    }

    public void actualizar(Pago pago){
        this.pagoRepository.update(pago);
    }

    public void eliminar(Integer id){
        this.pagoRepository.delete(id);
    }

}
