package com.example.demo.products;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	
	//Return all Products
	public List<Product> getAllProducts(){
		List<Product> productList = new ArrayList<>();
		productRepository.findAll().forEach(productList::add);
		return productList;
	}
	
	//Return Single Products
	public Product getProduct(int id){
		Optional<Product> optionalProduct= productRepository.findById(id);
		if(optionalProduct.isPresent()){
			return optionalProduct.get();
			}	
		return null;
	}
	
	//Add New Products
	public void addProduct(Product product){
		productRepository.save(product);
	}
	
	//Edit Products
	public void editProduct(Product product){
		productRepository.save(product);
	}
	
	//Delete Products
	public void deleteProduct(int id){
		productRepository.deleteById(id);
	}
}
