package br.com.viniciuscrispim.projetoDemo.controller;

import br.com.viniciuscrispim.projetoDemo.dto.PerfilUsuarioDTO;
import br.com.viniciuscrispim.projetoDemo.service.PerfilUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil/usuario")
@CrossOrigin
public class PerfilUsuarioController {
    @Autowired
    PerfilUsuarioService perfilUsuarioService;

    @GetMapping
    public List<PerfilUsuarioDTO> listarPerfilUsuario() {
        return perfilUsuarioService.listarPerfilUsuario();
    }

    @PostMapping
    public PerfilUsuarioDTO inserirPerfilUsuario(@RequestBody PerfilUsuarioDTO perfilUsuario) {
        return perfilUsuarioService.inserirPerfilUsuario(perfilUsuario);
    }

    @PutMapping
    public PerfilUsuarioDTO atualizarPerfilUsuario(@RequestBody PerfilUsuarioDTO perfilUsuario) {
        return perfilUsuarioService.alterarPerfilUsuario(perfilUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPerfilUsuario(@PathVariable Long id){
        perfilUsuarioService.removerPerfilUsuario(id);
        return ResponseEntity.ok().build();
    }
}
