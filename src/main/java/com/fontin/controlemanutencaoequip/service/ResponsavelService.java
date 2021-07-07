package com.fontin.controlemanutencaoequip.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fontin.controlemanutencaoequip.entity.Responsavel;
import com.fontin.controlemanutencaoequip.repository.ResponsavelRepository;
import com.fontin.controlemanutencaoequip.vo.ResponsavelVO;

@Service
public class ResponsavelService {

	@Autowired
	private ResponsavelRepository responsavelRepository;

	public List<Responsavel> findAll() {
		return responsavelRepository.findAll();
	}

	public ResponseEntity<Responsavel> findById(Long responsavelId) {
		Responsavel responsavel = responsavelRepository.findById(responsavelId)
				.orElseThrow(() -> new NoSuchElementException("Responsavel não encontrado pelo Id:"+ responsavelId));
	        
		return ResponseEntity.ok().body(responsavel);
	}

	public Responsavel save(ResponsavelVO responsavelVO) {
		Responsavel responsavel = new Responsavel();
		responsavel.setNome(responsavelVO.getNome());
		responsavel.setEndereco(responsavelVO.getEndereco());
		responsavel.setEmail(responsavelVO.getEmail());
		responsavel.setCargo(responsavelVO.getCargo());
		
		return responsavelRepository.save(responsavel);
	}
}
