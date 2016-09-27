package br.com.agentemaps.service;

import java.util.List;

import br.com.agentemaps.dao.FamiliaDAO;
import br.com.agentemaps.model.Familia;

public class FamiliaServiceImpl implements FamiliaService{
	
	FamiliaDAO familiaDAO;

	public FamiliaDAO getFamiliaDAO() {
		return familiaDAO;
	}

	public void setFamiliaDAO(FamiliaDAO familiaDAO) {
		familiaDAO = familiaDAO;
	}

	@Override
	public void salvar(Familia familia) {
		familiaDAO.salvar(familia);
		
	}

	@Override
	public List<Familia> listar() {
		
		return familiaDAO.listar();
	}

	@Override
	public void atualizar(Familia familia) {
		familiaDAO.atualizar(familia);
		
	}

	@Override
	public void excluir(Familia familia) {
	familiaDAO.excluir(familia);
		
	}

}
