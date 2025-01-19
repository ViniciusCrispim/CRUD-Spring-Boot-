package br.com.viniciuscrispim.projetoDemo.service;

import br.com.viniciuscrispim.projetoDemo.dto.PermissaoPerfilRecursoDTO;
import br.com.viniciuscrispim.projetoDemo.entity.PermissaoPerfilRecursoEntity;
import br.com.viniciuscrispim.projetoDemo.repository.PermissaoPerfilRecursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissaoPerfilRecursoService {

    @Autowired
    private PermissaoPerfilRecursoRepository permissaoPerfilRecursoRepository;

    public List<PermissaoPerfilRecursoDTO> listarPermissaoPerfilRecurso() {
        List<PermissaoPerfilRecursoEntity> permissoes = permissaoPerfilRecursoRepository.findAll();
        return permissoes.stream().map(PermissaoPerfilRecursoDTO::new).toList();
    }

    public PermissaoPerfilRecursoDTO inserirPermissaoPerfilRecurso(PermissaoPerfilRecursoDTO permissaoPerfilRecursoDTO) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecurso = new PermissaoPerfilRecursoEntity(permissaoPerfilRecursoDTO);
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.save(permissaoPerfilRecurso));
    }

    public PermissaoPerfilRecursoDTO alterarPermissaoPerfilRecurso(PermissaoPerfilRecursoDTO permissaoPerfilRecursoDTO) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecurso = new PermissaoPerfilRecursoEntity(permissaoPerfilRecursoDTO);
        return new PermissaoPerfilRecursoDTO(permissaoPerfilRecursoRepository.save(permissaoPerfilRecurso));
    }

    public void removerPermissaoPerfilRecurso(Long id) {
        PermissaoPerfilRecursoEntity permissaoPerfilRecurso = permissaoPerfilRecursoRepository.findById(id).get();
        permissaoPerfilRecursoRepository.delete(permissaoPerfilRecurso);
    }
}
