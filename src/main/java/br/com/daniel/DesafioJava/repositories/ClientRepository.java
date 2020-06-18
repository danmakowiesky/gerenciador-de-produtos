package br.com.daniel.DesafioJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniel.DesafioJava.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
