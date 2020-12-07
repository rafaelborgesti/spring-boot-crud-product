package com.crud.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
