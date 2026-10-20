package br.com.fullcycle.hexagonal.application.domain.person;


// Papel no domínio: Value object para e-mail; valida o formato definido pelo projeto ao ser criado.

import br.com.fullcycle.hexagonal.application.exceptions.ValidationException;

public record Email(String value) {

    public Email {
        if (value == null || !value.matches("^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$")) {
            throw new ValidationException("Invalid value for Email");
        }
    }
}
