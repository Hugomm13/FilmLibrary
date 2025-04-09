package  com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "AluguelItens")
public class AluguelItens {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    // Muitos itens de aluguel pertencem a um único aluguel
    @ManyToOne
    @JoinColumn(name = "aluguel_id", nullable = false)
    private Alugueis aluguel;

    // Muitos itens de aluguel pertencem a um único filme
    @ManyToOne
    @JoinColumn(name = "filme_id", nullable = false)
    private Filme filme;

    @Column(name = "preco_aluguel", nullable = false)
    private BigDecimal precoAluguel;

}
