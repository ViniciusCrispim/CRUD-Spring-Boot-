package br.com.viniciuscrispim.projetoDemo.dto;

import br.com.viniciuscrispim.projetoDemo.entity.RecursoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class RecursoDTO {

    private Long id;
    private String nome;
    private String chave;

    public RecursoDTO(RecursoEntity recurso) {
        BeanUtils.copyProperties(recurso, this);
    }
}
