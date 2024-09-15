package com.devleofulco.hexagonal.hexagonal_api.application.web.request;

import jakarta.validation.constraints.NotBlank;

public class MetodoRequest {
    private Integer id;

    @NotBlank(message = "O nome não pode estar vazio.")
    private String nome;

    private String descricao;

    @NotBlank(message = "Os tipos mais utilizados não podem estar vazios.")
    private String tiposMaisUtilizados;

    @NotBlank(message = "O retorno esperado não pode estar vazio.")
    private String retornoEsperado;

    private String exemplo;

    // Construtor padrão
    public MetodoRequest() {}

    // Construtor com parâmetros
    public MetodoRequest(Integer id, String nome, String descricao, String tiposMaisUtilizados, String retornoEsperado, String exemplo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tiposMaisUtilizados = tiposMaisUtilizados;
        this.retornoEsperado = retornoEsperado;
        this.exemplo = exemplo;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTiposMaisUtilizados() {
        return tiposMaisUtilizados;
    }

    public void setTiposMaisUtilizados(String tiposMaisUtilizados) {
        this.tiposMaisUtilizados = tiposMaisUtilizados;
    }

    public String getRetornoEsperado() {
        return retornoEsperado;
    }

    public void setRetornoEsperado(String retornoEsperado) {
        this.retornoEsperado = retornoEsperado;
    }

    public String getExemplo() {
        return exemplo;
    }

    public void setExemplo(String exemplo) {
        this.exemplo = exemplo;
    }
}
