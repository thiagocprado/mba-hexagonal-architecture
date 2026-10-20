package br.com.fullcycle.hexagonal.infrastructure;


// Papel na infraestrutura: Ponto de entrada do Spring Boot; inicia a aplicação e sua configuração automática.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}