package com.fontin.controlemanutencaoequip.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fontin.controlemanutencaoequip.entity.Cliente;
import com.fontin.controlemanutencaoequip.repository.ClienteRepository;
import com.fontin.controlemanutencaoequip.vo.ClienteVO;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public ResponseEntity<Cliente> findById(Long clienteId) {
		Cliente cliente = clienteRepository.findById(clienteId)
				.orElseThrow(() -> new NoSuchElementException("Cliente não encontrado pelo Id:"+ clienteId));
	        
		return ResponseEntity.ok().body(cliente);
	}

	public Cliente save(ClienteVO clienteVO) {
		Cliente cliente = new Cliente();
		cliente.setNome(clienteVO.getNome());
		cliente.setEndereco(clienteVO.getEndereco());
		cliente.setEmail(clienteVO.getEmail());
		cliente.setTelefone(clienteVO.getTelefone());
		
		return clienteRepository.save(cliente);
	}
}
