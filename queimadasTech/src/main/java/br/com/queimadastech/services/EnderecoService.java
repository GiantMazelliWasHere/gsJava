package br.com.queimadastech.services;

import br.com.queimadastech.entities.Endereco;
import br.com.queimadastech.repositories.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public void salvarEndereco(Endereco endereco) {enderecoRepository.save(endereco);}

    public List<Endereco> listarEnderecos() {return enderecoRepository.findAll();}
}
