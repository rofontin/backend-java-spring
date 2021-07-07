package com.fontin.controlemanutencaoequip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fontin.controlemanutencaoequip.entity.OrdemServico;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{

	@Query("SELECT o FROM OrdemServico o join o.responsavel r WHERE r.idResponsavel = :idResponsavel and o.pendente = 1")
	List<OrdemServico> findOrdensServicoPendentePorResponsavel(Long idResponsavel);
}
