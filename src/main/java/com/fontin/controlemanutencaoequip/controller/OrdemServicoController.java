package com.fontin.controlemanutencaoequip.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fontin.controlemanutencaoequip.entity.OrdemServico;
import com.fontin.controlemanutencaoequip.service.OrdemServicoService;
import com.fontin.controlemanutencaoequip.vo.OrdemServicoVO;

@RestController
@RequestMapping("/ordensservico")
public class OrdemServicoController {
	
	private static final String APPLICATION_JSON = "application/json";
	private static final String APPLICATION_XML = "application/xml";
	private static final String APPLICATION_XYAML = "application/x-yaml";
	
	@Autowired
	private OrdemServicoService ordemServicoService;
	
	@GetMapping
	public List<OrdemServico> getAllOrdensServico() {
		return ordemServicoService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrdemServico> getEquipementoById(@PathVariable(value = "id") Long ordemServicoId){
		return ordemServicoService.findById(ordemServicoId);
	}
	
	@GetMapping("findordensservicopendenteporresponsavel/{id}")
	public List<OrdemServico> findOrdensServicoPendentePorResponsavel(@PathVariable(value = "id") Long responsavelId){
		return ordemServicoService.findOrdensServicoPendentePorResponsavel(responsavelId);
	}
	
	@PostMapping(produces = {APPLICATION_JSON,APPLICATION_XML,APPLICATION_XYAML}, 
		     consumes = {APPLICATION_JSON,APPLICATION_XML,APPLICATION_XYAML})
	public OrdemServico create(@RequestBody OrdemServicoVO ordemServicoVO) {
		return ordemServicoService.save(ordemServicoVO);
	}
	
	@PutMapping(path = {"/iniciar/{id}"}, produces = {APPLICATION_JSON,APPLICATION_XML,APPLICATION_XYAML})
	public OrdemServico iniciarOrdemServico(@PathVariable(value = "id") Long ordemServicoId,
											@RequestParam("data") @DateTimeFormat(pattern="yyyy-MM-dd") Date data) {
		
		return ordemServicoService.iniciarOrdemServico(ordemServicoId, data);
	}
	
	@PutMapping(path = {"/finalizar/{id}"}, produces = {APPLICATION_JSON,APPLICATION_XML,APPLICATION_XYAML})
	public OrdemServico finalizarOrdemServico(@PathVariable(value = "id") Long ordemServicoId,
											  @RequestParam("data") @DateTimeFormat(pattern="yyyy-MM-dd") Date data) {
		
		return ordemServicoService.finalizarOrdemServico(ordemServicoId, data);
	}
}
