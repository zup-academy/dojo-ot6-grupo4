package br.com.zupedu.dojo.ot4dojo.turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

import javax.validation.Valid;

@RestController
@RequestMapping("/turma")
public class TurmaController {

    @Autowired
    TurmaRepository turmaRepository;

    @PostMapping
    public ResponseEntity<Turma> cadastro(@RequestBody @Valid TurmaRequest request){

        Turma turma = request.converte();
        turmaRepository.save(turma);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build().toUri();

        return ResponseEntity.created(uri).build();
    }
}
