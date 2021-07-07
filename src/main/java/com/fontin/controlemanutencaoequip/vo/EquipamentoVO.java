package com.fontin.controlemanutencaoequip.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idEquipamento","nome","tipo"})
public class EquipamentoVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty("idEquipamento")
	private Long idEquipamento;
	
	@JsonProperty("nome")
	private String nome;
	
	@JsonProperty("tipo")
	private String tipo;

	public Long getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Long idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
