package br.com.daniel.DesafioJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
