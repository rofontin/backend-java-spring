package com.fontin.controlemanutencaoequip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fontin.controlemanutencaoequip.entity.OrdemServico;

@Repository
public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long>{

}
