package com.aula.relacionamento.controllers;

import com.aula.relacionamento.entities.Livro;
import com.aula.relacionamento.services.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public ResponseEntity<List<Livro>> getAll() {
        return ResponseEntity.status(HttpStatus.OK).body(livroService.getAll());
    }

    @PostMapping
    public ResponseEntity<Livro> save(@RequestBody Livro livro) {
        return ResponseEntity.status(HttpStatus.CREATED).body(livroService.save(livro));
    }
}