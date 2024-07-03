package com.tharun.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	
	@GetMapping("/hello")
	public String greet()
	{
		return "Welcome to java";
	}
	

}
