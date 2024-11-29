package com.aula.relacionamento.controllers;

import com.aula.relacionamento.entities.Autor;
import com.aula.relacionamento.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<List<Autor>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(autorService.getAll());
    }

    @PostMapping
    public ResponseEntity<Autor> save(@RequestBody Autor autor) {
        return ResponseEntity.status(HttpStatus.CREATED).body(autorService.save(autor));
    }
}