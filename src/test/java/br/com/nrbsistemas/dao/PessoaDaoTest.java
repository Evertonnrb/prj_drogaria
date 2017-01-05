package br.com.nrbsistemas.dao;

import org.junit.Test;

import br.com.nrbsistemas.domain.Cidade;
import br.com.nrbsistemas.domain.Pessoa;

public class PessoaDaoTest {
	@Test
	public void salvar() {
		Long codigo = 1L;
		CidadeDao cidadeDao = new CidadeDao();
		Cidade cidade = cidadeDao.buscar(codigo);
		if(cidade != null){
		
		PessoaDao pessoaDao = new PessoaDao();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Everton Ribeiro");
		pessoa.setCpf("12345554");
		pessoa.setRg("00990-90");
		pessoa.setCelular("(90)32-323232");
		pessoa.setBairro("Xota");
		pessoa.setRua("Manolas viera");
		pessoa.setComplememto("-");
		pessoa.setEmail("emial@email");
		pessoa.setNumero(new Short("43"));
		
		}
		else{
		System.out.println("Cidade não encontrada");
		}
	}
}
