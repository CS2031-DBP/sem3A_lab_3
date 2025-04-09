package com.example.sem3a_lab_3.artista;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/artista")
public class ArtistaController {

    @Autowired
    ArtistaRepository artistaRepository;

    @PostMapping
    ResponseEntity<Artista> createArtist(@RequestBody Artista artista) {
        return ResponseEntity.ok(artistaRepository.save(artista));
    }

    @GetMapping("/{id}")
    ResponseEntity<Artista> getArtist(@PathVariable Long id){
        Optional<Artista> artista = artistaRepository.findById(id);
        if(artista.isPresent()){
            return ResponseEntity.ok(artista.get());
        }
        return null;
    }

}
