package br.com.queimadastech.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "USUARIO")
@Getter
@Setter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Integer id;

    @Column(name = "USERNAME", nullable = false, length = 50)
    @NotBlank(message = "O campo username é obrigatório.")
    @Size(max = 50, message = "O campo username deve ter no máximo 100 caracteres.")
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 50)
    @NotBlank(message = "O campo password é obrigatório.")
    @Size(max = 50, message = "O campo password deve ter no máximo 100 caracteres.")
    private String password;

    @Column(name = "ROLE", nullable = false, length = 50)
    @NotBlank(message = "O campo role é obrigatório.")
    @Size(max = 50, message = "O campo role deve ter no máximo 100 caracteres.")
    private String role;
}
