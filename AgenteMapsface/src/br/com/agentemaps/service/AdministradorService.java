package br.com.agentemaps.service;

import java.util.List;

import br.com.agentemaps.model.Administrador;

public interface AdministradorService {

	public void salvar(Administrador administrador);

	public List<Administrador> listar();

	public void atualizar(Administrador administrador);

	public void excluir(Administrador administrador);

}
