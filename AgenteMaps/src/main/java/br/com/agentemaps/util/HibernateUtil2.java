package br.com.agentemaps.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil2  {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		
	        try {
	            Configuration configuration = new Configuration().configure("META-INF/hibernate.cfg.xml");
	            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
	       return configuration.buildSessionFactory(builder.build());
	        } catch (HibernateException ex) {
	            System.err.println("Initial sessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }		
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
