package com.example.sem3a_lab_3.persona;


import com.example.sem3a_lab_3.artista.Artista;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = false)
    private String nombre;

    @Column(name = "apellido", unique = false )
    private String apellido;

    @OneToOne(mappedBy = "persona", cascade = CascadeType.ALL)
    @JoinColumn(name="artista_id")
    @JsonManagedReference
    private Artista artista;
}
