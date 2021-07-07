package com.fontin.controlemanutencaoequip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Equipamento {
	
	@Id
	@SequenceGenerator(allocationSize = 1, name = "EQUIPAMENTO_IDEQUIPAMENTO", sequenceName = "IDEQUIPAMENTO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EQUIPAMENTO_IDEQUIPAMENTO")
	@Column(name = "IDEQUIPAMENTO")
	private Long idEquipamento;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "TIPO")
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
