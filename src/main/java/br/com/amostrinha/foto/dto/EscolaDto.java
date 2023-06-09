package br.com.amostrinha.foto.dto;

import br.com.amostrinha.foto.model.Escola;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class EscolaDto {
        private final String nome;
        private final String diretora;

        public EscolaDto(Escola escola){
            this.nome = escola.getNome();
            this.diretora = escola.getDiretora();
        }
        public static List<EscolaDto> converter(List<Escola> escolas){
            return  escolas.stream().map(EscolaDto::new).collect(Collectors.toList());
        }

    public static EscolaDto converterum(Escola escola) {
            return  new EscolaDto(escola);
    }
}
