package br.com.viniciuscrispim.projetoDemo.service;

import br.com.viniciuscrispim.projetoDemo.dto.PerfilUsuarioDTO;
import br.com.viniciuscrispim.projetoDemo.entity.PerfilUsuarioEntity;
import br.com.viniciuscrispim.projetoDemo.repository.PerfilUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilUsuarioService {

    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;
    @Autowired
    private RecursoService recursoService;

    public List<PerfilUsuarioDTO> listarPerfilUsuario() {
        List<PerfilUsuarioEntity> perfilUsuario = perfilUsuarioRepository.findAll();
        return perfilUsuario.stream().map(PerfilUsuarioDTO::new).toList();
    }

    public PerfilUsuarioDTO inserirPerfilUsuario(PerfilUsuarioDTO perfilUsuario) {
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        return new PerfilUsuarioDTO(perfilUsuarioRepository.save(perfilUsuarioEntity));
    }

    public PerfilUsuarioDTO alterarPerfilUsuario(PerfilUsuarioDTO perfilUsuario) {
        PerfilUsuarioEntity perfilUsuarioEntity = new PerfilUsuarioEntity(perfilUsuario);
        return new PerfilUsuarioDTO(perfilUsuarioRepository.save(perfilUsuarioEntity));
    }

    public void removerPerfilUsuario(Long id) {
        PerfilUsuarioEntity perfilUsuarioEntity = perfilUsuarioRepository.findById(id).get();
        perfilUsuarioRepository.delete(perfilUsuarioEntity);
    }
}