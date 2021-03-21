package br.pucminas.pos.tcc.mimg.dto;

import lombok.Data;

import java.util.Collection;

@Data
public class PeriodoDTO {

    //    [
//    {
//        periodo:
//        string
//        Período ao qual se refere
//
//        publicacao:
//        string
//        Data na qual será publicado o período pesquisado - Possui o formato dd/MM/yyyy HH:mm:ss
//
//        versao:
//        number
//        Versão dos indicadores vinculados ao período pesquisado. Períodos pesquisados com diferentes versões NÃO compartilham os mesmos indicadores
//
//        fonte:
//[
//        string
//]
//        nota:
//[
//        string
//]
//]

    private Collection<String> fonte;
    private Collection<String> nota;
    private String periodo;
    private Integer versao;
    private String publicacao;

}
