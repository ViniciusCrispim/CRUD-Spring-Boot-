package br.com.viniciuscrispim.projetoDemo.controller;

import br.com.viniciuscrispim.projetoDemo.dto.PermissaoPerfilRecursoDTO;
import br.com.viniciuscrispim.projetoDemo.service.PermissaoPerfilRecursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/permissao-perfil-recurso")
@CrossOrigin
public class PermissaoPerfilRecursoController {
    @Autowired
    private PermissaoPerfilRecursoService permissaoPerfilRecursoService;

    @GetMapping
    public List<PermissaoPerfilRecursoDTO> listarPermissaoPerfilRecurso() {
        return permissaoPerfilRecursoService.listarPermissaoPerfilRecurso();
    }

    @PostMapping
    public PermissaoPerfilRecursoDTO inserirPermissaoPerfilRecurso(@RequestBody PermissaoPerfilRecursoDTO dto) {
        return permissaoPerfilRecursoService.inserirPermissaoPerfilRecurso(dto);
    }

    @PutMapping
    public PermissaoPerfilRecursoDTO atualizarPermissaoPerfilRecurso(@RequestBody PermissaoPerfilRecursoDTO dto) {
        return permissaoPerfilRecursoService.alterarPermissaoPerfilRecurso(dto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPermissaoPerfilRecurso(@PathVariable("id") Long id) {
        permissaoPerfilRecursoService.removerPermissaoPerfilRecurso(id);
        return ResponseEntity.ok().build();
    }
}
