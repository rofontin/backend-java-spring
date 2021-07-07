package com.fontin.controlemanutencaoequip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Responsavel {

	@Id
	@SequenceGenerator(allocationSize = 1, name = "RESPONSAVEL_IDRESPONSAVEL", sequenceName = "IDRESPONSAVEL")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "RESPONSAVEL_IDRESPONSAVEL")
	@Column(name = "IDRESPONSAVEL")
	private Long idResponsavel;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "CARGO")
	private String cargo;
	
	@Column(name = "EMAIL")
	private String email;

	public Long getIdResponsavel() {
		return idResponsavel;
	}

	public void setIdResponsavel(Long idResponsavel) {
		this.idResponsavel = idResponsavel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
