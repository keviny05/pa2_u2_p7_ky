package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // clase administrada por jakarta persistence
@Table(name = "pedidos") // nombre de la tabla en la base de datos
public class Pedido {

    @Id
    @SequenceGenerator(name = "pedido_seq", sequenceName = "pedido_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_seq")
    @Column(name = "pedd_id") // nombre de la columna en la base de datos
    private Long id;

    @Column(name = "pedd_producto") // nombre de la columna en la base de datos
    private String producto;

    @Column(name = "pedd_precio") // nombre de la columna en la base de datos
    private double precio;

    @Column(name = "pedd_fecha") // nombre de la columna en la base de datos
    private LocalDateTime fecha;

    @Column(name = "pedd_numero")
    private String numero;


    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    

}
