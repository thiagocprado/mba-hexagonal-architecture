package br.com.fullcycle.hexagonal.application.domain.person;


// Papel no domínio: Value object para nome; encapsula o valor e a validação atualmente definida para ele.

import br.com.fullcycle.hexagonal.application.exceptions.ValidationException;

public record Name(String value) {

    public Name {
        if (value == null) {
            throw new ValidationException("Invalid value for Name");
        }
    }
}
