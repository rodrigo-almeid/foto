package br.com.amostrinha.foto.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Foto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private CaminhoFoto caminhofoto;
    @ManyToOne
    private  Aluno aluno;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public CaminhoFoto getCaminhofoto() {
        return caminhofoto;
    }

    public void setCaminhofoto(CaminhoFoto caminhofoto) {
        this.caminhofoto = caminhofoto;
    }

}
