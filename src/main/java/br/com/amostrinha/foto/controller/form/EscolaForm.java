package br.com.amostrinha.foto.controller.form;

import br.com.amostrinha.foto.model.Escola;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EscolaForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String diretora;
    private String contato;

    public Escola converter(EscolaForm form){
        return Escola.builder()
                .id((form.getId()))
                .nome(form.getNome())
                .diretora(form.getDiretora())
                .contato(form.getContato())
                .build();
    }
}
