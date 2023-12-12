package com.springBootProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBootProject.model.Brands;
import com.springBootProject.repository.BrandsRepository;

import io.swagger.v3.oas.annotations.servers.Server;

@Service
public class BrandsService {

	@Autowired
	private BrandsRepository brandsRepository;

	public List<Brands> GetBrands() {
		return brandsRepository.findAll();
	};

}
