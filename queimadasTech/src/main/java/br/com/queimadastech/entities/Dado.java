package br.com.queimadastech.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DADOS_RELATORIO")
@Getter
@Setter
public class Dado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_DADOS")
    private Integer id;

    @Column(name = "LAT")
    @NotNull(message = "O campo de Latitude é obrigatorio")
    private Double latitude;

    @Column(name = "LON")
    @NotNull(message = "O campo de Longitude é obrigatório")
    private Double longitude;

    @Column(name = "PAIS")
    @NotBlank(message = "O campo País é obrigatório")
    @Size(max = 100, message = "O campo País deve ter no máximo 100 caracteres.")
    private String pais;

    @Column(name = "ESTADO")
    @NotBlank(message = "O campo Estado é obrigatório")
    @Size(max = 100, message = "O campo Estado deve ter no máximo 100 caracteres.")
    private String estado;

    @Column(name = "MUNICIPIO")
    @NotBlank(message = "O campo Municipio é obrigatório")
    @Size(max = 100, message = "O campo Municipio deve ter no máximo 100 caracteres.")
    private String municipio;

    @Column(name = "BIOMA")
    @NotBlank(message = "O campo Bioma é obrigatório")
    @Size(max = 100, message = "O campo Bioma deve ter no máximo 100 caracteres.")
    private String bioma;
}
