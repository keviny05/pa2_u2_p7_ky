package ky.edu.uce.pa.grupo.u2.pedidos.application;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;
import ky.edu.uce.pa.grupo.u2.pedidos.domain.repository.ClienteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ClienteService {

    @Inject
    private ClienteRepository clienteRepository;

    public void guardar(Cliente cliente){
        this.clienteRepository.create(cliente);
    }

    public Cliente buscarPorId(Integer id){
        return this.clienteRepository.read(id);
    }

    public void actualizar(Cliente cliente){
        this.clienteRepository.update(cliente);
    }

    public void eliminar(Integer id){
        this.clienteRepository.delete(id);
    }

}
