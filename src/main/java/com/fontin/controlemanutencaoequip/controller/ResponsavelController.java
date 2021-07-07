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

import com.fontin.controlemanutencaoequip.entity.Responsavel;
import com.fontin.controlemanutencaoequip.service.ResponsavelService;
import com.fontin.controlemanutencaoequip.vo.ResponsavelVO;

@RestController
@RequestMapping("/responsaveis")
public class ResponsavelController {
	
	@Autowired
	private ResponsavelService responsavelService;
	
	@GetMapping
	public List<Responsavel> getAllClientes() {
		return responsavelService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Responsavel> getEquipementoById(@PathVariable(value = "id") Long responsavelId){
		return responsavelService.findById(responsavelId);
	}
	
	@PostMapping(produces = {"application/json","application/xml","application/x-yaml"}, 
		     consumes = {"application/json","application/xml","application/x-yaml"})
	public Responsavel create(@RequestBody ResponsavelVO responsavelVO) {
		
		return responsavelService.save(responsavelVO);
	}
}
