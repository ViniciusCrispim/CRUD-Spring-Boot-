package br.com.viniciuscrispim.projetoDemo.repository;

import br.com.viniciuscrispim.projetoDemo.entity.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilRepository extends JpaRepository<PerfilEntity, Long> {
}
