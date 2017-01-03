

package br.com.nrbsistemas.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.nrbsistemas.domain.Cidade;
import br.com.nrbsistemas.domain.Estado;

public class CidadeDaoTest {

	@Test
	@Ignore
	public void salvar(){
		EstadoDao estadoDao = new EstadoDao();
		
		Estado estado = estadoDao.buscar(11L);
		
		Cidade cidade = new Cidade();
		cidade.setNome("Linhares");
		cidade.setEstado(estado);
		
		CidadeDao cidadeDao = new CidadeDao();
		cidadeDao.salvar(cidade);
	}
	@Test
	@Ignore
	public void listar(){
		CidadeDao cidadeDao = new CidadeDao();
		List<Cidade> res = cidadeDao.listar();
		
		for(Cidade cidade: res){
			System.out.println(cidade.getNome()+" "+cidade.getEstado().getNome());
		}
	}
	@Test
	public void buscar(){
		Long cod = 3L;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(cod); 
		System.out.println(cidade.getNome()+" "+cidade.getEstado().getNome());
	}
}
