package com.tharun.springMvcDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	/*
	@GetMapping({"/","/home"})
	public ModelAndView getRoot()
	{
		System.out.println("inside controller");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Home");
		return mav;
	}
	*/
	
	@GetMapping({"/","/home"})
	public String getRoot()
	{
		System.out.println("inside controller");
		//ModelAndView mav = new ModelAndView();
		//mav.setViewName("Home");
		return "Home";
	}
	
	@GetMapping("/add")
	public ModelAndView addDev(Developer dev)
	{
		System.out.println("inside add method");
		System.out.println("dev: "+dev.toString());
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Home");
		mav.addObject("deve",dev);
		return mav;
	}
	
}
