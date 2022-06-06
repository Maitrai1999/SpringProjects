package com.spring.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService  {
	@Autowired
	private StudentRepository studentrepository;


	public Student addstudent(Student s) {
		return studentrepository.save(s);
	}
	
	public List<Student> getStudent(){
		return studentrepository.findAll();
	}
	
	public Student updatestudent(Student s) {
		return studentrepository.save(s);
	}
	public Object deleteById(int parseInt) {
		Student entity=studentrepository.getById(parseInt);
		studentrepository.delete(entity);
		return entity;
	}
	
}
