package br.com.viniciuscrispim.projetoDemo.repository;

import br.com.viniciuscrispim.projetoDemo.entity.RecursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecursoRepositoy extends JpaRepository<RecursoEntity, Long> {
}
