package br.com.amostrinho.foto.service;

import br.com.amostrinho.foto.dto.EscolaDto;
import br.com.amostrinho.foto.dto.ListaEscolaDto;
import br.com.amostrinho.foto.model.Escola;
import br.com.amostrinho.foto.repository.EscolaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.stream.Collectors;

@Service
@CrossOrigin
public class EscolaService {

    private final EscolaRepository escolaRepository;

    public EscolaService(EscolaRepository escolaRepository) {
        this.escolaRepository = escolaRepository;
    }

    public ResponseEntity<ListaEscolaDto> lista() {


        List<Escola> escolas;
        List<EscolaDto> escolaDto;
        ListaEscolaDto resultado;

        escolas = escolaRepository.findAll();
        escolaDto = EscolaDto.converter(escolas);
        resultado = new ListaEscolaDto(escolaDto);
        return ResponseEntity.ok(resultado);
    }
}
