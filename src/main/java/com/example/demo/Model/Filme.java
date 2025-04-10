package  com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data

@Entity
@Table(name = "CadFilmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String diretor;

    private LocalDate dataLancamento;

    private String classificacaoEtaria;

    private Integer duracaoMin;

    private Float notaMedia;

    private Boolean disponivel;

    @ManyToOne
    @JoinColumn(name = "genero_id",nullable = false)
    private Generos genero;

}
