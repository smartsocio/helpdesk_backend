package com.jjair.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjair.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

	
}
