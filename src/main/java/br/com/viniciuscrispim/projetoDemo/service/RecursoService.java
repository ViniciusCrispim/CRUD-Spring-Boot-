package br.com.viniciuscrispim.projetoDemo.service;

import br.com.viniciuscrispim.projetoDemo.dto.RecursoDTO;
import br.com.viniciuscrispim.projetoDemo.entity.RecursoEntity;
import br.com.viniciuscrispim.projetoDemo.repository.RecursoRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecursoService {

    @Autowired
    private RecursoRepositoy recursoRepositoy;

    public List<RecursoDTO> listarRecursos() {
        List<RecursoEntity> recursos = recursoRepositoy.findAll();
        return recursos.stream().map(RecursoDTO::new).toList();
    }

    public RecursoDTO buscarRecursoPorId(Long id) {
        return new RecursoDTO(recursoRepositoy.findById(id).get());
    }

    public RecursoDTO inserirRecurso(RecursoDTO recurso) {
        RecursoEntity recursoEntity = new RecursoEntity(recurso);
        return new RecursoDTO(recursoRepositoy.save(recursoEntity));
    }

    public RecursoDTO alterarRecurso(RecursoDTO recurso) {
        RecursoEntity recursoEntity = new RecursoEntity(recurso);
        return new RecursoDTO(recursoRepositoy.save(recursoEntity));
    }

    public void removerRecurso(Long id) {
        RecursoEntity recurso = recursoRepositoy.findById(id).get();
        recursoRepositoy.delete(recurso);
    }

}
