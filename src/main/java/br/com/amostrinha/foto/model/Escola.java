package br.com.amostrinha.foto.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
public class Escola {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String diretora;
    private String contato;

    public Escola(Long id, String nome, String diretora, String contato) {
        this.id = id;
        this.nome = nome;
        this.diretora = diretora;
        this.contato = contato;
    }
}
