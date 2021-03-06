package br.com.agentemaps.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import br.com.agentemaps.model.Administrador;
import br.com.agentemaps.model.Familia;
import br.com.agentemaps.util.HibernateUtil;
@Repository
public class AdministradorDAOImpl implements AdministradorDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(AdministradorDAOImpl.class);
	Session sessao = null;
	Transaction transacao = null;

	private SessionFactory sessionFactory;
	
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	
	public void addPerson(Administrador p) {
		Session session = this.sessionFactory.getCurrentSession();
        session.persist(p);
        logger.info("Person saved successfully, Person Details="+p);		
	}


	public List<Administrador> listPersons() {
		Session session = this.sessionFactory.getCurrentSession();
        List<Administrador> personsList = session.createQuery("from Administrador").list();
        for(Administrador p : personsList){
            logger.info("Person List::"+p);
        }
        return personsList;
	}
	
	
	
	
	public void salvar(Administrador administrador) {
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.save(administrador);
			transacao.commit();
		} catch (Exception e) {
			System.out.println("Não foi possivel inserir o administrador. Erro: " + e.getMessage());
		} finally {
			try {
				if (this.sessao.isOpen())
					sessao.close();
			} catch (Throwable e2) {
				System.out.println("Erro ao fechar operação de inserção. Mensagem: " + e2.getMessage());
			}
		}
	}

	public void atualizar(Administrador administrador) {

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.update(administrador);
			transacao.commit();
		} catch (Exception e) {
			System.out.println("Não foi possivel alterar o administrador. Erro: " + e.getMessage());
		} finally {
			try {
				if (this.sessao.isOpen())
					sessao.close();
			} catch (Throwable e2) {
				System.out.println("Erro ao fechar operação de atualizacao. Mensagem: " + e2.getMessage());
			}
		}
	}

	public void excluir(Administrador administrador) {

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			sessao.delete(administrador);
			transacao.commit();
		} catch (Exception e) {
			System.out.println("Não foi possivel excluir o administrador. Erro: " + e.getMessage());
		} finally {
			try {
				sessao.close();
			} catch (Throwable e2) {
				System.out.println("Erro ao fechar operação de excluir. Mensagem: " + e2.getMessage());
			}
		}
	}

	public Familia buscaCategoria(Integer codigo) {

		Familia familia = null;

		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			Criteria filtro = sessao.createCriteria(Familia.class);
			filtro.add(Restrictions.eq("familia", codigo));
			familia = (Familia) filtro.uniqueResult();
			this.transacao.commit();
			transacao.commit();

		} catch (Throwable e) {
			if (this.transacao.isActive()) {
				this.transacao.rollback();
			}
		} finally {
			try {
				if (this.sessao.isOpen())
					sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
		return familia;
	}

	public List<Administrador> listar() {

		List<Administrador> administradores = null;
		try {
			sessao = HibernateUtil.getSessionFactory().openSession();
			transacao = sessao.beginTransaction();
			Criteria filtro = sessao.createCriteria(Familia.class);

			administradores = filtro.list();
			this.transacao.commit();

		} catch (Throwable e) {
			if (this.transacao.isActive()) {
				this.transacao.rollback();
			}
		} finally {
			try {
				if (this.sessao.isOpen())
					sessao.close();
			} catch (Throwable e) {
				System.out.println("Erro ao fechar operação de consulta. Mensagem: " + e.getMessage());
			}
		}
		return administradores;
	}

}
