package com.example.sem3a_lab_3.persona;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    @GetMapping
    ResponseEntity<List<Persona>> getPersonas() {
        return ResponseEntity.ok(personaRepository.findAll());
    }

    @PostMapping
    ResponseEntity<Persona> createPersona(@RequestBody Persona persona) {
        return ResponseEntity.ok(personaRepository.save(persona));
    }

}
