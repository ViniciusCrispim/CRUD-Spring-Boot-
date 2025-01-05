package br.com.viniciuscrispim.projetoDemo.controller;

import br.com.viniciuscrispim.projetoDemo.dto.PerfilDTO;
import br.com.viniciuscrispim.projetoDemo.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/perfil")
@CrossOrigin
public class PerfilController {

    @Autowired
    PerfilService perfilService;

    @GetMapping
    public List<PerfilDTO> listarPerfis(){
        return perfilService.listarPerfis();
    }

    @PostMapping
    public PerfilDTO inserirPerfil(@RequestBody PerfilDTO perfil){
        return perfilService.inserirPerfil(perfil);
    }

    @PutMapping
    public PerfilDTO atualizarPerfil(@RequestBody PerfilDTO perfil){
        return perfilService.alterarPerfil(perfil);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> removerPerfil(@PathVariable Long id){
        perfilService.excluirPerfil(id);
        return ResponseEntity.ok().build();
    }
}
