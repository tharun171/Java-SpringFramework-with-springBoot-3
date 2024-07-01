package com.tharun.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tharun.Entity.UsersEntity;
import com.tharun.ServiceDTO.UserEntityService;

@RestController
public class UserController {
	
	@Autowired
	private UserEntityService userService;

	@PostMapping("/register")
	public UsersEntity register(@RequestBody
			UsersEntity user)
	{
		return userService.saveUser(user);
	}
	
	
	@GetMapping("/user/{id}")
	public UsersEntity getUserById(@PathVariable("id") Integer id)
	{
		return userService.getUserById(id);
	}
}
