package br.com.fullcycle.hexagonal.application.usecases;


// Papel na arquitetura: Contrato base de um caso de uso que recebe um Input e devolve um Output.

public abstract class UseCase<INPUT, OUTPUT> {

    // 1. Cada caso de uso tem um Input e um Output próprio. Não retorna a entidade, o agregado, ou objeto de valor.
    // 2. O caso de uso implementa o padrão Command

    public abstract OUTPUT execute(INPUT input);
}
