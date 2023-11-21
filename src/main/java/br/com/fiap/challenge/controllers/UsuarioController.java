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
import br.com.fiap.challenge.model.Usuario;
import br.com.fiap.challenge.repository.UsuarioRepository;

@RestController
public class UsuarioController {

    Logger log = LoggerFactory.getLogger(getClass());

    List <Usuario> usuario = new ArrayList<>();

    @Autowired
    UsuarioRepository repository;

    @GetMapping("/usuario")
    public List<Usuario> index(){
        return repository.findAll();
    }

    @PostMapping("/usuario")
    public ResponseEntity<Object> create(@RequestBody @Valid Usuario usuario) {
        log.info("Cadastrando usuario - " + usuario);
        repository.save(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
    }

        @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> show(@PathVariable Long id){
        log.info("Mostrar usuario com id " + id);
        return ResponseEntity.ok(getUsuarioById(id));
    }

    @DeleteMapping("/usuario/{id}")
    public ResponseEntity<Object> destroy(@PathVariable Long id){
        log.info("Apagando usuario com id " + id);
        repository.delete(getUsuarioById(id));
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/usuario/{id}")
    public ResponseEntity<Usuario> update(@PathVariable Long id, @RequestBody Usuario usuario){
        log.info("Atualizando dados do usuario com id " + id);
        getUsuarioById(id);
        usuario.setId(id);
        repository.save(usuario);

        return ResponseEntity.ok(usuario);
    }


    private Usuario getUsuarioById(Long id){
        return repository.findById(id).orElseThrow(() -> { 
                return new RuntimeException();
            });
        }
    
}
