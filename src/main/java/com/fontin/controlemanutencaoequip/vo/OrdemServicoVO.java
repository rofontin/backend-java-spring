package com.fontin.controlemanutencaoequip.vo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"idOrdemServico","idCliente","idEquipamento","descricao"})
public class OrdemServicoVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty("idOrdemServico")
	private Long idOrdemServico;
	
	@JsonProperty("idCliente")
	private Long idCliente;
	
	@JsonProperty("idEquipamento")
	private Long idEquipamento;
	
	@JsonProperty("descricao")
	private String descricao;
	
	public Long getIdOrdemServico() {
		return idOrdemServico;
	}

	public void setIdOrdemServico(Long idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdEquipamento() {
		return idEquipamento;
	}

	public void setIdEquipamento(Long idEquipamento) {
		this.idEquipamento = idEquipamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
