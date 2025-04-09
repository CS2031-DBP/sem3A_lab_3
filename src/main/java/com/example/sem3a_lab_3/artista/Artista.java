package com.example.sem3a_lab_3.artista;

import com.example.sem3a_lab_3.persona.Persona;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @OneToOne
    @JoinColumn(name = "persona_id")
    @JsonBackReference
    private Persona persona;

}
