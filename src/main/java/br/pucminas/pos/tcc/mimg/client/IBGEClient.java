package br.pucminas.pos.tcc.mimg.client;

import br.pucminas.pos.tcc.mimg.dto.PesquisaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "ibge-api", url = "${ibge.api.url}")
public interface IBGEClient {

    @GetMapping(value = "/pesquisas/{type}")
    PesquisaDTO getPesquisaByType(@PathVariable() Integer type);

}

