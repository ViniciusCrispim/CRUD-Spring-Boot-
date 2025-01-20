package br.com.viniciuscrispim.projetoDemo.controller;

import br.com.viniciuscrispim.projetoDemo.dto.RecursoDTO;
import br.com.viniciuscrispim.projetoDemo.service.RecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/recurso")
@CrossOrigin
public class RecursoController {
    @Autowired
    RecursoService recursoService;

    @GetMapping
    public List<RecursoDTO> listarRecursos() {
        return recursoService.listarRecursos();
    }

    @GetMapping("/{id}")
    public RecursoDTO buscarRecurso(@PathVariable Long id) {
        return recursoService.buscarRecursoPorId(id);
    }

    @PostMapping
    public RecursoDTO inserirRecurso(@RequestBody RecursoDTO recurso) {
        return recursoService.inserirRecurso(recurso);
    }

    @PutMapping
    public RecursoDTO alterarRecurso(@RequestBody RecursoDTO recurso) {
        return recursoService.alterarRecurso(recurso);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerRecurso(@PathVariable Long id) {
        recursoService.removerRecurso(id);
        return ResponseEntity.ok().build();
    }
}
