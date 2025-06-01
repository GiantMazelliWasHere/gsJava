package br.com.queimadastech.controllers;

import br.com.queimadastech.entities.DadoIncendio;
import br.com.queimadastech.services.DadoIncendioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/dadosIncendio")
public class DadoIncendioController {
    @Autowired
    private DadoIncendioService dadoIncendioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ADMIN')")
    public void criarDadoIncendio(@Valid @RequestBody DadoIncendio dadoIncendio) {dadoIncendioService.salvarDado(dadoIncendio);}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<DadoIncendio> listarDadoIncendio() {return dadoIncendioService.buscarTodosDados();}
}
