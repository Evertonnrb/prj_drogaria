package br.com.nrbsistemas.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();
	//getter da fabrica de sessoes
	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}
	//metodo para fabrica de sessoes
	private static SessionFactory criarFabricaDeSessoes(){
	try {
		//ler arquivo hibernate.cfg
		Configuration configuracao = new Configuration().configure();
		
		//registrando o servico
		ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
		
		//constroi fabrica de sessao
		SessionFactory fabrica = configuracao.buildSessionFactory(registro);
		
		return fabrica;
	} catch (Exception e) {//(Throwable ex) 
		// TODO: handle exception
		System.err.println("/n/n"+"A fabrica de sessoes não pode ser criada "+e+"\n\n");
		throw new ExceptionInInitializerError(e);
	}
	}
	
}
