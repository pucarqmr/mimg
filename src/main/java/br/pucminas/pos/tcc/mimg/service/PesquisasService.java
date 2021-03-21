package br.pucminas.pos.tcc.mimg.service;

import br.pucminas.pos.tcc.mimg.dto.PesquisaDTO;
import br.pucminas.pos.tcc.mimg.exception.NoDataFoundException;

public interface PesquisasService {

    PesquisaDTO getPesquisaByType(Integer type) throws NoDataFoundException;

}
