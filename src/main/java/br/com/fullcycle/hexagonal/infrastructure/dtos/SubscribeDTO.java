package br.com.fullcycle.hexagonal.infrastructure.dtos;


// Papel na infraestrutura: DTO de entrada da API com os identificadores de cliente e evento para a reserva.

public record SubscribeDTO(String customerId, String eventId) {
}
