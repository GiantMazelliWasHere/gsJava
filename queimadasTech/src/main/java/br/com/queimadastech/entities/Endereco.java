package br.com.queimadastech.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ENDERECO_USUARIO")
@Getter
@Setter
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ENDERECO")
    private Integer id;

    @Column(name = "CEP")
    @NotNull(message = "O campo CEP é opbrigatório")
    private long cep;

    @Column(name="CIDADE")
    @NotBlank(message = "O campo cidade é obrigatório")
    @Size(max=100, message = "O campo Cidade deve ter no máximo 100 caracters.")
    private String cidade;

    @Column(name = "ESTADO")
    @NotBlank(message = "O campo Estado é obrigatório")
    @Size(max=100, message = "O campo Estado deve ter no máximo 100 caracters.")
    private String estado;
}
