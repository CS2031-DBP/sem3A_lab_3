package com.example.sem3a_lab_3.persona;


import com.example.sem3a_lab_3.artista.Artista;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    @OneToOne(mappedBy = "persona")
    Artista artista;
}
