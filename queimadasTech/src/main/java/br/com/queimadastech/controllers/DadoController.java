package br.com.queimadastech.controllers;

import br.com.queimadastech.entities.Dado;
import br.com.queimadastech.services.DadoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping({"/v1/dados"})
public class DadoController {
    @Autowired
    private DadoService dadoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ADMIN')")
    public void adicionarDado(@Valid @RequestBody Dado dado) {dadoService.criarDado(dado);}

    @GetMapping(params = {"municipio"})
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Dado> listarDados(String municipio) {return dadoService.listarDados(municipio);}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Dado> listarTodosDados() {
        return dadoService.listarTodosDados();
    }
}
