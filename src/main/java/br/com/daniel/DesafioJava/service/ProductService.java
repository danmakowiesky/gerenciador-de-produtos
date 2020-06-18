package br.com.daniel.DesafioJava.service;

import java.util.List;
import java.util.Optional;

import br.com.daniel.DesafioJava.entity.Product;

public interface ProductService {

	List<Product>FindAll();

	Optional<Product> findById(Integer id);
	
	Product update(Product product);

	Product save(Product product);

	void delete(Integer id);

}
