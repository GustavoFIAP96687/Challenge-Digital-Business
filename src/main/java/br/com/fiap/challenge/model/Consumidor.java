package br.com.fiap.challenge.model;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Consumidor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String rfq;

    @NotBlank
    @Size(min = 14, max = 14, message = "O CNPJ deve ter 14 numeros")
    private String cnpj;

    @NotBlank
    @Size(min = 8, max = 8, message = "O CEP deve ter 8 numeros")
    private String cep;

    @Positive(message = "O valor deve ser positivo")
    private int numero;
    
}
