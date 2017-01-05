package br.com.nrbsistemas.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.nrbsistemas.domain.Fabricante;
import br.com.nrbsistemas.domain.Produto;

public class ProdutoDaoTest {
	@Test
	@Ignore
	public void salvar() {

		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(new Long("3"));

		Produto produto = new Produto();
		produto.setDescrisao("Xarope, para tosse seca e espectorante");
		produto.setFabricante(fabricante);
		produto.setValor(new BigDecimal("32.25"));
		produto.setQuantidade(new Short("500"));

		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvar(produto);
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 1L;
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.buscar(codigo);
		if (produto != null) {
			System.out.println("Produto :: " + produto.getDescrisao());
		} else {
			System.out.println("Produto não encontrado");
		}

	}
	@Test
	@Ignore
	public void excluir(){
		Long codigo = 3L;
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.buscar(codigo);
		
		if(produto != null){
			System.out.println("Produto excluido "+produto.getDescrisao());
			produtoDao.excluir(produto);
			System.out.println("Produto excluido com sucesso");
		}else{
			System.out.println("Produto não encontrado");
		}
	}
	@Ignore
	@Test
	public void listar() {
		ProdutoDao produtoDao = new ProdutoDao();
		List<Produto> res = produtoDao.listar();
		for (Produto produto : res) {
			System.out.println("======== \n" + produto.getDescrisao() + " " + produto.getFabricante().getDescrisao() + " " + " "
					+ produto.getValor() + " " + produto.getQuantidade());
		}
	}

	@Test
	@Ignore
	public void alterar() {
		Long codigo = 40L;

		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(codigo);
		
		ProdutoDao produtoDao = new ProdutoDao();
		Produto produto = produtoDao.buscar(codigo);
		if(produto !=  null){
			System.out.println("Produto encontrado " + produto.getDescrisao());
			produto.setDescrisao("Viagra para matar o veio");
			produto.setFabricante(fabricante);
			produto.setQuantidade(new Short("30"));
			produto.setValor(new BigDecimal("10.99"));
			produtoDao.atualizar(produto);
			System.out.println("Produto alterado com sucesso");
		}else{
			System.out.println("Produto não cadastrado");
		}
	}
}
