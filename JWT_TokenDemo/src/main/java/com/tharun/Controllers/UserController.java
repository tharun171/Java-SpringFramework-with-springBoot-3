package com.tharun.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tharun.Entity.UsersEntity;
import com.tharun.ServiceDTO.UserEntityService;
import com.tharun.config.JwtService;

@RestController
public class UserController {
	
	@Autowired
	private UserEntityService userService;
	
	@Autowired
	private JwtService jwtService;
	
	//Getting from security config
	@Autowired
	AuthenticationManager authManager;

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
	
	@GetMapping("/users")
	public List<UsersEntity> getAll()
	{
		return userService.getAll();
	}
	
	
	@PostMapping("/login")
	public String login(@RequestBody UsersEntity user)
	{
		System.out.println("inside login");
		Authentication authentication = authManager
				.authenticate(
						new UsernamePasswordAuthenticationToken(user.getUsername(),user.getPassword()));
		
		if(authentication.isAuthenticated())
			return jwtService.generateToken(user.getUsername());
		else
			return "Login Failed";
	}
}
