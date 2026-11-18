package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

public class Pedido {
    private String id;
    private String producto;
    private double precio;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    


}
