package com.ibm.containercrush.shoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.containercrush.shoes.service.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/product")
public class ProductController {
	
	private ProductService productService;
	private ResponseEntity<?> responseEntity;
	
	public ProductController() { }

	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("catalog")
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ResponseEntity<?> getAllProductCatalog() {
		responseEntity = new ResponseEntity(productService.getAllProductCatalog(), HttpStatus.OK);
		return responseEntity;
	}
}
