package br.com.nrbsistemas.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.nrbsistemas.util.HibernateUtil;

public class GenericDao<Entidade> {
	public void salvar(Entidade entidade){
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transacao = null;
		try {
			
			transacao = sessao.getTransaction();
			sessao.save(entidade);
			transacao.commit();
			
		} catch (RuntimeException erro) {
			// TODO: handle exception
			if(transacao != null){
				transacao.rollback();
			}
			throw erro;
			}
		finally {
			sessao.close();
		
		}
		
	}
}
