package br.com.daniel.DesafioJava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniel.DesafioJava.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
