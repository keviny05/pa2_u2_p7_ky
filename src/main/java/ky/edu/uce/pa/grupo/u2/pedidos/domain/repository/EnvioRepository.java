package ky.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Envio;

public interface EnvioRepository {

    //Create
    public void create(Envio envio);

    //Read por Id
    public Envio read(Integer id);

    //Update
    public void update(Envio envio);

    //Delete
    public void delete(Integer id);

}
