package br.com.amostrinha.foto.controller;

import br.com.amostrinha.foto.controller.form.EscolaForm;
import br.com.amostrinha.foto.dto.EscolaDto;
import br.com.amostrinha.foto.dto.ListaEscolaDto;
import br.com.amostrinha.foto.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/escolas")
@CrossOrigin
public class EscolasController {
    @Autowired
    private EscolaService escolaService;

    @GetMapping
    public ResponseEntity<ListaEscolaDto> lista(){
        return escolaService.lista();

    }
    @PostMapping
    public EscolaDto cadastrar(@RequestBody EscolaForm escolaForm, UriComponentsBuilder uriBuilder){
        return escolaService.cadastrar(escolaForm, uriBuilder);
    }

}
