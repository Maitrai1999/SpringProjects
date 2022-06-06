package com.spring.restapi;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;


public interface StudentRepository extends JpaRepository<Student,Integer> {

	}
