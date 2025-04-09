package com.example.demo.Controller;
import com.example.demo.Service.FilmeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Model.Filme;
import com.example.demo.Service;
import java.util.List;


@RestController
@RequestMapping("/filmes")
@RequiredArgsConstructor
public class FilmeController {

    private final FilmeService filmeService;


    @PostMapping
    public ResponseEntity<Filme> criar(@RequestBody Filme filme) {
        Filme novo = filmeService.salvar(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(novo);
    }

    @GetMapping
    public ResponseEntity<List<Filme>> listarTodos() {
        return ResponseEntity.ok(FilmeService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(FilmeService.buscarPorId(id));
    }

}
