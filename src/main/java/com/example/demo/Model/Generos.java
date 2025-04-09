package  com.example.demo.Model;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "Generos")
public class Generos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String nome;

    // Mapeamento reverso (opcional, só se quiser acessar todos os filmes de um gênero)
    @OneToMany(mappedBy = "genero")
    private List<Filme> filmes;
}
