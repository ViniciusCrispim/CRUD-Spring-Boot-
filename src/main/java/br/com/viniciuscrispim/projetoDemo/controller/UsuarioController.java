package br.com.viniciuscrispim.projetoDemo.controller;

import br.com.viniciuscrispim.projetoDemo.dto.UsuarioDTO;
import br.com.viniciuscrispim.projetoDemo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
@CrossOrigin
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping
    public List<UsuarioDTO> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public UsuarioDTO buscarUsuario(@PathVariable Long id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    @PostMapping
    public UsuarioDTO inserirUsuario(@RequestBody UsuarioDTO usuario) {
        return usuarioService.inserirUsuario(usuario);
    }

    @PutMapping
    public UsuarioDTO atualizarUsuario(@RequestBody UsuarioDTO usuario) {
        return usuarioService.alterarUsuario(usuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirUsuario(@PathVariable("id") Long id) {
        usuarioService.removerUsuario(id);
        return ResponseEntity.ok().build();
    }
}
