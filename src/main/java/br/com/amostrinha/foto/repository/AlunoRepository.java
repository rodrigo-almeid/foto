package br.com.amostrinha.foto.repository;

import br.com.amostrinha.foto.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
