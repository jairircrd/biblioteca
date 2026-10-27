package br.senai.biblioteca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SistemaController {

    @GetMapping("/")
    public String inicio() {
        return "Bem-vindo à API da Biblioteca";
    }

    @GetMapping("/documentacao")
    public String documentacao() {
        return """
                Endpoints disponíveis:

                GET /
                GET /livros
                POST /livros/cadastrar
                GET /livros/{id}
                PUT /livros/alterar/{id}
                GET /documentacao
                """;
    }
}