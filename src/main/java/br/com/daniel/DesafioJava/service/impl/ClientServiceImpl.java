package br.com.daniel.DesafioJava.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daniel.DesafioJava.entity.Client;
import br.com.daniel.DesafioJava.repositories.ClientRepository;
import br.com.daniel.DesafioJava.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Client> FindAll() {
		return this.clientRepository.findAll();
	}
}
