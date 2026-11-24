package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // clase administrada por jakarta persistence
@Table(name = "pagos")
public class Pago {

    public enum Metodo {
        TARJETA,
        TRANSFERENCIA,
        EFECTIVO
    }

    @Id
    @SequenceGenerator(name = "pago_seq", sequenceName = "pago_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pago_seq")
    @Column(name = "pagg_id")
    private Long id;

    @Column(name = "pagg_pedido_id")
    private String pedidoId;

    @Enumerated(EnumType.STRING)
    @Column(name = "pagg_metodo")
    private Metodo metodo;

    @Column(name = "pagg_monto")
    private double monto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
