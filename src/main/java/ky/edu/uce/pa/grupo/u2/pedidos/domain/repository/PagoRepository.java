package ky.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Pago;

public interface PagoRepository {

    //Create
    public void create(Pago pago);

    //Read por Id
    public Pago read(Integer id);

    //Update
    public void update(Pago pago);

    //Delete
    public void delete(Integer id);

}
