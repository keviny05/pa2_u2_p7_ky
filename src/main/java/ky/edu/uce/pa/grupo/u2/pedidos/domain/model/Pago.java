package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;


public class Pago {

    public enum Metodo {
        TARJETA,
        TRANSFERENCIA,
        EFECTIVO
    }

    private String id;
    private String pedidoId;
    private Metodo metodo;
    private double monto;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public void setMetodo(Metodo metodo) {
        this.metodo = metodo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

}