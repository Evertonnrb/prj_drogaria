

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
		Estado estado = estadoDao.buscar(1L);
		if (estado != null) {
			Cidade cidade = new Cidade();
			cidade.setNome("Juiz de fora");
			cidade.setEstado(estado);
			
			CidadeDao cidadeDao = new CidadeDao();
			cidadeDao.salvar(cidade);
			System.out.println("Cidade salva com sucesso");
		} else {
			System.out.println("Estado não encontrado");
		}

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
	@Ignore
	public void buscar(){
		Long cod = 3L;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(cod); 
		System.out.println(cidade.getNome()+" "+cidade.getEstado().getNome());
	}
	@Test
	//@Ignore
	public void excluir(){
		Long codigo = 2L;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade =  cidadeDao.buscar(codigo);
		if(cidade != null){
		cidadeDao.excluir(cidade);
		System.out.println("Cidade removida ");
		System.out.println(cidade.getNome()+" "+cidade.getCodigo());
		}else{
			System.out.println("Cidade nao encontrada");
		}
		
	}
	@Test
	public void editar(){
		Long codigoCidade = 6L;
		Long codigoEstado = 4L;
		
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(codigoCidade);
		System.out.println("Cidade a ser editada "+cidade.getNome());
				
		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(codigoEstado);
		System.out.println("Estado a ser editado "+estado.getNome());
		
		cidade.setNome("nullo");
		estado.setNome("nullo tbm");
		cidadeDao.atualizar(cidade);
	}
	}
