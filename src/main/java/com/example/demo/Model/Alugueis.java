package  com.example.demo.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.time.LocalDateTime;


@Entity // diz que essa class e uma tabela
@Data
@Table(name = "Alugueis")
public class Alugueis {


    @Id // define que o campo abaixo é a chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany // referencia que muitos aluguéis podem estar ligado a um unico cliente
    @JoinColumn(name = "cliente_id", nullable = false)
    // Você está dizendo:"Olha JPA, use a coluna cliente_id da tabela alugueis para se relacionar com a entidade Cliente."
    private Clientes cliente; // associação com a entidade Cliente


    private LocalDateTime dataAluguel = LocalDateTime.now(); // quando criada o objeto a data será criada


    private LocalDateTime dataDevolucaoPrevista;


    private LocalDateTime dataDevolucaoReal;


    @Enumerated(EnumType.STRING)
    private StatusAluguel status = StatusAluguel.EM_ABERTO;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDateTime dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public LocalDateTime getDataDevolucaoReal() {
        return dataDevolucaoReal;
    }

    public void setDataDevolucaoReal(LocalDateTime dataDevolucaoReal) {
        this.dataDevolucaoReal = dataDevolucaoReal;
    }

    public StatusAluguel getStatus() {
        return status;
    }

    public void setStatus(StatusAluguel status) {
        this.status = status;
    }

    // Para definir dataAluguel automaticamente antes de salvar no banco
    @PrePersist
    protected void onCreate() {
        this.dataAluguel = LocalDateTime.now();

    }
}