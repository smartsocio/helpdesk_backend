package com.jjair.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjair.helpdesk.domain.Chamado;
import com.jjair.helpdesk.repositories.ChamadoRepository;
import com.jjair.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {
	
	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrato! ID:" + id));
	}

	public List<Chamado> findALL() {
		return repository.findAll();
	}
}
