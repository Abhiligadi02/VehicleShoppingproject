package com.springboot.learning;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	
	@GetMapping("/Hello-world")
	public String helloworld() {
		return "SLk Hello World";
	}

}
