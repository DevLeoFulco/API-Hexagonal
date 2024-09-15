package com.devleofulco.hexagonal.hexagonal_api.application.port;

import com.devleofulco.hexagonal.hexagonal_api.domain.model.Metodo;

import java.util.List;
import java.util.Optional;

public interface MetodoRepositoryPort {
    Metodo save (Metodo metodo);
    List<Metodo> findAll();
    Optional<Metodo> findById(Integer id);
    Metodo update(Metodo metodo);
    void deleteById(Integer id);
}
