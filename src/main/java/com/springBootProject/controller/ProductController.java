package com.springBootProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerRequest.Headers;

import com.springBootProject.model.Product;
import com.springBootProject.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@GetMapping(value = "/products")
	public ResponseEntity GetProduct() {

		List<Product> listProduct = productService.GetProcut();
		return new ResponseEntity<>(listProduct, HttpStatus.OK);

	}

}
