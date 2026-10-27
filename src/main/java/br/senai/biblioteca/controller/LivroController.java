package br.senai.biblioteca.controller;

import br.senai.biblioteca.model.Livro;
import br.senai.biblioteca.service.LivroService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService livroService;

    public LivroController(LivroService livroService) {
        this.livroService = livroService;
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarTodos() {
        return ResponseEntity.ok(livroService.listarTodos());
    }

    @PostMapping("/cadastrar")
    public ResponseEntity<Livro> cadastrar(@RequestBody Livro livro) {
        return ResponseEntity.ok(livroService.cadastrar(livro));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(livroService.buscarPorId(id));
    }

    @PutMapping("/alterar/{id}")
    public ResponseEntity<Livro> alterar(
            @PathVariable Long id,
            @RequestBody Livro livro) {

        return ResponseEntity.ok(livroService.alterar(id, livro));
    }
}