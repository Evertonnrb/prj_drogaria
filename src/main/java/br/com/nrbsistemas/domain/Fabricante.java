package br.com.nrbsistemas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Fabricante extends GenericDomain{
	
	@Column(length = 50, nullable = false)
	private String descrisao;

	public String getDescrisao() {
		return descrisao;
	}

	public void setDescrisao(String descrisao) {
		this.descrisao = descrisao;
	}
}
