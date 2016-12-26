package br.com.nrbsistemas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain {
	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 14, nullable = false)
	private String cpf;

	@Column(length = 15)
	private String rg;

	@Column(length = 40, nullable = false)
	private String rua;

	@Column(length = 10, nullable = false)
	private Short numero;

	@Column(length = 50)
	private String bairro;

	@Column(length = 15, nullable = false)
	private String cep;

	@Column(length = 10, nullable = false)
	private String complememto;

	@Column(length = 16, nullable = false)
	private String telefone;

	@Column(length = 15, nullable = false)
	private String celular;

	@Column(nullable = false)
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Short getNumero() {
		return numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getComplememto() {
		return complememto;
	}

	public void setComplememto(String complememto) {
		this.complememto = complememto;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
