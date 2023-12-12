package com.springBootProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootProject.model.Product;
import com.springBootProject.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> GetProcut() {
		return productRepository.findAll();
	}

}
