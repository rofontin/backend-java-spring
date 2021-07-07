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

import com.fontin.controlemanutencaoequip.entity.Cliente;
import com.fontin.controlemanutencaoequip.service.ClienteService;
import com.fontin.controlemanutencaoequip.vo.ClienteVO;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> getAllClientes() {
		return clienteService.findAll();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getEquipementoById(@PathVariable(value = "id") Long clienteId){
		return clienteService.findById(clienteId);
	}
	
	@PostMapping(produces = {"application/json","application/xml","application/x-yaml"}, 
		     consumes = {"application/json","application/xml","application/x-yaml"})
	public Cliente create(@RequestBody ClienteVO clienteVO) {
		
		return clienteService.save(clienteVO);
	}
}
