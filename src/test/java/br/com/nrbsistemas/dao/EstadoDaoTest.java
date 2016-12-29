package br.com.nrbsistemas.dao;

import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Ignore;
import org.junit.Test;

import br.com.nrbsistemas.domain.Estado;

public class EstadoDaoTest {
	@Test
	@Ignore
	public void salvar() {
		// testando o metodo salvar
		Estado estado = new Estado();
		estado.setNome("Minas Gerais");
		estado.setSigla("MG");

		EstadoDao estadoDao = new EstadoDao();
		estadoDao.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {
		EstadoDao estadoDao = new EstadoDao();
		List<Estado> resultado = estadoDao.listar();
		System.out.println("Total de Estados encontrado " + resultado.size());
		for (Estado estado : resultado) {
			System.out.println(estado.getNome() + "-" + estado.getSigla() + "-" + estado.getCodigo());
		}
	}

	@Test
	public void buscar() {
		//Long codigo = 1L;
		Long codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o codigo para a buscar"));

		EstadoDao estadoDao = new EstadoDao();
		Estado estado = estadoDao.buscar(codigo);
		
		if(estado != null){
			System.out.println("Resultado da busca : "+estado.getNome()+" - "+estado.getSigla());	
		}else{
			System.out.println("Nenhum resultado encontrado");
		}
		
	}

}
