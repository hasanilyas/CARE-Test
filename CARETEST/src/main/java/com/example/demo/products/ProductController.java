package com.example.demo.products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	
	//GET
	@RequestMapping(value = "/products", method = RequestMethod.GET)  //localhost:8080/warehouses
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Product> getproduct(){
		return productService.getAllProducts();
	}
	
	@RequestMapping(value ="/products/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public Product getProductById(@PathVariable int id){
		return productService.getProduct(id);
	}
	
	//POST
	@RequestMapping(value="/products/add", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public void addProduct(@RequestBody Product product){
		 productService.addProduct(product);
	}
	
	//PUT
	@RequestMapping(value="/products/edit", method = RequestMethod.PUT)
	@CrossOrigin(origins = "http://localhost:4200")
	public void editProduct(@RequestBody Product product){
		productService.editProduct(product);
	}
	
	//Delete
	@RequestMapping(value="/products/delete/{id}", method= RequestMethod.DELETE)
	@CrossOrigin(origins = "http://localhost:4200")
	public void deleteProduct(@PathVariable int id){
		productService.deleteProduct(id);
	}
}
