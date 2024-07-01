package com.tharun.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {

	
	@GetMapping("/hello")
	@ResponseBody
	public String greet(HttpServletRequest req)
	{
		System.out.println("in controller");
		return "Hello world "+req.getSession().getId();
	}
	
	@GetMapping("/about")
	@ResponseBody
	public String about(HttpServletRequest req)
	{
		System.out.println("in controller - about");
		return "about "+req.getSession().getId();
	}
}
