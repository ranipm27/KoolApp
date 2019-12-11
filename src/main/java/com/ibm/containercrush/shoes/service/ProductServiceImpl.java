package com.ibm.containercrush.shoes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.containercrush.shoes.domain.ProductCatalog;
import com.ibm.containercrush.shoes.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository repository;
	
	@Autowired
	public ProductServiceImpl(ProductRepository repository) {
		this.repository = repository;
	}



	@Override
	public List<ProductCatalog> getAllProductCatalog() {
		return repository.findAll();
	}
}
