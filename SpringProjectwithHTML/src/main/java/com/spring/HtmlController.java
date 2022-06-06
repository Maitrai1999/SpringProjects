package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HtmlController {
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello()
	{
	return "index";
	}
	@RequestMapping(value="/first", method=RequestMethod.GET)
	public String first()
	{
	return "first";
	}
	
	}
