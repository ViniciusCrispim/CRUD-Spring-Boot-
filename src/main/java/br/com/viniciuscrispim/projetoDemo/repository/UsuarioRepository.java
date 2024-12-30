package br.com.viniciuscrispim.projetoDemo.repository;

import br.com.viniciuscrispim.projetoDemo.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{
}
