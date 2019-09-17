package com.demo.productservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@GetMapping("/product")
	public Product getProduct() {
		Product p1 = new Product();
		p1.setName("laptop");
		p1.setPrice(100000);
		return p1;
	}

}
