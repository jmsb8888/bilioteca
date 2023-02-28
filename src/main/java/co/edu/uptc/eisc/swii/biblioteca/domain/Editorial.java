package co.edu.uptc.eisc.swii.biblioteca.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Editorial {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public String nombre;
    private String sitioWeb;

    public Integer getId () {
        return id;
    }

    public void setId (Integer id) {
        this.id = id;
    }

    public String getNombre () {
        return nombre;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getSitioWeb () {
        return sitioWeb;
    }

    public void setSitioWeb (String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }
}
