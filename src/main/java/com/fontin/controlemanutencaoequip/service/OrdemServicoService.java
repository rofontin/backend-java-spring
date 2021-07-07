package com.fontin.controlemanutencaoequip.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fontin.controlemanutencaoequip.entity.Cliente;
import com.fontin.controlemanutencaoequip.entity.Equipamento;
import com.fontin.controlemanutencaoequip.entity.OrdemServico;
import com.fontin.controlemanutencaoequip.entity.Responsavel;
import com.fontin.controlemanutencaoequip.repository.OrdemServicoRepository;
import com.fontin.controlemanutencaoequip.vo.OrdemServicoVO;

@Service
public class OrdemServicoService {
	
	@Autowired
	private OrdemServicoRepository ordemServicoRepository;
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private EquipamentoService equipamentoService;
	
	@Autowired
	private ResponsavelService responsavelService;

	public List<OrdemServico> findAll() {
		return ordemServicoRepository.findAll();
	}

	public ResponseEntity<OrdemServico> findById(Long ordemServicoId) {
		OrdemServico ordemServico = ordemServicoRepository.findById(ordemServicoId)
				.orElseThrow(() -> new NoSuchElementException("Ordem de Serviço não encontrado pelo Id:"+ ordemServicoId));
	        
		return ResponseEntity.ok().body(ordemServico);
	}
	
	public List<OrdemServico> findOrdensServicoPendentePorResponsavel(Long responsavelId) {
		return ordemServicoRepository.findOrdensServicoPendentePorResponsavel(responsavelId);
	}

	public OrdemServico save(OrdemServicoVO ordemServicoVO) {
		ResponseEntity<Cliente> cliente = clienteService.findById(ordemServicoVO.getIdCliente());
		ResponseEntity<Equipamento> equipamento = equipamentoService.findById(ordemServicoVO.getIdEquipamento());
		ResponseEntity<Responsavel> responsavel = responsavelService.findById(ordemServicoVO.getIdResponsavel());
		
		OrdemServico ordemServico = new OrdemServico();
		ordemServico.setDescricao(ordemServico.getDescricao());
		ordemServico.setPendente(true);
		ordemServico.setCliente(cliente.getBody());
		ordemServico.setEquipamento(equipamento.getBody());
		ordemServico.setResponsavel(responsavel.getBody());
		
		return ordemServicoRepository.save(ordemServico);
	}
	
	public OrdemServico iniciarOrdemServico(Long idOrdemServico, Date data) {
		ResponseEntity<OrdemServico> ordemServico = findById(idOrdemServico);
		ordemServico.getBody().setDataInicio(data);
		
		return update(ordemServico.getBody().getIdOrdemServico());
	}
	
	public OrdemServico finalizarOrdemServico(Long idOrdemServico, Date data) {
		ResponseEntity<OrdemServico> ordemServico = findById(idOrdemServico);
		
		if(ordemServico.getBody().getDataInicio() != null && ordemServico.getBody().isPendente()) {
			ordemServico.getBody().setDataTermino(data);
			ordemServico.getBody().setPendente(false);
			
			return update(ordemServico.getBody().getIdOrdemServico());
		} else {
			throw new RuntimeException("Não é possível finalizar a Ordem de Serviço do equipamento: " 
					+ ordemServico.getBody().getEquipamento().getNome() + ", pois ainda não foi iniciada ou não a mais pendencias!");
		}
	}

	public OrdemServico update(Long idOrdemServico) {
		ResponseEntity<OrdemServico> ordemServico = findById(idOrdemServico);
		
		return ordemServicoRepository.save(ordemServico.getBody());
	}
}
