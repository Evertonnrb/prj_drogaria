package br.com.nrbsistemas.domain;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Caixa extends GenericDomain{
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAbertura;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataFechamento;
	
	@Column(nullable = false, precision =6, scale =2)
	private BigDecimal valor;

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Date getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(Date dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	
	
}
