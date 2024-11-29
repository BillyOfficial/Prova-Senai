package com.aula.relacionamento.services;

import com.aula.relacionamento.entities.Autor;
import com.aula.relacionamento.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public List<Autor> getAll() {
        return autorRepository.findAll();
    }

    public Autor save(Autor autor) {
        return autorRepository.save(autor);
    }
}