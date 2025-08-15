package com.example.Examen1Back2.modelos;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Curso {

    @Id //Se completa @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY) //Se completa @GeneratedValue
    private Integer id;
    private String nombre; //Se agrega ;

    @ManyToOne
    @JoinColumn(name="fk_docente", referencedColumnName = "id") //Se le quita el ;
    @JsonBackReference(value = "docente-curso")
    Docente docente;

    public Curso() {
    }

    public Curso(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //Se agregan Getters y Setters

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }
}
