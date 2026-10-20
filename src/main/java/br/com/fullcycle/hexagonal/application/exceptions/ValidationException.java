package br.com.fullcycle.hexagonal.application.exceptions;


// Papel na aplicação/domínio: Exceção de validação usada para representar dados inválidos ou regras de negócio não atendidas.

public class ValidationException extends RuntimeException {

    public ValidationException(final String message) {
        super(message, null, true, false);
    }

    public ValidationException(final String message, final Throwable cause) {
        super(message, cause, true, false);
    }
}
