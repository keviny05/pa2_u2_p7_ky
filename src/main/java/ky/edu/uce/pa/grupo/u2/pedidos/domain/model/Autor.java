package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table(name = "autores")
public class Autor {

    @Id 
    @SequenceGenerator(name = "autor_seq", sequenceName = "autor_seq_db", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator =  "autor_seq")
    @Column (name = "autt_id")
    private String id;

    @Column (name = "autt_nombre")
    private String nombre;

    @Column(name = "autt_nacionalidad")
    private String nacionalidad;

    @Column (name = "autt_fechaNacimiento")
    private String fechaNacimiento;

    @Column (name = "autt_fechaFallecimiento")
    private String fechaFallecimiento;

    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getFechaFallecimiento() {
        return fechaFallecimiento;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setFechaFallecimiento(String fechaFallecimiento) {
        this.fechaFallecimiento = fechaFallecimiento;
    }


    
}
