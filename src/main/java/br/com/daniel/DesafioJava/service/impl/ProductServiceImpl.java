package br.com.daniel.DesafioJava.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.daniel.DesafioJava.repositories.ProductRepository;

import org.springframework.stereotype.Service;

import br.com.daniel.DesafioJava.entity.Product;
import br.com.daniel.DesafioJava.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private  ProductRepository productRepository;

	public List<Product> FindAll() {
		return this.productRepository.findAll();
	}
	
	@Override
	public Optional<Product> findById(Integer id) {
		return this.productRepository.findById(id);
	}

	@Override
	public Product update(Product product) {
		return this.productRepository.save(product);
	}

	public Product save(Product product) {
		return this.productRepository.save(product);
	}

	@Override
	public void delete(Integer id) {
		this.productRepository.deleteById(id);
	}

}
