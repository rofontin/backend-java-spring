package com.fontin.controlemanutencaoequip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Cliente {
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "CLIENTE_IDCLIENTE", sequenceName = "IDCLIENTE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE_IDCLIENTE")
	@Column(name = "IDCLIENTE")
	private Long idCliente;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "ENDERECO")
	private String endereco;
	
	@Column(name = "TELEFONE")
	private Long telefone;
	
	@Column(name = "EMAIL")
	private String email;
	
	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
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

	public Long getTelefone() {
		return telefone;
	}

	public void setTelefone(Long telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
