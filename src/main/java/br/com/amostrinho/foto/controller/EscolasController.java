package br.com.amostrinho.foto.controller;

import br.com.amostrinho.foto.dto.ListaEscolaDto;
import br.com.amostrinho.foto.service.EscolaService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
