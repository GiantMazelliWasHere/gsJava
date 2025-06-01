package br.com.queimadastech.repositories;

import br.com.queimadastech.entities.BrigadaBombeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrigadaBombeirosRepository extends JpaRepository<BrigadaBombeiro, Long> {
    List<BrigadaBombeiro> findByCidade(String cidade);
}
