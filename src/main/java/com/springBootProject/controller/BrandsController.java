package com.springBootProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springBootProject.model.Brands;
import com.springBootProject.service.BrandsService;

@RestController
public class BrandsController {

	@Autowired
	private BrandsService brandsService;

	@GetMapping(value = "/brands")
	public ResponseEntity GetBrands() {
		List<Brands> listBrands = brandsService.GetBrands();
		return new ResponseEntity<>(listBrands, HttpStatus.OK);

	}
}
