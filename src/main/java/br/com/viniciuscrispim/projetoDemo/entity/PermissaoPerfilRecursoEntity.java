package br.com.viniciuscrispim.projetoDemo.entity;

import br.com.viniciuscrispim.projetoDemo.dto.PermissaoPerfilRecursoDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "T_PERMISSAO_PERFIL_RECURSO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class PermissaoPerfilRecursoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ID_PERFIL")
    private PerfilEntity perfil;

    @ManyToOne
    @JoinColumn(name = "ID_RECURSO")
    private RecursoEntity recurso;

    public PermissaoPerfilRecursoEntity(PermissaoPerfilRecursoDTO permissaoPerfilRecursoDTO) {
        BeanUtils.copyProperties(permissaoPerfilRecursoDTO, this);
        if(permissaoPerfilRecursoDTO != null && permissaoPerfilRecursoDTO.getPerfil() != null){
            this.perfil = new PerfilEntity(permissaoPerfilRecursoDTO.getPerfil());
        }
        if(permissaoPerfilRecursoDTO != null && permissaoPerfilRecursoDTO.getRecurso() != null){
            this.recurso = new RecursoEntity(permissaoPerfilRecursoDTO.getRecurso());
        }
    }

}
