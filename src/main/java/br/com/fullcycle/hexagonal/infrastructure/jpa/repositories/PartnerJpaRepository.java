package br.com.fullcycle.hexagonal.infrastructure.jpa.repositories;


// Papel na infraestrutura: Interface Spring Data JPA que fornece consultas e persistência de PartnerEntity para o adaptador de banco.

import br.com.fullcycle.hexagonal.infrastructure.jpa.entities.PartnerEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface PartnerJpaRepository extends CrudRepository<PartnerEntity, UUID> {

    Optional<PartnerEntity> findByCnpj(String cnpj);

    Optional<PartnerEntity> findByEmail(String email);
}