package ky.edu.uce.pa.grupo.u2.pedidos.domain.repository;

import ky.edu.uce.pa.grupo.u2.pedidos.domain.model.Producto;

public interface ProductoRepository {

    //Create
    public void create(Producto producto);

    //Read por Id
    public Producto read(Integer id);

    //Update
    public void update(Producto producto);

    //Delete
    public void delete(Integer id);

}
