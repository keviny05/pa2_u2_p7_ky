package ky.edu.uce.pa.grupo.u2.pedidos.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity 
@Table (name = "mascotas")
public class Mascota {

    @Id 
    @SequenceGenerator (name = "mascota_seq", sequenceName = "mascota_seq_db", allocationSize = 1)
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "mascota_seq")
    @Column (name = "mass_id")
    private String id; 
    
    @Column (name = "mass_nombre")
    private String nombre;

    @Column (name = "mass_raza")
    private String raza;

    @Column (name ="mass_edad")
    private int edad;

    @Column (name = "mass_color")
    private String color;

    
    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public int getEdad() {
        return edad;
    }
    public String getColor() {
        return color;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setColor(String color) {
        this.color = color;
    }

    
}
