package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.challenge.model.Consumidor;

public interface ConsumidorRepository extends JpaRepository<Consumidor, Long>{
    
}
