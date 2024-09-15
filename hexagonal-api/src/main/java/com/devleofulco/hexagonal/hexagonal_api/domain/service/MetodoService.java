package com.devleofulco.hexagonal.hexagonal_api.domain.service;

import com.devleofulco.hexagonal.hexagonal_api.domain.model.Metodo;

import java.util.List;

public interface MetodoService {
    Metodo adicionarMetodo(Metodo metodo);
    List<Metodo> listarMetodos();
    Metodo obterMetodoPorId(Integer id);
    Metodo atualizarMetodo(Metodo metodo);
    void removerMetodo(Integer id);
}
