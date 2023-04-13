package br.com.amostrinho.foto.repository;

import br.com.amostrinho.foto.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EscolaRepository extends JpaRepository<Escola, Long> {
    List<Escola>    findAll();
}
