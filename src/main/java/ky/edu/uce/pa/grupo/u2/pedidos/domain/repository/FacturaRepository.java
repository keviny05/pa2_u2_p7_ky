package ky.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Factura;

public interface FacturaRepository {

    //Create
    public void create(Factura factura);

    //Read por Id
    public Factura read(Integer id);

    //Update
    public void update(Factura factura);

    //Delete
    public void delete(Integer id);

}
