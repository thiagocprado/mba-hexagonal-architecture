package br.com.fullcycle.hexagonal;


// Papel no teste: Configuração base dos testes de integração, que exercitam componentes conectados com persistência de teste.

import br.com.fullcycle.hexagonal.infrastructure.Main;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test")
@SpringBootTest(classes = Main.class)
public abstract class IntegrationTest {
}
