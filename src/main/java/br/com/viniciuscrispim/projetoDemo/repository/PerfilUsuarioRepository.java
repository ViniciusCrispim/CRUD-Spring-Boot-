package br.com.viniciuscrispim.projetoDemo.repository;

import br.com.viniciuscrispim.projetoDemo.entity.PerfilUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuarioEntity, Long> {
}
