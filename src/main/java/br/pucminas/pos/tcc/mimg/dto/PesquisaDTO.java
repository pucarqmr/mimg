package br.pucminas.pos.tcc.mimg.dto;

import lombok.Data;

import java.util.List;

@Data
public class PesquisaDTO {

    private Integer id;
    private String nome;
    private String descricao;
    private String contexto;
    private String observacao;
    private List<PeriodoDTO> periodos;

}
