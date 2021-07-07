package com.fontin.controlemanutencaoequip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fontin.controlemanutencaoequip.entity.Equipamento;
import com.fontin.controlemanutencaoequip.service.EquipamentoService;
import com.fontin.controlemanutencaoequip.vo.EquipamentoVO;

@RestController
@RequestMapping("/equipamentos")
public class EquipamentoController {
	
	@Autowired
	private EquipamentoService equipamentoService;
	  
	@GetMapping
	public List<Equipamento> getAllEquipamentos() {
		return equipamentoService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Equipamento> getEquipementoById(@PathVariable(value = "id") Long equipamentoId){
		return equipamentoService.findById(equipamentoId);
	}
	
	@PostMapping(produces = {"application/json","application/xml","application/x-yaml"}, 
		     consumes = {"application/json","application/xml","application/x-yaml"})
	public Equipamento create(@RequestBody EquipamentoVO equipamentoVO) {
		return equipamentoService.save(equipamentoVO);
	}
}

