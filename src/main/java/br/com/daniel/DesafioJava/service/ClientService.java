package br.com.daniel.DesafioJava.service;

import java.util.List;
import java.util.Optional;

import br.com.daniel.DesafioJava.entity.Client;

public interface ClientService {
	
	List<Client>FindAll();

	Optional<Client> findById(Integer id);
	
	Client update(Client client);

	Client save(Client client);

	void delete(Integer id);

}
