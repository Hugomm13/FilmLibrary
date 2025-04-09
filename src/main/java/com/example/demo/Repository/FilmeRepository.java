package  com.example.demo.Repository;

import com.example.demo.Model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

}

