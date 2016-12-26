package br.com.nrbsistemas.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity

public class Produto extends GenericDomain {
	
	@Column(length = 80, nullable = false)
	private String descrisao;
	
	@Column(nullable = false)
	private Short quantidade;
	
	// precision == qtd digitos, scale == qtd depois ,
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal valor;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Fabricante fabricante;

	public String getDescrisao() {
		return descrisao;
	}

	public void setDescrisao(String descrisao) {
		this.descrisao = descrisao;
	}

	public Short getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
