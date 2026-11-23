package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "libros")
public class Libro {

    @Id 
    @SequenceGenerator (name = "libro_seq", sequenceName = "libro_seq_db", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "libro_seq")
    @Column (name = "libb_id")
    private String id;

    @Column (name = "libb_titulo")
    private String titulo;

    @Column (name = "libb_autor")
    private String autor;

    @Column (name = "libb_editorial")
    private String editorial;

    @Column (name = "libb_precio")
    private double precio;
    
    public String getId() {
        return id;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public double getPrecio() {
        return precio;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }


    
}