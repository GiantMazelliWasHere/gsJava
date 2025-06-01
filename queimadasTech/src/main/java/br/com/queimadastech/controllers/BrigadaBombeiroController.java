package br.com.queimadastech.controllers;

import br.com.queimadastech.entities.BrigadaBombeiro;
import br.com.queimadastech.services.BrigadaBombeiroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequestMapping("/v1/brigadas")
public class BrigadaBombeiroController {
    @Autowired
    private BrigadaBombeiroService brigadaBombeiroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @PreAuthorize("hasRole('ADMIN')")
    public void criarBrigada(@RequestBody @Valid BrigadaBombeiro brigadaBombeiro) {brigadaBombeiroService.criarBrigadaBombeiro(brigadaBombeiro);}

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<BrigadaBombeiro> listarTodasBrigadas() {return brigadaBombeiroService.listarTodasBrigadaBombeiros();}
}
