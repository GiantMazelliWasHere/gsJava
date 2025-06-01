package br.com.queimadastech.services;

import br.com.queimadastech.entities.DadoIncendio;
import br.com.queimadastech.repositories.DadoIncendioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadoIncendioService {

    private DadoIncendioRepository dadosIncendioRepository;

    public void salvarDado(DadoIncendio dadosIncendio) {dadosIncendioRepository.save(dadosIncendio);}

    public List<DadoIncendio> buscarTodosDados() {return dadosIncendioRepository.findAll();}
}
