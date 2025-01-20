package br.com.viniciuscrispim.projetoDemo.service;

import br.com.viniciuscrispim.projetoDemo.dto.PerfilDTO;
import br.com.viniciuscrispim.projetoDemo.entity.PerfilEntity;
import br.com.viniciuscrispim.projetoDemo.repository.PerfilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {
    @Autowired
    private PerfilRepository perfilRepository;

    public List<PerfilDTO> listarPerfis(){
        List<PerfilEntity> perfis = perfilRepository.findAll();
        return perfis.stream().map(PerfilDTO::new).toList();
    }

    public PerfilDTO buscarPerfilPorId(Long id){
        PerfilEntity perfil = perfilRepository.findById(id).get();
        return new PerfilDTO(perfil);
    }

    public PerfilDTO inserirPerfil(PerfilDTO perfil){
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        return new PerfilDTO(perfilRepository.save(perfilEntity));
    }

    public PerfilDTO alterarPerfil(PerfilDTO perfil){
        PerfilEntity perfilEntity = new PerfilEntity(perfil);
        return new PerfilDTO(perfilRepository.save(perfilEntity));
    }

    public void excluirPerfil(Long id){
        PerfilEntity perfil = perfilRepository.findById(id).get();
        perfilRepository.delete(perfil);
    }

}
