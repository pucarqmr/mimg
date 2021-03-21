package br.pucminas.pos.tcc.mimg.service.impl;

import br.pucminas.pos.tcc.mimg.client.IBGEClient;
import br.pucminas.pos.tcc.mimg.dto.PesquisaDTO;
import br.pucminas.pos.tcc.mimg.exception.NoDataFoundException;
import br.pucminas.pos.tcc.mimg.service.PesquisasService;
import br.pucminas.pos.tcc.mimg.util.MessagesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PesquisasServiceImpl implements PesquisasService {

    private final IBGEClient ibgeClient;

    @Autowired
    public PesquisasServiceImpl(IBGEClient ibgeClient) {
        this.ibgeClient = ibgeClient;
    }

    @Override
    public PesquisaDTO getPesquisaByType(Integer type) throws NoDataFoundException {
        try {
            return ibgeClient.getPesquisaByType(type);
        } catch (Exception e) {
            throw new NoDataFoundException(MessagesUtil.PESQUISAS_NAO_ENCONTRADAS);
        }
    }
}
