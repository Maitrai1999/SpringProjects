package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.spring.dao.ProductRepository;
import com.spring.entity.Product;

@Service
	public class ProductService {
		@Autowired
		private ProductRepository productRepository;

	
		public Product addproduct(Product p) {
			return productRepository.save(p);
		}

		public List<Product> getProduct() {
			return productRepository.findAll();
}
		public Product updateproduct(Product p) {
			return productRepository.save(p);
		}
		public void del(Integer id) {
			productRepository.deleteById(id);
			
		} 
		public Product getProduct(Integer id) {
			return productRepository.findById(id).orElseThrow(null);
		}
	/*	public Object getProduct(String pname) {
			return productRepository.findAll(pname);
		} */
		
}



