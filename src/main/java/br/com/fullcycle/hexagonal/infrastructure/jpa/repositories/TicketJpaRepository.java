package br.com.fullcycle.hexagonal.infrastructure.jpa.repositories;


// Papel na infraestrutura: Interface Spring Data JPA que fornece consultas e persistência de TicketEntity para o adaptador de banco.

import br.com.fullcycle.hexagonal.infrastructure.jpa.entities.TicketEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface TicketJpaRepository extends CrudRepository<TicketEntity, UUID> {

}
