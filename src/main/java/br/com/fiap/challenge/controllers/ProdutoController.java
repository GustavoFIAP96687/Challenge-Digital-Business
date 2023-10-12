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
import br.com.fiap.challenge.model.Produto;
import br.com.fiap.challenge.repository.ProdutoRepository;
//import jakarta.validation.Valid;

@RestController
public class ProdutoController {
    Logger log = LoggerFactory.getLogger(getClass());

    List <Produto> produtos = new ArrayList<>();

    @Autowired
    ProdutoRepository repository;

    @GetMapping("/produtos")
    public List<Produto> index(){
        return repository.findAll();
    }

    @PostMapping("/produtos")
    public ResponseEntity<Object> create(@RequestBody @Valid Produto produto) {
        log.info("cadastrando produto - " + produto);
        repository.save(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produto);
    }

        @GetMapping("/produtos/{id}")
    public ResponseEntity<Produto> show(@PathVariable Long id){
        log.info("mostrar produto com id " + id);
        return ResponseEntity.ok(getProdutoById(id));
    }

    @DeleteMapping("/produtos/{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("apagando produto com id " + id);
        repository.delete(getProdutoById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/produtos/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto produto){
        log.info("atualizando dados do aluno com id " + id);
        getProdutoById(id);
        produto.setId(id);
        repository.save(produto);

        return ResponseEntity.ok(produto);
    }


    private Produto getProdutoById(Long id){
        return repository.findById(id).orElseThrow(() -> { 
                return new RuntimeException();
            });
        }
    
}
