package br.com.nrbsistemas.dao;

import java.math.BigDecimal;

import org.junit.Test;

import br.com.nrbsistemas.domain.Fabricante;
import br.com.nrbsistemas.domain.Produto;

public class ProdutoDaoTest {
	@Test
	public void salvar() {
		
		FabricanteDao fabricanteDao = new FabricanteDao();
		Fabricante fabricante = fabricanteDao.buscar(new Long("2"));

		Produto produto = new Produto();
		produto.setDescrisao("Paracetamol 100mg caixa com 10 comprimidos");
		produto.setFabricante(fabricante);
		produto.setValor(new BigDecimal("11.99"));
		produto.setQuantidade(new Short("100"));

		ProdutoDao produtoDao = new ProdutoDao();
		produtoDao.salvar(produto);
	}
}
