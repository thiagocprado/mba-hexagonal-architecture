package br.com.fullcycle.hexagonal.infrastructure.dtos;


// Papel na infraestrutura: DTO de entrada da API para os dados necessários à criação de parceiro; mantém o formato externo fora do domínio.

public record NewPartnerDTO(String cnpj, String email, String name) {

}
