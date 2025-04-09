package  com.example.demo.Service;
import com.example.demo.Model.Filme;
import com.example.demo.Repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class FilmeService {
    @Autowired
    private FilmeRepository filmeRepository;

    public Filme salvar(Filme filme){
        return filmeRepository.save(filme);
    }























}
