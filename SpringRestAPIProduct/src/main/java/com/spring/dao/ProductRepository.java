package com.spring.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Integer> {

	

}
