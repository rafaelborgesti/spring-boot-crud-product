package com.crud.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.product.entity.Product;
import com.crud.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(value="/addProduct")
	public Product addProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }
	
	@DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
