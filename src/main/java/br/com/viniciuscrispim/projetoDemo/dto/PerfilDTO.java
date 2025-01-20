package br.com.viniciuscrispim.projetoDemo.dto;

import br.com.viniciuscrispim.projetoDemo.entity.PerfilEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class PerfilDTO {

    private Long id;
    private String descricao;

    public PerfilDTO(PerfilEntity perfil) {
        BeanUtils.copyProperties(perfil, this);
    }
}
