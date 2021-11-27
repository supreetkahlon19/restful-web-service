package com.rest.webservices.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// controller means handling HTTP request 
//mark this as Controller
@RestController
public class HelloWorldController {

	// create mapping for this method
	//@RequestMapping(method = RequestMethod.GET, path = "/Hello-World")
	@GetMapping(path ="/Hello-World")
	public String helloWorld() {
		
		return "Hello World";
		
	}
	
	// create and return a bean instead of string
	@GetMapping(path ="/Hello-World-Bean")
	public HelloWorldBean helloWorldBean() {
		
		return new HelloWorldBean("Hello World");
		
	}
	
	@GetMapping(path ="/Hello-World/path-variable/{name}")
	public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("Hello World, %s" , name)); //%s will be replaced by name 
		
	}
	   
	
} 
