package com.trinadh.webServices.webservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200" )
public class HomeController {
	
	
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "hello world get mapping";
	}

	
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloworldBean() {
		System.out.println("helloWorldBean");
		
		//throw new RuntimeException("some error happened, please contact support ***");
		
		return new HelloWorldBean("Hello trinadh helloWorldBean");
	}
	
	
	//adding path variable to the url
	@GetMapping(path = "/hello-world-bean/{name}")
	public HelloWorldBean helloworldBean(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
		
}

