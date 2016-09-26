package br.com.agentemaps.main;

import java.sql.Date;
import java.sql.Time;

import br.com.agentemaps.dao.AdministradorDAO;
import br.com.agentemaps.dao.AdministradorDAOImpl;
import br.com.agentemaps.model.Administrador;
import br.com.agentemaps.service.AdministradorServiceImpl;
import br.com.agentemaps.util.HibernateUtil;

public class AdministradorTeste {
	
	
	public static void main(String[] args) {
		
	
	HibernateUtil.getSessionFactory().openSession();

	
	Administrador admin = new Administrador();
	
	
	AdministradorServiceImpl administradorServiceImpl = new AdministradorServiceImpl();
	
	
	
	admin.setNome("Levi Saturnino");
	admin.setCpf("432432423423");
	admin.setLogin("leviSaturnino");
	admin.setSenha("1234");
	
	
	AdministradorDAOImpl adminImpl = new AdministradorDAOImpl();
	
	
	adminImpl.salvar(admin);
	

	//administradorServiceImpl.salvar(admin);

	
	
	System.out.println("Cadastros gerados com sucesso!");
	}

}
