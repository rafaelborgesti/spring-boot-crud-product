package com.crud.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.product.entity.Product;
import com.crud.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public Product saveProduct(Product product) {
		return repository.save(product);
	}
	
	public List<Product> saveProducts(List<Product> products) {
		return repository.saveAll(products);
	}
	
	public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product deleted! " + id;
    }
	
	public Product updateProduct(Product product) {
        Product hasProduct = repository.findById(product.getId()).orElse(null);
        hasProduct.setName(product.getName());
        hasProduct.setQuantity(product.getQuantity());
        hasProduct.setPrice(product.getPrice());
        return repository.save(hasProduct);
    }

}
