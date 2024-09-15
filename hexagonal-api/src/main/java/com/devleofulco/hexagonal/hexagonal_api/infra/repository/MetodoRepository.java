package com.devleofulco.hexagonal.hexagonal_api.infra.repository;

import com.devleofulco.hexagonal.hexagonal_api.application.port.MetodoRepositoryPort;
import com.devleofulco.hexagonal.hexagonal_api.domain.model.Metodo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodoRepository extends JpaRepository<Metodo, Integer>, MetodoRepositoryPort {

}
