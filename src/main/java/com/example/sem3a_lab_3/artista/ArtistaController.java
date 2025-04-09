package com.example.sem3a_lab_3.artista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @PostMapping
    ResponseEntity<Artista> createArtist(Artista artista) {
        return ResponseEntity.ok(artistaRepository.save(artista));
    }
}
