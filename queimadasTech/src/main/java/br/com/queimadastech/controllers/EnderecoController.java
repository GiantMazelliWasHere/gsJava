package br.com.queimadastech.controllers;

import br.com.queimadastech.entities.Endereco;
import br.com.queimadastech.repositories.EnderecoRepository;
import br.com.queimadastech.services.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ADMIN')")
    public void criarEndereco(@Valid @RequestBody Endereco endereco) {enderecoService.salvarEndereco(endereco);}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Endereco> listarEndereco() {return enderecoService.listarEnderecos();}
}
