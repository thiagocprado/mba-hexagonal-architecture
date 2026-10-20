package br.com.fullcycle.hexagonal.infrastructure.dtos;


// Papel na infraestrutura: DTO de entrada da API para os dados necessários à criação de evento.

public record NewEventDTO(
        String name,
        String date,
        Integer totalSpots,
        String partnerId
) {

}
