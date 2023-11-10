package br.com.fiap.challenge.model;

//import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String desc;
    
    @Positive(message = "O valor deve ser positivo")
    @NotNull
    private Double valor;

    @NotBlank
    private String qualidade;

    @NotBlank
    private String condicao_entrega;

    @Positive(message = "A quantidade deve ser positiva")
    @NotNull
    private int quantidade;


}
