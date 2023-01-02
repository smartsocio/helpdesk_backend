package com.jjair.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjair.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	
}
