package br.com.queimadastech.services;

import br.com.queimadastech.entities.Dado;
import br.com.queimadastech.repositories.DadoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DadoService {

    private DadoRepository dadoRepository;

    public void criarDado(Dado dado) {dadoRepository.save(dado);}

    public List<Dado> listarDados(String municipio) {return  dadoRepository.findByMunicipio(municipio);}

    public List<Dado> listarTodosDados() {return dadoRepository.findAll();}
}
