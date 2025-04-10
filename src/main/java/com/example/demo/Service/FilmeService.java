package  com.example.demo.Service;
import com.example.demo.Model.Filme;
import com.example.demo.Repository.FilmeRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public Filme salvar(Filme filme){
        return filmeRepository.save(filme);
    }

    public List <Filme> listarTodos (){
        return filmeRepository.findAll();
    }

    public Filme buscarPorId(Long id){
        return filmeRepository.findById(id)
        .orElseThrow(() -> new RuntimeException("Filme não encontrado com ID: " + id));
    }
    public ResponseEntity<Filme> CadFilme(@RequestBody Filme filme){
        Filme NovoFilme = filmeRepository.save(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(NovoFilme);
    }
}
