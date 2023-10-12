package br.com.fiap.challenge.controllers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import br.com.fiap.challenge.model.Consumidor;
import br.com.fiap.challenge.repository.ConsumidorRepository;

@RestController
public class ConsumidorController {

    Logger log = LoggerFactory.getLogger(getClass());

    List <Consumidor> consumidor = new ArrayList<>();

    @Autowired
    ConsumidorRepository repository;

    @GetMapping("/consumidor")
    public List<Consumidor> index(){
        return repository.findAll();
    }

    @PostMapping("/consumidor")
    public ResponseEntity<Object> create(@RequestBody @Valid Consumidor consumidor) {
        log.info("cadastrando consumidor - " + consumidor);
        repository.save(consumidor);
        return ResponseEntity.status(HttpStatus.CREATED).body(consumidor);
    }

        @GetMapping("/consumidor/{id}")
    public ResponseEntity<Consumidor> show(@PathVariable Long id){
        log.info("mostrar consumidor com id " + id);
        return ResponseEntity.ok(getConsumidorById(id));
    }

    @DeleteMapping("/consumidor/{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("apagando consumidor com id " + id);
        repository.delete(getConsumidorById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/consumidor/{id}")
    public ResponseEntity<Consumidor> update(@PathVariable Long id, @RequestBody Consumidor consumidor){
        log.info("atualizando dados do consumidor com id " + id);
        getConsumidorById(id);
        consumidor.setId(id);
        repository.save(consumidor);

        return ResponseEntity.ok(consumidor);
    }


    private Consumidor getConsumidorById(Long id){
        return repository.findById(id).orElseThrow(() -> { 
                return new RuntimeException();
            });
        }
    
}
