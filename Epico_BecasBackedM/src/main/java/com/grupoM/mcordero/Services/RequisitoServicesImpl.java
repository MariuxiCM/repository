package com.grupoM.mcordero.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupoM.mcordero.Entity.Requisito;
import com.grupoM.mcordero.Repositories.IRequisitoRepository;

@Service
public class RequisitoServicesImpl implements IRequisitoServices {

	@Autowired
	private IRequisitoRepository requisitoRepository;

	@Override
	public Requisito get(long id) {
		return requisitoRepository.findById(id).get();
	}

	@Override
	public List<Requisito> getAll() {
		return (List<Requisito>) requisitoRepository.findAll();
	}

	@Override
	public void post(Requisito requisito) {
		requisitoRepository.save(requisito);
	}

	@Override
	public void put(Requisito requisito, long id) {
		requisitoRepository.findById(id).ifPresent((x) -> {
			requisito.setId(id);
			requisitoRepository.save(requisito);
		});

	}

	@Override
	public void delete(long id) {
		requisitoRepository.deleteById(id);

	}

}
