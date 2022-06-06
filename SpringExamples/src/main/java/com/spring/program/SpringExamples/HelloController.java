package com.spring.program.SpringExamples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	/*@RequestMapping("/hello1")
	public String hello1() {
			return "My Spring Example";
			} 
	
	@RequestMapping("/maitrai")
   public String maitrai() {
	      return "hello maitrai";
	}*/
	
	
			@PostMapping("/postmap")
			public String post(String str) {
					return "hi....postmapping"+str;
					} 
   
		}