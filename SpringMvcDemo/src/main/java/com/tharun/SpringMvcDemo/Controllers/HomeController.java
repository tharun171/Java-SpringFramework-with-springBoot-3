package com.tharun.SpringMvcDemo.Controllers;

import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	//@ModelAttribute at method level is used for dynamic loadng of values
	
		@ModelAttribute("course")
		public String courseName()
		{
			return "java";
		}
		
	
	@GetMapping({"/","/home1"})
	public ModelAndView homePage()
	{
		System.out.println("inside controller");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("HomePage");
		mav.addObject("DeveloperBean",new Developer());
		mav.setStatus(HttpStatusCode.valueOf(200));
		return mav;
	}
	
	/*
	@GetMapping("/add")
	//doing it servlet way
	public ModelAndView add(HttpServletRequest req,
			HttpSession sess)
	{
		System.out.println("in add page");
		ModelAndView mav = new ModelAndView();
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		
		sess.setAttribute("result",a+b);
		mav.setViewName("HomePage");
		mav.addObject("a",a);
		mav.addObject("b",b);
		mav.setStatus(HttpStatusCode.valueOf(200));
		return mav;
	}
	*/
	
	@GetMapping("/add")
	//doing it servlet way
	public ModelAndView add(@RequestParam("num1") int a,
			@RequestParam("num2") int b,
			HttpSession sess)
	{
		System.out.println("in add page");
		ModelAndView mav = new ModelAndView();
		sess.setAttribute("result",a+b);
		mav.setViewName("HomePage");
		mav.addObject("a",a);
		mav.addObject("b",b);
		mav.addObject("result",a+b);
		mav.setStatus(HttpStatusCode.valueOf(200));
		return mav;
	}
	
	@GetMapping("/addDev")
	//doing it servlet way
	public ModelAndView addDev(Developer dev)
	//we can excluse @ModelAttribute and simply write Developer dev
	//Developer is class Name, dev is var Name
	{
		System.out.println("in addDev page");
		ModelAndView mav = new ModelAndView();
		System.out.println(dev.toString());
		mav.setViewName("HomePage");
		mav.addObject("developer",dev);
		mav.setStatus(HttpStatusCode.valueOf(200));
		return mav;
	}
	
	
	

}
