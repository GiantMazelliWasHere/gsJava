package br.com.queimadastech.repositories;

import br.com.queimadastech.entities.Dado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DadoRepository extends JpaRepository<Dado, Integer> {
    List<Dado> findByMunicipio(String municipio);
}
