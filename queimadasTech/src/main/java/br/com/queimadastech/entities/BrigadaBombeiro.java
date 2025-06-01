package br.com.queimadastech.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BRIGADA_BOMBEIROS")
@Getter
@Setter
public class BrigadaBombeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_BRIGADA")
    private Integer id;

    @Column(name="CIDADE")
    @NotBlank(message = "O campo Cidade é obrigatório")
    @Size(max = 100, message = "O campo Cidade deve ter no máximo 100 caracteres.")
    private String cidade;

    @Column(name = "N_BRIGADA")
    @NotNull(message = "O campo Numero de Brigada é obrigatorio")
    private Integer nBrigada;

    @Column(name = "N_DE_SQUADS")
    @NotNull(message = "O campo Numero de Squads é obrigatorio")
    private Integer nSquads;
}
