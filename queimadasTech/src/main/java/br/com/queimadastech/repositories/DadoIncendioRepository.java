package br.com.queimadastech.repositories;

import br.com.queimadastech.entities.DadoIncendio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DadoIncendioRepository extends JpaRepository<DadoIncendio, Integer> {
    List<DadoIncendio> findByLocal(String local);
}
