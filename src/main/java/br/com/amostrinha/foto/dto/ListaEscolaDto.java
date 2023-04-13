package br.com.amostrinha.foto.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListaEscolaDto {
    private List<EscolaDto> escolas;

    public ListaEscolaDto(List<EscolaDto> escolas){
        this.escolas = escolas;
    }

}
