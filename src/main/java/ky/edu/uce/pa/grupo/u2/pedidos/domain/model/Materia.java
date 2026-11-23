package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity // clase administrada por jakarta persistence
@Table(name = "materias")
public class Materia {

    @Id
    @SequenceGenerator(name = "materia_seq", sequenceName = "materia_seq_db", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "materia_seq")
    @Column(name = "matt_id")
    private String id;

    @Column(name = "matt_nombre")
    private String nombre;

    @Column(name = "matt_codigo")
    private String codigo;

    @Column(name = "matt_credito")
    private String credito;

    @Column(name = "matt_carrera")
    private String carrera;

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCredito() {
        return credito;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

}
