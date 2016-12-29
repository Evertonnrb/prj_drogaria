package br.com.nrbsistemas.dao;

import java.util.List;

import javax.swing.JOptionPane;

import org.junit.Ignore;
import org.junit.Test;

import br.com.nrbsistemas.domain.Estado;
import br.com.nrbsistemas.domain.Fabricante;

public class FabricanteDaoTest {
	@Test
	@Ignore
	public void salvar() {
		// Test salvar fabricante
		Fabricante fabricante =  new Fabricante();
		fabricante.setDescrisao("Fabrite de marihuana");
		FabricanteDao fabricanteDao = new FabricanteDao();
		fabricanteDao.salvar(fabricante);
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
	

}
