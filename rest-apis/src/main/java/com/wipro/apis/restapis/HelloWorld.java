package com.wipro.apis.restapis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World";
	}
	
	
	@GetMapping("/helloworldbean/{msg}")
	public HelloWorldBean helloWorldBean(@PathVariable String msg) {
		System.out.println(msg);
		return new HelloWorldBean("Hello World "+ msg);
	}
}
