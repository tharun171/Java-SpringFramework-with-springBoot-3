package com.tharun.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tharun.BusinessBeans.FresherBean;
import com.tharun.serviceDTO.ProjectService;

@Controller
public class MainController {

	@Autowired
	public ProjectService service;
	
	//localhost:9090/Fresher/
	/*
	 * {
    "fresherId": null,
    "fresherName": "John Doe",
    "fresherDoj": "15/06/2022",
    "fresherPrimarySkill": "Java"
}
	 */
	//add
	@PostMapping("/Fresher/")
	public ResponseEntity<FresherBean> addFresherDetails(@RequestBody FresherBean fresherBean)
	{
		System.out.println("inside addFresherDetails - controller");
		FresherBean savedFresherBean = service.addFresherDetails(fresherBean);
		System.out.println("added details of new fresher");
		return new ResponseEntity<FresherBean>(savedFresherBean,HttpStatus.CREATED);
	}
	
	//update
	@PutMapping("/Fresher/")
	public ResponseEntity<FresherBean> updateFresherDetails(@RequestBody FresherBean fresherBean)
	{
		System.out.println("inside updateFresherDetails - controller");
		FresherBean savedFresherBean = service.updateFresherDetails(fresherBean);
		System.out.println("updated");
		return new ResponseEntity<FresherBean>(savedFresherBean,HttpStatus.OK);
	}
	
	
	//get
	@GetMapping("/Fresher/{id}")
	public ResponseEntity<FresherBean> getFresherDetails(@PathVariable("id") Integer userEnteredId)
	{
		System.out.println("inside getFresherDetails - controller");
		FresherBean fb = service.getFresherDetails(userEnteredId);
		return new ResponseEntity<FresherBean>(fb,HttpStatus.OK);
	}
	
	//delete
	@DeleteMapping("/Fresher/{id}")
	public ResponseEntity<String> deleteFresherDetails(@PathVariable("id") Integer userEnteredId)
	{
		System.out.println("inside deleteFresherDetails - controller");
		Integer noOfRowsUpdated = service.deleteFresherDetails(userEnteredId);
		return new ResponseEntity<String>("no of rows updated "+noOfRowsUpdated,HttpStatus.GONE);
	}
	
	//getAll
	@GetMapping("/Fresher/")
	public ResponseEntity<List<FresherBean>> getAllFreshers()
	{
		System.out.println("inside get All Freshers");
		List<FresherBean> list = service.getAllFresher();
		System.out.println(list);
		return new ResponseEntity<List<FresherBean>>(list,HttpStatusCode.valueOf(200));
	}
	
	//content will be sent based on user input - json or xml 
	//by default we will make it xml
	@GetMapping("Fresher/format:{type}")
	public ResponseEntity<List<FresherBean>> getAllFreshers2(@PathVariable("type") String formatType)
	{
		System.out.println("inside get All Freshers");
		List<FresherBean> list = service.getAllFresher();
		if(formatType.equalsIgnoreCase("json"))
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(list);
		else if(formatType.equalsIgnoreCase("xml"))
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_XML).body(list);
		else
			return ResponseEntity.ok().contentType(MediaType.APPLICATION_XML).body(list);		
	}
}
