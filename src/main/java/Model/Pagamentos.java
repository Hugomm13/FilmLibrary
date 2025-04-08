package Model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Pagamentos")
public class Pagamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // Muitos pagamentos para um aluguel
    @JoinColumn(name = "aluguel_id", nullable = false)
    private Alugueis aluguel;

    private LocalDateTime dataPagamento;

    @Column(nullable = false)
    private BigDecimal valorPago;

    private String metodoPagamento;

    // Define a data de pagamento automaticamente ao salvar
    @PrePersist
    protected void onCreate() {
        this.dataPagamento = LocalDateTime.now();
    }
}
