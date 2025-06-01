package br.com.queimadastech.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DADOS_INCENDIO")
@Getter
@Setter
public class DadoIncendio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ID_INCENDIO")
    private Integer id;

    @Column(name="LOCAL")
    @NotBlank(message = "O campo Local é obrigatório")
    @Size(max = 100, message = "O campo Local deve ter no máximo 100 caracteres.")
    private String local;

    @Column(name="TIPO_DO_FOGO")
    @NotBlank(message = "O campo Tipo de fogo é obrigatório")
    @Size(max = 100, message = "O campo Tipo de fogo deve ter no máximo 100 caracteres.")
    private String tipoDoFogo;

    @Column(name="Tamanho_CHAMAS")
    @NotNull(message = "O campo Tamanho Chamas é obrigatório")
    private Integer tamanhoChamas;
}
