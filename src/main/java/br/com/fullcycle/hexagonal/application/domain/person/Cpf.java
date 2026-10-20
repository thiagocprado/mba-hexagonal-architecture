package br.com.fullcycle.hexagonal.application.domain.person;


// Papel no domínio: Value object para CPF; valida o formato pontuado, sem calcular os dígitos verificadores.

import br.com.fullcycle.hexagonal.application.exceptions.ValidationException;

public record Cpf(String value) {

    public Cpf {
        if (value == null || !value.matches("^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$")) {
            throw new ValidationException("Invalid value for Cpf");
        }
    }
}
