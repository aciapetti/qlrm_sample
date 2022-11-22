package it.deepcyber.sample.data.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.deepcyber.sample.data.entities.Investigation;
import it.deepcyber.sample.data.repositories.custom.InvestigationRepositoryCustom;

@Repository
public interface InvestigationRepository extends JpaRepository<Investigation, UUID>, InvestigationRepositoryCustom {

}
