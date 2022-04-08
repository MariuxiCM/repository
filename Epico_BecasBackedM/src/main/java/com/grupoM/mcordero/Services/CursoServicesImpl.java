package com.grupoM.mcordero.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoM.mcordero.Entity.Curso;
import com.grupoM.mcordero.Repositories.ICursoRepository;



@Service
public class CursoServicesImpl implements ICursoServices{
	
	
	@Autowired
	private ICursoRepository cursoRepository;

	@Override
	public Curso get(long id) {
		return cursoRepository.findById(id).get();
	}

	@Override
	public List<Curso> getAll() {
		return (List<Curso>) cursoRepository.findAll();
	}

	@Override
	public void post(Curso curso) {
		cursoRepository.save(curso);
		}

	@Override
	public void put(Curso curso, long id) {
		cursoRepository.findById(id).ifPresent((x) -> {
			curso.setId(id);
			cursoRepository.save(curso);
		});
		
	}

	@Override
	public void delete(long id) {
		cursoRepository.deleteById(id);
		
	}

	
}
