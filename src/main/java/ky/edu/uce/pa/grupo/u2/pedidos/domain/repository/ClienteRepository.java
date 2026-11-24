package ky.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Cliente;

public interface ClienteRepository {

    //Create
    public void create(Cliente cliente);

    //Read por Id
    public Cliente read(Integer id);

    //Update
    public void update(Cliente cliente);

    //Delete
    public void delete(Integer id);

}
