package br.com.queimadastech.services;

import br.com.queimadastech.entities.BrigadaBombeiro;
import br.com.queimadastech.repositories.BrigadaBombeirosRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrigadaBombeiroService {

    private BrigadaBombeirosRepository brigadaBombeirosRepository;

    public void criarBrigadaBombeiro(BrigadaBombeiro brigadaBombeiro) {brigadaBombeirosRepository.save(brigadaBombeiro);}

    public List<BrigadaBombeiro> listarTodasBrigadaBombeiros() {return brigadaBombeirosRepository.findAll();}
}
