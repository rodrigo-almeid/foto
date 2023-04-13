package br.com.amostrinha.foto.repository;

import br.com.amostrinha.foto.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EscolaRepository extends JpaRepository<Escola, Long> {
    List<Escola>    findAll();
}
