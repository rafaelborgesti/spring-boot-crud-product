package com.crud.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
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

}
