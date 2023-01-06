package com.jjair.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjair.helpdesk.domain.Chamado;
import com.jjair.helpdesk.domain.Cliente;
import com.jjair.helpdesk.domain.Tecnico;
import com.jjair.helpdesk.domain.enums.Perfil;
import com.jjair.helpdesk.domain.enums.Prioridade;
import com.jjair.helpdesk.domain.enums.Status;
import com.jjair.helpdesk.repositories.ChamadoRepository;
import com.jjair.helpdesk.repositories.ClienteRepository;
import com.jjair.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {


	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null,"Jose Jair","37127870225","softcon@gmail.com","123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null,"Linus Torvale","245781258520","torvale@gmail.com","1230");
		
		Chamado c1 = new Chamado(null,Prioridade.MEDIA,Status.ANDAMENTO,"Chamado 01", "Primeira Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}
	
}
