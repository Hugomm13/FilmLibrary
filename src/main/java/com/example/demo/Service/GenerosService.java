package com.example.demo.Service;

import com.example.demo.Model.Generos;
import com.example.demo.Repository.FilmeRepository;
import com.example.demo.Repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;


public class GenerosService {
    @Autowired
    private GeneroRepository generoRepository;

    public Generos salvar(Generos generos){
        return generoRepository.save(generos);
    }
     public List <Generos> ListGeneros(){
        return generoRepository.findAll();
     }
    public Generos BuscarGeneroId (long id){
        return generoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Filme não encontrado com ID: " + id));
    }
    @PostMapping
    public ResponseEntity<Generos> CadFilme(@RequestBody Generos generos){
        Generos novoGenero = generoRepository.save(generos);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoGenero);
    }
}
