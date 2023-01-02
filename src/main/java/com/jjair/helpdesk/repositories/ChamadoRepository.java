package com.jjair.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjair.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

	
}
