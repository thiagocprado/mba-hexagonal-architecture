package br.com.fullcycle.hexagonal.infrastructure.jpa.repositories;


// Papel na infraestrutura: Interface Spring Data JPA que fornece consultas e persistência de CustomerEntity para o adaptador de banco.

import br.com.fullcycle.hexagonal.infrastructure.jpa.entities.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface CustomerJpaRepository extends CrudRepository<CustomerEntity, UUID> {

    Optional<CustomerEntity> findByCpf(String cpf);

    Optional<CustomerEntity> findByEmail(String email);
}
