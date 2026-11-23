package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity //clase administrada por jakarta persistence
@Table(name = "tratamientos")
public class Tratamiento {

    @Id 
    @SequenceGenerator(name = "tratamiento_seq", sequenceName = "tratamiento_seq_db", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "tratamiento_seq")
    @Column (name = "trat_id")
    private String id;

    @Column (name = "trat_nombre")
    private String nombre;

    @Column (name = "trat_descripcion")
    private String descripcion;

    @Column (name = "trat_valor")
    private double valor;

    @Column (name = "trat_duracion")
    private String duracion;
    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getValor() {
        return valor;
    }
    public String getDuracion() {
        return duracion;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    
}
