package com.devleofulco.hexagonal.hexagonal_api.application.web.resource;

import com.devleofulco.hexagonal.hexagonal_api.application.web.response.MetodoResponse;
import com.devleofulco.hexagonal.hexagonal_api.domain.service.MetodoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/v1/metodos")
public class MetodoResource {
    private final MetodoService metodoService;

    public MetodoResource(MetodoService metodoService){
        this.metodoService = metodoService;
    }

    public List<MetodoResponse> listarMetodos(){
        return metodoService.listarMetodos().stream().map(metodo -> new MetodoResponse(
                metodo.getId(),
                metodo.getNome(),
                metodo.getDescricao(),
                metodo.getTiposMaisUtilizados(),
                metodo.getRetornoEsperado(),
                metodo.getExemplo())).collect(Collectors.toList()
        );
    }


}
