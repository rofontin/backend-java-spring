package com.fontin.controlemanutencaoequip.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idResponsavel","nome","endereco","cargo","email"})
public class ResponsavelVO implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@JsonProperty("idResponsavel")
	private Long idResponsavel;

	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("endereco")
	private String endereco;
	
	@JsonProperty("cargo")
	private String cargo;
	
	@JsonProperty("email")
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
