package br.pucminas.pos.tcc.mimg.resource;

import br.pucminas.pos.tcc.mimg.dto.PesquisaDTO;
import br.pucminas.pos.tcc.mimg.exception.NoDataFoundException;
import br.pucminas.pos.tcc.mimg.service.PesquisasService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(value = "http://localhost:4200")
@RequestMapping(value = "/indicadores")
public class PesquisaResource {

    private final PesquisasService pesquisasService;

    public PesquisaResource(PesquisasService pesquisasService) {
        this.pesquisasService = pesquisasService;
    }

    @GetMapping(value = "/pesquisas/{type}")
    ResponseEntity<PesquisaDTO> getPesquisasByType(@PathVariable(value = "type") Integer type) throws NoDataFoundException {
        return ResponseEntity.ok(pesquisasService.getPesquisaByType(type));
    }

}
