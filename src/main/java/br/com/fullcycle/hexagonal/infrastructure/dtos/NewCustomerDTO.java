package br.com.fullcycle.hexagonal.infrastructure.dtos;


// Papel na infraestrutura: DTO de entrada da API para os dados necessários à criação de cliente; mantém o formato externo fora do domínio.

public record NewCustomerDTO(String cpf, String email, String name) {

}
