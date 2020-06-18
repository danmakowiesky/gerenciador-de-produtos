package br.com.daniel.DesafioJava.service.impl;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Optional<Client> findById(Integer id) {
		return this.clientRepository.findById(id);
	}

	@Override
	public Client update(Client client) {
		return this.clientRepository.save(client);
	}

	public Client save(Client client) {
		return this.clientRepository.save(client);
	}

	@Override
	public void delete(Integer id) {
		this.clientRepository.deleteById(id);
	}
}
