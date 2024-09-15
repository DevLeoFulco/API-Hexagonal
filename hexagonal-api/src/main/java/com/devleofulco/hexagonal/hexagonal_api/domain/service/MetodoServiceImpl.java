package com.devleofulco.hexagonal.hexagonal_api.domain.service;

import com.devleofulco.hexagonal.hexagonal_api.application.port.MetodoRepositoryPort;
import com.devleofulco.hexagonal.hexagonal_api.domain.model.Metodo;

import java.util.List;

public class MetodoServiceImpl implements MetodoService {
    private final MetodoRepositoryPort metodoRepositoryPort;

    public MetodoServiceImpl(MetodoRepositoryPort metodoRepositoryPort) {
        this.metodoRepositoryPort = metodoRepositoryPort;
    }

    @Override
    public Metodo adicionarMetodo(Metodo metodo) {
        return metodoRepositoryPort.save(metodo);
    }

    @Override
    public List<Metodo> listarMetodos() {
        return metodoRepositoryPort.findAll();
    }

    @Override
    public Metodo obterMetodoPorId(Integer id) {
        return metodoRepositoryPort.findById(id).orElse(null);
    }

    @Override
    public Metodo atualizarMetodo(Metodo metodo) {
        return metodoRepositoryPort.update(metodo);
    }

    @Override
    public void removerMetodo(Integer id) {
        metodoRepositoryPort.deleteById(id);
    }
}
