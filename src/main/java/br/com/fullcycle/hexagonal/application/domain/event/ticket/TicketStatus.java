package br.com.fullcycle.hexagonal.application.domain.event.ticket;


// Papel no domínio: Enum que lista os estados possíveis do ingresso; o fluxo atual cria ingressos como PENDING.

public enum TicketStatus {
    PENDING, PROCESSING, PAID;
}
