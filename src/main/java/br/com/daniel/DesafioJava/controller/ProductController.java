package br.com.daniel.DesafioJava.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.daniel.DesafioJava.entity.Product;
import br.com.daniel.DesafioJava.service.ProductService;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping
	public ResponseEntity<List<Product>> getProducts(){
		List<Product> product = productService.FindAll();
		return ResponseEntity.ok().body(product);	
		
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<Optional<Product>> listarPorId(@PathVariable(name= "id") Integer id){
		return ResponseEntity.ok(this.productService.findById(id));
	}
	
	@PutMapping(path = "/update/{id}")
	public ResponseEntity<Product> atualizar(@PathVariable(name= "id") Integer id,@RequestBody Product product){
		product.setId(id);
		return ResponseEntity.ok(this.productService.update(product));
	}
	
	@PostMapping
	public ResponseEntity<Product> cadastrar(@RequestBody Product product){
		return ResponseEntity.ok(this.productService.save(product));
	}
	
	@DeleteMapping(path = "/delete/{id}")
	public ResponseEntity<String> remover(@PathVariable(name= "id") Integer id){
		this.productService.delete(id);
		return ResponseEntity.ok("Product has been deleted");
	}
}
