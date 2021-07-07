package com.fontin.controlemanutencaoequip.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity(name = "ORDEMSERVICO")
public class OrdemServico {
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "ORDEMSERVICO_IDORDEMSERVICO", sequenceName = "IDORDEMSERVICO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDEMSERVICO_IDORDEMSERVICO")
	@Column(name = "IDORDEMSERVICO")
	private Long idOrdemServico;
	
	@ManyToOne
	@JoinColumn(name="IDCLIENTE")
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name="IDEQUIPAMENTO")
	private Equipamento equipamento;
	
	@Column(name = "DESCRICAO")
	private String descricao;
	
	@Column(name = "PENDENTE")
	private boolean pendente;
	
	@Column(name = "DATAINICIO")
	private Date dataInicio;
	
	@Column(name = "DATATERMINO")
	private Date dataTermino;

	public Long getIdOrdemServico() {
		return idOrdemServico;
	}

	public void setIdOrdemServico(Long idOrdemServico) {
		this.idOrdemServico = idOrdemServico;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isPendente() {
		return pendente;
	}

	public void setPendente(boolean pendente) {
		this.pendente = pendente;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
}
