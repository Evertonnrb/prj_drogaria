package br.com.nrbsistemas.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemVenda extends GenericDomain{
	
	@Column(nullable = false)
	private Short quantidade;
	
	@Column(nullable = false, precision = 6, scale =2)
	private BigDecimal precoParcial;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Venda venda;
}
