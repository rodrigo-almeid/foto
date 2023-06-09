package br.com.amostrinha.foto.service;

import br.com.amostrinha.foto.controller.form.EscolaForm;
import br.com.amostrinha.foto.dto.EscolaDto;
import br.com.amostrinha.foto.dto.ListaEscolaDto;
import br.com.amostrinha.foto.model.Escola;
import br.com.amostrinha.foto.repository.EscolaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

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
    public EscolaDto cadastrar (EscolaForm escolaForm, UriComponentsBuilder uriBuilder){
        Escola escola = escolaForm.converter(escolaForm);
        escolaRepository.save(escola);
        return EscolaDto.converterum(escola);
    }
}
