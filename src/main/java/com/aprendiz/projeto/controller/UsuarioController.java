package com.aprendiz.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aprendiz.projeto.entities.Usuario;
import com.aprendiz.projeto.services.UsuarioService;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<Usuario> procuraTodos() {
        List<Usuario> listaDeUsuario = service.procuraTodos();
        return listaDeUsuario;
    }

    @GetMapping(value = "/{id}")
    public Usuario procuraPorId(@PathVariable Integer id) {
        Usuario response = service.procuraPorId(id);
        return response;
    }

    @PostMapping
    public String adicionaUsuario(@RequestBody Usuario usuario) {
        String response = service.adicionaUsuario(usuario);
        return response;
    }

    @PutMapping(value = "/{id}")
    public String editaUsuario(@PathVariable Integer id, @RequestBody Usuario usuario) {
        String response = service.editarUsuario(id, usuario);
        return response;
    }

    @DeleteMapping(value = "/{id}")
    public void excluiUsuario(@PathVariable Integer id) {
        service.excluirUsuario(id);
    }
}
