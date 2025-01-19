package br.com.viniciuscrispim.projetoDemo.dto;

import br.com.viniciuscrispim.projetoDemo.entity.PermissaoPerfilRecursoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class PermissaoPerfilRecursoDTO {
    private Long id;
    private PerfilDTO perfil;
    private RecursoDTO recurso;

    public PermissaoPerfilRecursoDTO(PermissaoPerfilRecursoEntity permissaoPerfilRecursoEntity){
        BeanUtils.copyProperties(permissaoPerfilRecursoEntity, this);
        if(permissaoPerfilRecursoEntity != null && permissaoPerfilRecursoEntity.getPerfil() != null){
            this.perfil = new PerfilDTO(permissaoPerfilRecursoEntity.getPerfil());
        }
        if(permissaoPerfilRecursoEntity != null && permissaoPerfilRecursoEntity.getRecurso() != null){
            this.recurso = new RecursoDTO(permissaoPerfilRecursoEntity.getRecurso());
        }

    }
}
