
package com.example.demo.Controller;
import com.example.demo.Service.FilmeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Model.Filme;
import java.util.List;
//usada para contactar com a api rest
@RestController
@RequestMapping("/filmes")//end point onde será feito a requisição
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
        return ResponseEntity.ok(filmeService.listarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(filmeService.buscarPorId(id));
    }

}