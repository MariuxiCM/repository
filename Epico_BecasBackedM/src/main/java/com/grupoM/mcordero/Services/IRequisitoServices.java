package com.grupoM.mcordero.Services;

import java.util.List;

import com.grupoM.mcordero.Entity.Requisito;

public interface IRequisitoServices {

	public Requisito get(long id);

	public List<Requisito> getAll();

	public void post(Requisito requisito);

	public void put(Requisito requisito, long id);

	public void delete(long id);

}
