package br.com.fullcycle.hexagonal.infrastructure;


// Papel no teste: Verifica que o contexto Spring Boot consegue iniciar com a configuração da aplicação.

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest
class MainTests {

	@Test
	void contextLoads() {
	}

}
