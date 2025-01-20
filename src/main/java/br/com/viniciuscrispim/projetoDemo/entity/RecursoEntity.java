package br.com.viniciuscrispim.projetoDemo.entity;

import br.com.viniciuscrispim.projetoDemo.dto.RecursoDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import java.util.Objects;

@Entity
@Table(name = "T_RECURSO")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class RecursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String chave;

    public RecursoEntity(RecursoDTO recurso) {
        BeanUtils.copyProperties(recurso, this);
    }
}
