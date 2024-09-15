package com.devleofulco.hexagonal.hexagonal_api.application.web.response;

public class MetodoResponse {
    private Integer id;
    private String nome;
    private String descricao;
    private String tiposMaisUtilizados;
    private String retornoEsperado;
    private String exemplo;

    // Construtor padrão
    public MetodoResponse() {}

    // Construtor com parâmetros
    public MetodoResponse(Integer id, String nome, String descricao, String tiposMaisUtilizados, String retornoEsperado, String exemplo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tiposMaisUtilizados = tiposMaisUtilizados;
        this.retornoEsperado = retornoEsperado;
        this.exemplo = exemplo;
    }

    // Getters e Setters
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
