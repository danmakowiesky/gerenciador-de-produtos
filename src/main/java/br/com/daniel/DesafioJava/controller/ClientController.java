package br.com.daniel.DesafioJava.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.DesafioJava.entity.Client;
import br.com.daniel.DesafioJava.service.ClientService;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {
	@Autowired
	private ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<Client>> getClients(){
		List<Client> clients = clientService.FindAll();
		return ResponseEntity.ok().body(clients);	
		
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<Client>> listarPorId(@PathVariable(name= "id") Integer id){
		return ResponseEntity.ok(this.clientService.findById(id));
	}
	
	@PutMapping(path = "/update/{id}")
	public ResponseEntity<Client> atualizar(@PathVariable(name= "id") Integer id,@RequestBody Client client){
		client.setId(id);
		return ResponseEntity.ok(this.clientService.update(client));
	}
}
