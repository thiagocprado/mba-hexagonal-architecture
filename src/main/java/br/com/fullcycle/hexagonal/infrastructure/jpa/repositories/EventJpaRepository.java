package br.com.fullcycle.hexagonal.infrastructure.jpa.repositories;


// Papel na infraestrutura: Interface Spring Data JPA que fornece consultas e persistência de EventEntity para o adaptador de banco.

import br.com.fullcycle.hexagonal.infrastructure.jpa.entities.EventEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventJpaRepository extends CrudRepository<EventEntity, UUID> {

}
