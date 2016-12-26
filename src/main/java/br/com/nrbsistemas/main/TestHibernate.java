package br.com.nrbsistemas.main;

import org.hibernate.Session;

import br.com.nrbsistemas.util.HibernateUtil;

public class TestHibernate {
	public static void main(String[] args) {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		sessao.close();
	}
}
