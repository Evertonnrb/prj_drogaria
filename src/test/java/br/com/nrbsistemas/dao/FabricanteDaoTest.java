package br.com.nrbsistemas.dao;

import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Ignore;
import org.junit.Test;

import br.com.nrbsistemas.domain.Fabricante;

public class FabricanteDaoTest {
	@Test
	@Ignore
	public void salvar() {
		// Test salvar fabricante
		Fabricante fabricante =  new Fabricante();
		fabricante.setDescrisao("Farmais");
		FabricanteDao fabricanteDao = new FabricanteDao();
		fabricanteDao.salvar(fabricante);
	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 1L;
		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(codigo);
		if(fabricante == null){
			System.out.println("Fabricante não encontrado");
		}else{
			fabricanteDao.excluir(fabricante);
			System.out.println("Fabricante "+fabricante.getDescrisao()+" excluido com sucesso");
		}
	}
	@Test
	@Ignore
	public void listar(){
		FabricanteDao fabricanteDao = new FabricanteDao();
		List<Fabricante> result = fabricanteDao.listar();
		System.out.println("Total de fabricantes encontrados "+result.size());
		for(Fabricante fabricante : result){
			System.out.println("Descrisao "+fabricante.getDescrisao()+" - "+fabricante.getCodigo());
		}
	}
	@Test
	@Ignore
	public void buscar(){
		Long codigo = Long.parseLong(JOptionPane.showInputDialog("Digite o cod"));
		
		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(codigo);
		if(fabricante!=null){
			System.out.println("RESULTADO :: "+fabricante.getDescrisao());
		}else{
			System.out.println("Nenhum resultado encontrado");
		}
	}	
	@Test
	@Ignore
	public void editar(){
		Long cod = 1L;
		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(cod);
		fabricante.setDescrisao("Vendedor de lã");
		fabricanteDao.atualizar(fabricante);
	}

}
