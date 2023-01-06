package com.jjair.helpdesk.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjair.helpdesk.domain.Tecnico;
import com.jjair.helpdesk.repositories.TecnicoRepository;
import com.jjair.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository repository;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objecto não encontrado! Id:" + id));
	}
}
