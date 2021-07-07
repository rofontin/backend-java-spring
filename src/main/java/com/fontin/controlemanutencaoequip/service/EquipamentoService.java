package com.fontin.controlemanutencaoequip.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fontin.controlemanutencaoequip.entity.Equipamento;
import com.fontin.controlemanutencaoequip.repository.EquipamentoRepository;
import com.fontin.controlemanutencaoequip.vo.EquipamentoVO;

@Service
public class EquipamentoService {
	
	@Autowired
	private EquipamentoRepository equipamentoRepository;

	public List<Equipamento> findAll() {
		return equipamentoRepository.findAll();
	}

	public ResponseEntity<Equipamento> findById(Long equipamentoId) {
		Equipamento equipamento = equipamentoRepository.findById(equipamentoId)
				.orElseThrow(() -> new NoSuchElementException("Equipamento não encontrado pelo Id:"+equipamentoId));
	        
		return ResponseEntity.ok().body(equipamento);
	}

	public Equipamento save(EquipamentoVO equipamentoVO) {
		Equipamento equipamento = new Equipamento();
		equipamento.setNome(equipamentoVO.getNome());
		equipamento.setTipo(equipamentoVO.getTipo());
		
		return equipamentoRepository.save(equipamento);
	}
}
