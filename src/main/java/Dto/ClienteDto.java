package Dto;

import lombok.Data;
import java.time.LocalDate;


@Data // para gerar os get,set,tostring,equals,hashCode
public class ClienteDto {

    // ID pode ser útil para atualizar ou exibir clientes
    private Long id;

    // Nome do cliente, campo essencial
    private String nome;

    // E-mail usado para contato ou login, por exemplo
    private String email;

    // Telefone de contato do cliente
    private String telefone;

    // Data de nascimento, pode ser usada para validar idade, por exemplo
    private LocalDate dataNascimento;

    // CPF pode ser necessário no cadastro, mas pense bem se você vai expor isso em todo lugar
    private String cpf;

    // Endereço pode ser importante para entrega ou cadastro
    private String endereco;


}
