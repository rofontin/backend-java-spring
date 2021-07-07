package com.fontin.controlemanutencaoequip.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idCliente","nome","endereco","telefone","email"})
public class ClienteVO implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("idCliente")
	private Long idCliente;

	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("endereco")
	private String endereco;
	
	@JsonProperty("telefone")
	private Long telefone;
	
	@JsonProperty("email")
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
